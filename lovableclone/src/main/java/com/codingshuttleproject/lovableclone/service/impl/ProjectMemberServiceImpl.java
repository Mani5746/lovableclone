package com.codingshuttleproject.lovableclone.service.impl;

import com.codingshuttleproject.lovableclone.dto.member.InviteMemberRequest;
import com.codingshuttleproject.lovableclone.dto.member.MemberResponse;
import com.codingshuttleproject.lovableclone.entity.ProjectMember;
import com.codingshuttleproject.lovableclone.repository.ProjectMemberRepository;
import com.codingshuttleproject.lovableclone.service.ProjectMemberService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@FieldDefaults(makeFinal = true,level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class ProjectMemberServiceImpl implements ProjectMemberService {
    ProjectMemberRepository projectMemberRepository;
    @Override
    public List<ProjectMember> getProjectMembers(Long projectId, Long userId) {
        return null;
    }

    @Override
    public MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId) {
        // TODO: implement invite member logic
        return null;
    }

    @Override
    public MemberResponse updateMemberRole(Long projectId, Long memberId, InviteMemberRequest request, Long userId) {
        // TODO: implement update member role logic
        return null;
    }

    @Override
    public MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId) {
        // TODO: implement delete project member logic
        return null;
    }
}
