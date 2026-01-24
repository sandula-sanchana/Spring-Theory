package edu.ijse.Config;

import edu.ijse.Bean.SpringBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "edu.ijse.Bean")
@Import({AppConfig1.class,AppConfig2.class})
public class AppConfig {

    public AppConfig() {
        System.out.println("main config started");
    }

    @Bean
    public SpringBean springBean(){
        return new SpringBean();
    }
}
