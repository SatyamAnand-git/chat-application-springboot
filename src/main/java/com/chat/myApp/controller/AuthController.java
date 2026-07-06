package com.chat.myApp.controller;

import com.chat.myApp.dto.LoginRequest;
import com.chat.myApp.dto.RegisterRequest;
import com.chat.myApp.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;
    @PostMapping("/register")
    public String register(
            @Valid @RequestBody RegisterRequest request) {
        return authService.register(request);
    }
    @PostMapping("/login")
    public ResponseEntity<String> login(
            @RequestBody LoginRequest request) {
        return ResponseEntity.ok(
                authService.login(request)
        );
    }
}