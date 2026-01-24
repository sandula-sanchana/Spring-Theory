package edu.ijse.Config;

import edu.ijse.Bean.SpringBean;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "edu.ijse.Bean")
@Import({AppConfig1.class,AppConfig2.class})
@ImportResource("classpath:hibernate.cfg.xml")// if file in class path
//@ImportResource("file:hibernate.cfg.xml") // os path
public class AppConfig {

    public AppConfig() {
        System.out.println("main config started");
    }

    @Bean
    public SpringBean springBean(){
        return new SpringBean();
    }
}
