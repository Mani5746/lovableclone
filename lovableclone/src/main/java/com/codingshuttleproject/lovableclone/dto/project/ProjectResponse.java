package com.codingshuttleproject.lovableclone.dto.project;

import com.codingshuttleproject.lovableclone.dto.auth.UserProfileResponse;

import java.time.Instant;

public record ProjectResponse(Long id,
                              String name,
                              Instant createdAt,
                              Instant updatedAt,
                              UserProfileResponse owner) {

}
