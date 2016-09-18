package de.mstock.slackspace.status.control;

import de.mstock.slackspace.network.entity.ProjectRepository;
import de.mstock.slackspace.status.boundary.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatusFactory {
  
  @Autowired
  private ProjectRepository projectRepository;

  /**
   * Creates a default {@link Status} object.
   * 
   * @return status
   */
  public Status createStatus() {
    Status status = new Status();
    status.setProjects(projectRepository.findAll());
    return status;
  }

}
