package com.example.demo.Mapper;

import com.example.demo.Dtos.LikeRequest;
import com.example.demo.Dtos.LikeResponse;
import com.example.demo.Models.Like;
import com.example.demo.Models.Post;
import com.example.demo.Models.User;
import com.example.demo.Services.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikeMapper {

    @Autowired
    private LikeService likeService;

    public Like likeRequestToLike(LikeRequest likeRequest, User user, Post post) {
        Like like = new Like();
        like.setUser(user);
        like.setPost(post);
        return like;
    }

    public LikeResponse mapEntityToResponse(Like like) {
        LikeResponse response = new LikeResponse();
        response.setLikeId(like.getLikeId());
        return response;
    }
}
