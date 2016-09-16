package de.mstock.status.boundary;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

  @RequestMapping(path = "/")
  public Status getStatus() {
    // TODO: Query Neo4j
    return new Status();
  }

}
