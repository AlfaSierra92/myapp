package com.dep.myapp.persistence.model;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Random;
import java.util.UUID;

public class Project {
    Long id;
    String name;
    UUID secondaryID;
    LocalDate dateCreated;

    public Project(Long id, String name, LocalDate dateCreated) {
        if(Objects.nonNull(id)){
            this.id = id;
        }else{
            this.id = new Random().nextLong();
        }
        this.name = name;
        this.dateCreated = dateCreated;
    }

    public Project(String name, LocalDate dateCreated) {
        this.id = null;
        this.name = name;
        this.dateCreated = dateCreated;
    }

    public Project(Project project) {
        this(project.id, project.name, project.dateCreated);
    }


    // getters, setters, equals, hashCode
    // .................
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return Objects.equals(id, project.id) && Objects.equals(name, project.name) && Objects.equals(dateCreated, project.dateCreated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dateCreated);
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
