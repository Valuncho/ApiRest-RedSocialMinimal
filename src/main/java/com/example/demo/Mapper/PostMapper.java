package com.example.demo.Mapper;

import com.example.demo.Dtos.PostRequest;
import com.example.demo.Dtos.PostResponse;
import com.example.demo.Models.Post;
import com.example.demo.Models.User;
import com.example.demo.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PostMapper {
    //@Autowired
    private PostMapper postMapper;
    //@Autowired
    private UserService userService;
    public Post postRequestToPost(PostRequest postRequest) {
        Post post = new Post();
        post.setContent(postRequest.getContent());
        post.setPublicationDate(LocalDateTime.now());
        User author = userService.getById(postRequest.getAuthorId());
        post.setAuthor(author);
        return post;
    }
    public PostResponse postToPostResponse(Post post) {
        PostResponse postResponse = new PostResponse();
        postResponse.setPostId(post.getPostId());
        postResponse.setContent(post.getContent());
        postResponse.setPublicationDate(post.getPublicationDate());
        postResponse.setAuthorId(Math.toIntExact(post.getAuthor().getUserId())); // convierte de long a int

        return postResponse;
    }
}
