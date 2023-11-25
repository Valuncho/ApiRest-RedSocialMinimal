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

    public Like darMeGusta(User user, Post post) {
        if (tieneMeGusta(user, post)){
        Like like = new Like();
        like.setUser(user);
        like.setPost(post);
        return likeRepository.save(like);
        } else {
            // Use RunTimeException para no tener que personalizar una expecicion
            throw new RuntimeException("El usuario ya le dio Me gusta");
        }
    }
    private boolean tieneMeGusta(User user, Post post){
        return likeRepository.existsByUserAndPost(user,post);
    }
}

