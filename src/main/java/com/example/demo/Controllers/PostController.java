package com.example.demo.Controllers;

import com.example.demo.Dtos.PostRequest;
import com.example.demo.Dtos.PostResponse;
import com.example.demo.Mapper.PostMapper;
import com.example.demo.Models.Post;
import com.example.demo.Models.User;
import com.example.demo.Services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    private PostService postService;
    @Autowired
    private PostMapper postMapper;
    @PostMapping("/create")
    public PostResponse createPost(@RequestBody PostRequest postRequest) {
        Post createdPost = postService.createPost(postRequest);
        return postMapper.postToPostResponse(createdPost);
        /*Post post = new Post();
        post.setAuthor(postRequest.;
        user.setEmail(userRequest.getEmail());
        user.setPassword(userRequest.getPassword());
        User savedPost = userService.saveUser(user);
        return new ResponseEntity<>(savedPost, HttpStatus.CREATED);*/
    }

    @GetMapping("/all")
    public List<PostResponse> getAllPosts()
    {
        return postService.getAllPosts();
    }
}
