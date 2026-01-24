package edu.ijse.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"edu.ijse.Bean"})
public class AppConfig {

    public AppConfig(){

    }
}
