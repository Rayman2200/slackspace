package de.mstock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SlackspaceApplication {

  /**
   * Slackspace Entry Point.
   * 
   * @param args command line arguments
   */
  public static void main(String[] args) {
    // TODO: Start Neo4j via mvn
    SpringApplication.run(SlackspaceApplication.class, args);
  }
}
