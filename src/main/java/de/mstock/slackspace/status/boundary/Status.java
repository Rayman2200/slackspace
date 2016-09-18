package de.mstock.slackspace.status.boundary;

import de.mstock.slackspace.network.entity.Project;

import java.util.List;

public class Status {

  private boolean running = true;
  
  private List<Project> projects;

  public boolean isRunning() {
    return running;
  }

  public void setRunning(boolean running) {
    this.running = running;
  }

  public List<Project> getProjects() {
    return projects;
  }

  public void setProjects(List<Project> projects) {
    this.projects = projects;
  }

}
