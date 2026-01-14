package ru.coffeetox.cfx.dto.auth;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class LoginRequest {
    @NotBlank(message="Username is required")
    private String username;

    @NotEmpty(message="Password is required")
    private String password;

}
