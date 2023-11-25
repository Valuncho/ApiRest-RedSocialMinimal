package com.example.demo.Controllers;

import com.example.demo.Dtos.LikeRequest;

import com.example.demo.Mapper.LikeMapper;
import com.example.demo.Models.Like;
import com.example.demo.Models.Post;
import com.example.demo.Models.User;
import com.example.demo.Repositories.PostRepository;
import com.example.demo.Repositories.UserRepository;
import com.example.demo.Services.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.NotFoundException;

@RestController
@RequestMapping("api/likes")
public class LikeController {
    @Autowired
    private LikeMapper likeMapper;
    @Autowired
    private LikeService likeService;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PostRepository postRepository;

    @PostMapping("/darMeGusta")
    public ResponseEntity<Like> darMeGusta(@RequestBody LikeRequest likeRequest){
        User user = userRepository.findById(likeRequest.getUserId())
                // tuve que usar esto porque JPA el findById te devuelve un optional(sirve para manejar mejor en caso de que no se encuentre en la DB el obj)
                .orElseThrow(() -> new NotFoundException("Usuario no encontrado"));
        Post post = postRepository.findById(likeRequest.getPostId())
                .orElseThrow(() -> new NotFoundException("Publicación no encontrada"));
        Like like = likeService.darMeGusta (user, post);
        return new ResponseEntity<>(like, HttpStatus.CREATED);
    }
}
