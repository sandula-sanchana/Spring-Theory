package edu.ijse.Config;

import edu.ijse.Bean.SpringBeanOne;
import edu.ijse.Bean.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"edu.ijse.Bean"})
public class AppConfig {

    public AppConfig(){

    }
    // full mode -using @bean methods inside a @configuration class
    @Bean
    public SpringBeanOne springBeanOne(){
//        SpringBeanTwo springBeanTwo1=new SpringBeanTwo();
//        SpringBeanTwo springBeanTwo2=new SpringBeanTwo(); // these are just pojo's
          SpringBeanTwo springBeanTwo1=springBeanTwo(); // inter-bean dependency
        return new SpringBeanOne();
    }
    @Bean
    public SpringBeanTwo springBeanTwo(){
        return new SpringBeanTwo();
    }
}
