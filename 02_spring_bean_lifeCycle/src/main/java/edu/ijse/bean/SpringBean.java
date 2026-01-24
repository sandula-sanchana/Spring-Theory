package edu.ijse.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") // if u add this we cant see the destroy part, cause after use the bean is stored outside of the context inside heap , later will be cleared by the gc
public class SpringBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware , DisposableBean {
    public SpringBean() {
        System.out.println("spring bean CREATED");//instantiation
    }

    // no method for populate properties
    @Override
    public void setBeanName(String name) {
        System.out.println("setBeanName");// name aware
    }
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory"); //bean factory aware
    }



    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
       System.out.println("setApplicationContext");// application context aware
    }

    @Override
    public void destroy() throws Exception {
       System.out.println("destroy");//disposable bean // cant see this cause u need to add shut down hook
    }
}
