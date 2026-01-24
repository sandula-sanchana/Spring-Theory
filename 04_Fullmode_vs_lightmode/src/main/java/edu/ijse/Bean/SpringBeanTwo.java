package edu.ijse.Bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringBeanTwo implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean, ApplicationContextAware {

    public SpringBeanTwo(){
        System.out.println("bean 2 created");
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("factory 2");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("name aware 2");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy 2");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("bean initialize 2");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application context aware 2");
    }

}
