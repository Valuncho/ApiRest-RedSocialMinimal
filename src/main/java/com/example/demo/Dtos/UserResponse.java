package com.example.demo.Dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class UserResponse {
    private Long UserId;
    private String UserName;
    private String Email;
    private String Password;
}
