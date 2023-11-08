package com.example.demo.Dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class PostRequest {
    private String content;
    private Long authorId;
}
