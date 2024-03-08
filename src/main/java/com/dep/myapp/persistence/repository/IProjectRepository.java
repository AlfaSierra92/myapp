package com.dep.myapp.persistence.repository;

import com.dep.myapp.persistence.model.Project;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Stream;

public interface IProjectRepository {
    Optional<Project> findById(Long id);

    Collection<Project> findAll();

    Project save(Project project);
}
