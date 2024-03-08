package com.dep.myapp.persistence.repository.impl;
import com.dep.myapp.persistence.model.Project;
import com.dep.myapp.persistence.repository.IProjectRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class ProjectRepository implements IProjectRepository{
    List<Project> projectList = new ArrayList<>();
    public ProjectRepository() {
        super();
    }

    @Override
    public Optional<Project> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Collection<Project> findAll() {
        return null;
    }

    @Override
    public Project save(Project project) {
        return null;
    }
}
