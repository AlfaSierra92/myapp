package com.dep.myapp.service;

import java.util.Collection;
import java.util.Optional;

import com.dep.myapp.persistence.model.Project;

public interface IProjectService {
    Optional<Project> findById(Long id);

    Collection<Project> findAll();

    Project save(Project project);
}
