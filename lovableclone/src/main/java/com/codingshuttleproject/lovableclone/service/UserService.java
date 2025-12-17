package com.codingshuttleproject.lovableclone.service;

import com.codingshuttleproject.lovableclone.dto.auth.UserProfileResponse;

public interface UserService {

    UserProfileResponse getProfile(Long userId);
}
