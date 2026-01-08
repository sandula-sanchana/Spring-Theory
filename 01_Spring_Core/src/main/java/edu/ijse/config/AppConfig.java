package edu.ijse.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // also a component //
@ComponentScan(basePackages = "edu.ijse.bean")// link components in this path and add to spring container
public class AppConfig {
  public AppConfig() {
      System.out.println("AppConfig");
  }
}


