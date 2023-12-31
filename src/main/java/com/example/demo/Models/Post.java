package com.example.demo.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter

@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int postId;
    private String content;
    private LocalDateTime publicationDate;

    @ManyToOne // se utiliza para definir y mapear relaciones "muchos a uno" funcina como una clave foranea
    private User author; // usuario que publico

    @OneToMany(mappedBy = "post")
    private List<Like> likes;
}

