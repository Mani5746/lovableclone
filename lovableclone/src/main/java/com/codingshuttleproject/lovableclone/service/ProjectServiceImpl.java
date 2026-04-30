package com.codingshuttleproject.lovableclone.service;

import com.codingshuttleproject.lovableclone.dto.project.ProjectRequest;
import com.codingshuttleproject.lovableclone.dto.project.ProjectResponse;
import com.codingshuttleproject.lovableclone.dto.project.ProjectSummaryResponse;
import com.codingshuttleproject.lovableclone.service.impl.ProjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

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
        // TODO: implement create project logic
        return null;
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
