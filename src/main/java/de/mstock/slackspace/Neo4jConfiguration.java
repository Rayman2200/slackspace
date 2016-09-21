package de.mstock.slackspace;

import org.apache.commons.lang3.StringUtils;
import org.neo4j.ogm.config.Configuration;
import org.neo4j.ogm.session.SessionFactory;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Neo4jConfiguration {

  /**
   * Neo4j Configuration used for {@link SessionFactory}.
   * 
   * @return configuration
   */
  @Bean
  @SuppressWarnings("PMD.AvoidUsingHardCodedIP")
  public Configuration getConfiguration() {
    String ip = StringUtils.defaultIfEmpty(System.getenv("DOCKER_HOST_IP"), "localhost");
    Configuration config = new Configuration();
    config.driverConfiguration()
        .setDriverClassName("org.neo4j.ogm.drivers.http.driver.HttpDriver")
        .setURI("http://" + ip + ":7474");
    return config;
  }

  /**
   * Provides {@link SessionFactory}.
   * 
   * @return session factory
   */
  @Bean
  public SessionFactory getSessionFactory() {
    return new SessionFactory(getConfiguration(), "de.mstock.slackspace");
  }

}
