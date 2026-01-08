package edu.ijse.bean;

import org.springframework.stereotype.Component;

@Component("testbeanX")// to change the bean id
public class TestBean {

    public TestBean() {
        System.out.println("TestBean");
    }

    public void printMsg() {
        System.out.println("printMsg");
    }
}
