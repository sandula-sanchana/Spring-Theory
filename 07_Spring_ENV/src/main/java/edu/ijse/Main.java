package edu.ijse;

import edu.ijse.Config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();


        context.registerShutdownHook();
    }
}