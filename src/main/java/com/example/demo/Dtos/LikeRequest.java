package com.example.demo.Dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class LikeRequest {
    private Integer userId;
    private Integer postId;
}
