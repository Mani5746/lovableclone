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

import java.time.Instant;
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

        var projects=projectRepository.findAllAccessibleByUser(userId);
        return projectMapper.toListOfProjectSummaryResponse(projects);
    }

    @Override
    public ProjectResponse getUserProjectById(Long id, Long userId) {
        Project project =getAccessibleProjectById(id,userId);
       return projectMapper.toProjectResponse(project);
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
         Project project =getAccessibleProjectById(id,userId);
        if(!project.getOwner().getId().equals(userId)){
            throw new RuntimeException("You are not allowed to update");
        }
         project.setName(request.name());
        project=projectRepository.save(project);
        return projectMapper.toProjectResponse(project);
    }

    @Override
    public void softDelete(Long id, Long userId) {
        Project project =getAccessibleProjectById(id,userId);
        if(!project.getOwner().getId().equals(userId)){
            throw new RuntimeException("You are not allowed to delete");
        }
        project.setDeletedAt(Instant.now());
        projectRepository.save(project);
    }

    public Project getAccessibleProjectById(Long projectId,Long userId){
        return projectRepository.findAccessibleProjectById(projectId,userId).orElseThrow();
    }
}
