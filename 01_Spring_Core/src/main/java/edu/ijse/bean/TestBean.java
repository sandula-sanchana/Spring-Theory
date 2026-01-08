package edu.ijse.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("testbeanX")// to change the bean id
@Scope("prototype")// this bean is not added to the container, its only called when requested
public class TestBean {

    public TestBean() {
        System.out.println("TestBean");
    }

    public void printMsg() {
        System.out.println("printMsg");
    }
}
