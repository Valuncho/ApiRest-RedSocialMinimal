package com.example.demo.Repositories;

import com.example.demo.Models.Like;
import com.example.demo.Models.Post;
import com.example.demo.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LikeRepository extends JpaRepository<Like, Integer> {
    boolean existsByUserAndPost(User user, Post post);
    // El optional es porque puede ser o no vacio y encontrar el "me gusta
    //Optional<Like> findByUserAndPost(User user, Post post);
}
