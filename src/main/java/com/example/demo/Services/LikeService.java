package com.example.demo.Services;

import com.example.demo.Models.Like;
import com.example.demo.Models.Post;
import com.example.demo.Models.User;
import com.example.demo.Repositories.LikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikeService {
    @Autowired
    private LikeRepository likeRepository;

    public void darMeGusta(User user, Post post) {
        if (tieneMeGusta(user, post)){
        Like like = new Like();
        like.setUser(user);
        like.setPost(post);
        likeRepository.save(like);
        }
    }
    private boolean tieneMeGusta(User user, Post post){
        return likeRepository.existsByUserAndPost(user,post);
    }
}

