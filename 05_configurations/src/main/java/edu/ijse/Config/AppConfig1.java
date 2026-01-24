package edu.ijse.Config;

import edu.ijse.Bean.A;
import edu.ijse.Bean.B;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig1 {

    AppConfig1(){
        System.out.println("config 1 started");
    }

    @Bean
    public A a(){
        return new A();
    }
    @Bean
    public B b(){
        return new B();
    }
}
