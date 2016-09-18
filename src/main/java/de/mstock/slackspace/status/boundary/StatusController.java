package de.mstock.slackspace.status.boundary;

import de.mstock.slackspace.status.control.StatusFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

  @Autowired
  private StatusFactory statusFactory;

  @RequestMapping(path = "/")
  public Status getStatus() {
    return statusFactory.createStatus();
  }

}
