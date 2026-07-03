package com.chat.myApp.controller;

import org.springframework.http.ResponseEntity;
import com.chat.myApp.dto.RegisterRequest;
import com.chat.myApp.dto.LoginRequest;
import com.chat.myApp.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

        System.out.println("LOGIN API HIT");

        return ResponseEntity.ok(
                authService.login(request)
        );
    }
}