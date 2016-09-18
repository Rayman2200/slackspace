package de.mstock.slackspace;

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
  public Configuration getConfiguration() {
    Configuration config = new Configuration();
    config.driverConfiguration()
        .setDriverClassName("org.neo4j.ogm.drivers.embedded.driver.EmbeddedDriver");
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
