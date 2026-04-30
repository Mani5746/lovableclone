package com.codingshuttleproject.lovableclone.service;

import com.codingshuttleproject.lovableclone.dto.auth.UserProfileResponse;
import com.codingshuttleproject.lovableclone.service.impl.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserProfileResponse getProfile(Long userId) {
        // TODO: implement get profile logic
        return null;
    }
}
