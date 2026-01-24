package edu.ijse.Config;

import edu.ijse.Bean.A;
import edu.ijse.Bean.C;
import edu.ijse.Bean.D;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig2 {

    AppConfig2(){
        System.out.println("config 2 started");
    }

    @Bean
    public C c(){
        return new C();
    }

    @Bean
    public D d(){
        return new D();
    }
}
