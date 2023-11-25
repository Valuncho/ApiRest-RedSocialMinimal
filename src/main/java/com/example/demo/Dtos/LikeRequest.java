package com.example.demo.Dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class LikeRequest {
    private long userId;
    private long postId;
}
