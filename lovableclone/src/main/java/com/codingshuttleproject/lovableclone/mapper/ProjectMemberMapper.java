package com.codingshuttleproject.lovableclone.mapper;


import com.codingshuttleproject.lovableclone.dto.member.MemberResponse;
import com.codingshuttleproject.lovableclone.entity.ProjectMember;
import com.codingshuttleproject.lovableclone.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProjectMemberMapper {

    @Mapping(target="userId", source = "id")
    @Mapping(target="projectRole", constant = "OWNER")
    MemberResponse toProjectMemberResponseFromOwner(User user);

    MemberResponse toProjectMemeberResponseFromMember(ProjectMember projectMember);

}
