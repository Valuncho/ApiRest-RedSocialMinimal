package com.example.demo.Dtos;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter

public class PostResponse {
    private int PostId;
    private String content;
    private LocalDateTime publicationDate;
    private int authorId;
}
