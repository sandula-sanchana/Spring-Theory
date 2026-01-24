package edu.ijse.Bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne {

    @Autowired(required = false)
    public SpringBeanOne(@Value("sandula")String name,@Value("22")int age,@Value("ijse") String address){
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
    }
    @Autowired(required = false)
    public SpringBeanOne(@Value("sanchana")String [] nameList){
        System.out.println(nameList);
    }


    // choose one with more count, if same use one spring chooses

}
