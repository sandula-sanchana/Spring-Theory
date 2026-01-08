package edu.ijse.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("testbeanX")// to change the bean id
@Scope("prototype")
public class TestBean {

    public TestBean() {
        System.out.println("TestBean");
    }

    public void printMsg() {
        System.out.println("printMsg");
    }
}
