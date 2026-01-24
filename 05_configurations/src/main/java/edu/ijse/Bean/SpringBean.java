package edu.ijse.Bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class SpringBean{

    public SpringBean(){
        System.out.println("Spring bean started");
    }

//    @Override
//    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
//        System.out.println("factory");
//    }
//
//    @Override
//    public void setBeanName(String name) {
//        System.out.println("name aware");
//    }
//
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("destroy");
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("bean initialize");
//    }
//
//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        System.out.println("Application context aware");
//    }
}
