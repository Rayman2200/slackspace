package de.mstock.slackspace.network.entity;

import org.springframework.data.neo4j.repository.GraphRepository;

import java.util.List;

public interface ProjectRepository extends GraphRepository<Project> {

  @Override
  List<Project> findAll();
  
}
