package edu.ijse.config;

import edu.ijse.bean.MyConnection;
import edu.ijse.newBean.NewTestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // also a component //
@ComponentScan(basePackages = {"edu.ijse.bean","edu.ijse.newBean"})
//@ComponentScan(basePackageClasses =  {NewTestBean.class})  exact bean classes
// link components in this path and add to spring container
public class AppConfig {
  public AppConfig() {
      System.out.println("AppConfig");
  }

  @Bean
    MyConnection cc() {// this method name is app config is the bean id
      return new MyConnection();
  }
}


