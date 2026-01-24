package edu.ijse.Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanThree {

    SpringBeanThree(){
        System.out.println("bean 3");
    }
    //light-mode
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
