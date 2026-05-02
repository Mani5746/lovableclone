package com.codingshuttleproject.lovableclone.service.impl;

import com.codingshuttleproject.lovableclone.dto.project.ProjectRequest;
import com.codingshuttleproject.lovableclone.dto.project.ProjectResponse;
import com.codingshuttleproject.lovableclone.dto.project.ProjectSummaryResponse;
import com.codingshuttleproject.lovableclone.entity.Project;
import com.codingshuttleproject.lovableclone.entity.User;
import com.codingshuttleproject.lovableclone.mapper.ProjectMapper;
import com.codingshuttleproject.lovableclone.repository.ProjectRepository;
import com.codingshuttleproject.lovableclone.repository.UserRepository;
import com.codingshuttleproject.lovableclone.service.ProjectService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true,level = AccessLevel.PRIVATE)
@Transactional
public class ProjectServiceImpl implements ProjectService {

    ProjectRepository projectRepository;
    UserRepository userRepository;
    ProjectMapper projectMapper;
    @Override
    public List<ProjectSummaryResponse> getUserProjects(Long userId) {
        // TODO: implement get user projects logic
        return null;
    }

    @Override
    public ProjectResponse getUserProjectById(Long id, Long userId) {
        // TODO: implement get project by id logic
        return null;
    }

    @Override
    public ProjectResponse createProject(ProjectRequest request, Long userId) {
    User owner=userRepository.findById(userId).orElseThrow();
        Project project=Project.builder()
                .name(request.name())
                .owner(owner)
                .isPublic(false)
                .build();
     project=projectRepository.save(project);

     return projectMapper.toProjectResponse(project);


    }

    @Override
    public ProjectResponse updateProject(Long id, ProjectRequest request, Long userId) {
        // TODO: implement update project logic
        return null;
    }

    @Override
    public void softDelete(Long id, Long userId) {
        // TODO: implement soft delete logic
    }
}
