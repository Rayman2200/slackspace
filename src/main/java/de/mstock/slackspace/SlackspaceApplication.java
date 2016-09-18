package de.mstock.slackspace;

import de.mstock.slackspace.network.entity.Project;
import de.mstock.slackspace.network.entity.ProjectRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SlackspaceApplication {

  /**
   * Slackspace Entry Point.
   * 
   * @param args command line arguments
   */
  public static void main(String[] args) {
    SpringApplication.run(SlackspaceApplication.class, args); // NOSONAR
  }

  @Bean
  CommandLineRunner demo(ProjectRepository projectRepository) {
    return args -> {
      Project slackspace = new Project("Slackspace");
      projectRepository.save(slackspace);
    };
  }
}
