package com.example.demo.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// te odio entity
@Entity
@Table(name = "likes")
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long likeId;
    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private User user;
    @ManyToOne
    @JoinColumn(name = "postId", nullable = false)
    private Post post;
}
