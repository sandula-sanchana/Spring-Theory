package edu.ijse.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"edu.ijse.Bean"})
@PropertySource("classpath:application.properties")
public class AppConfig {

    public AppConfig(){

    }
}
