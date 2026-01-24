package edu.ijse.Config;

import edu.ijse.Bean.SpringBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"edu.ijse.Bean"})
public class AppConfig {

    public AppConfig() {

    }
}
