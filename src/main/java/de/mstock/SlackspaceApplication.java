package de.mstock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SlackspaceApplication {

  public static void main(String[] args) {
    // TODO: Start Neo4j via mvn
    // Sonar in mvn build
    SpringApplication.run(SlackspaceApplication.class, args);
  }
}
