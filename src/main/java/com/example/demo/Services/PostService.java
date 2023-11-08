package com.example.demo.Services;

import com.example.demo.Dtos.PostRequest;
import com.example.demo.Dtos.PostResponse;
import com.example.demo.Mapper.PostMapper;
import com.example.demo.Models.Post;
import com.example.demo.Repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private PostMapper postMapper;

    public Post createPost(PostRequest postRequest) {
        Post post = postMapper.postRequestToPost(postRequest);
        return postRepository.save(post);
    }

    public List<PostResponse> getAllPosts() {
        List<Post> posts = postRepository.findAll();
        return posts.stream()
                .map(postMapper::postToPostResponse)
                .collect(Collectors.toList());
    }

    public PostResponse getPostById(Long postId) {
        Post post = postRepository.findById(postId)
                .orElseThrow(() -> new RuntimeException("Post not found with id: " + postId));
        return postMapper.postToPostResponse(post);
    }

}

