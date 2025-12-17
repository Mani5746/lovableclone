package com.codingshuttleproject.lovableclone.dto.member;

import com.codingshuttleproject.lovableclone.enums.ProjectRole;

import java.time.Instant;

public record MemberResponse (
        Long userId,
        String email,
        String name,
        String avatarUrl,
        ProjectRole role,
        Instant invitedAt

){
}
