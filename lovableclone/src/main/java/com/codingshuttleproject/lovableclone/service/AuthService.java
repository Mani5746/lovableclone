package com.codingshuttleproject.lovableclone.service;

import com.codingshuttleproject.lovableclone.dto.auth.AuthResponse;
import com.codingshuttleproject.lovableclone.dto.auth.LoginRequest;
import com.codingshuttleproject.lovableclone.dto.auth.SignupRequest;

public interface AuthService {
     AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}
