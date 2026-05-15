package com.codingshuttleproject.lovableclone.dto.member;

import com.codingshuttleproject.lovableclone.enums.ProjectRole;
import jakarta.validation.constraints.NotNull;

public record UpdateMemberRoleRequest(
        @NotNull ProjectRole role) {
}
