package com.example.demo.Dtos;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter

public class PostRequest {
    private String content;
    private int authorId;
}
