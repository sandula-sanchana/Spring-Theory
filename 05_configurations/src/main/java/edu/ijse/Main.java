package edu.ijse;

import edu.ijse.Config.AppConfig;
import edu.ijse.Config.AppConfig1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.register(AppConfig1.class);
        context.refresh();


        context.registerShutdownHook();
    }
}