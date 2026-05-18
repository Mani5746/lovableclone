package com.codingshuttleproject.lovableclone.service;

import com.codingshuttleproject.lovableclone.dto.member.InviteMemberRequest;
import com.codingshuttleproject.lovableclone.dto.member.MemberResponse;
import com.codingshuttleproject.lovableclone.dto.member.UpdateMemberRoleRequest;
import jakarta.validation.Valid;

import java.util.List;

public interface ProjectMemberService {
    List<MemberResponse> getProjectMembers(Long projectId, Long userId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId);

     MemberResponse updateMemberRole(Long projectId, Long memberId, @Valid UpdateMemberRoleRequest request, Long userId);

    void removeProjectMember(Long projectId, Long memberId, Long userId);
}
