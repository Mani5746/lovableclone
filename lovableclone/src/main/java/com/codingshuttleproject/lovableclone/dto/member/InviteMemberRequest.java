package com.codingshuttleproject.lovableclone.dto.member;

import com.codingshuttleproject.lovableclone.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
) {


}
