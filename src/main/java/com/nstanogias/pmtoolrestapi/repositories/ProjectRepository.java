package com.nstanogias.pmtoolrestapi.repositories;

import com.nstanogias.pmtoolrestapi.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {

    Project findByProjectIdentifier(String projectId);

    @Override
    List<Project> findAll();

    List<Project> findAllByProjectLeader(String username);
}
