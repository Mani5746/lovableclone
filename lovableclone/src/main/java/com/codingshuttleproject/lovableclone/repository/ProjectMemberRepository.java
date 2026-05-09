package com.codingshuttleproject.lovableclone.repository;

import com.codingshuttleproject.lovableclone.entity.ProjectMember;
import com.codingshuttleproject.lovableclone.entity.ProjectMemberId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectMemberRepository extends JpaRepository<ProjectMember, ProjectMemberId> {

}
