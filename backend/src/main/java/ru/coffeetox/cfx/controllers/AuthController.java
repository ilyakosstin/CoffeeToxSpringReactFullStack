package ru.coffeetox.cfx.controllers;

import jakarta.validation.Valid;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.*;
import ru.coffeetox.cfx.dto.auth.LoginRequest;
import ru.coffeetox.cfx.repositories.UserRepository;

@RestController
@RequestMapping("/auth")
@Log
public class AuthController {

    private final UserRepository userRepository;

    public AuthController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/test")
    public String test() {
        return "hello COFFEETOX";
    }

    @PostMapping("/login")
    public boolean login(@Valid @RequestBody LoginRequest request) {
        log.info("login request incoming: " + request.getUsername() + " " + request.getPassword());

        return true;
    }

}
