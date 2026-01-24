package edu.ijse.Bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Girl2 implements Agreement{
    public Girl2(){
        System.out.println("girl 2 created");
    }
    @Override
    public void chat() {
        System.out.println("girl 2 chat");
    }
}
