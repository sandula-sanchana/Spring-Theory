package edu.ijse.di;

import org.springframework.stereotype.Component;

@Component
public class TestTwo implements DI{
    @Override
    public void chat() {
        System.out.println("test 2 chat");
    }
}
