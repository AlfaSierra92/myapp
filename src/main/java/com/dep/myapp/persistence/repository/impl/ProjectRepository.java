package com.dep.myapp.persistence.repository.impl;
import com.dep.myapp.persistence.model.Project;
import com.dep.myapp.persistence.repository.IProjectRepository;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Component
public class ProjectRepository implements IProjectRepository{
    private static final Logger LOG = LoggerFactory.getLogger(ProjectRepository.class);
    List<Project> projectList = new ArrayList<>();
    public ProjectRepository() {
        super();
    }

    @Override
    public Optional<Project> findById(Long id) {
        return projectList.stream().filter(p -> p.getId().equals(id)).findFirst();
        //return Optional.empty();
    }

    @Override
    public Collection<Project> findAll() {
        return null;
    }

    @Override
    public Project save(Project project) {
        Optional<Project> existingProject = findById(project.getId());
        if (existingProject.isPresent()){
            projectList.remove(existingProject);
        }
        Project newProject = new Project(project);
        projectList.add(newProject);
        return null;
    }

    @PostConstruct
    public void postConstruct(){
        LOG.info("Hello, repository is alive");
    }
}
