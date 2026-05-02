package com.codingshuttleproject.lovableclone.repository;

import com.codingshuttleproject.lovableclone.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

}
