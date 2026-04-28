package com.codingshuttleproject.lovableclone.service;

import com.codingshuttleproject.lovableclone.dto.project.FileContentResponse;
import com.codingshuttleproject.lovableclone.dto.project.FileNode;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServiceImpl implements FileService {

    @Override
    public List<FileNode> getFileTree(Long projectId, Long userId) {
        // TODO: implement get file tree logic
        return null;
    }

    @Override
    public FileContentResponse getFileContent(Long projectId, String path, Long userId) {
        // TODO: implement get file content logic
        return null;
    }
}
