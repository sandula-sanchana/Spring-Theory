package edu.ijse;

import edu.ijse.Bean.Boy;
import edu.ijse.Bean.Girl;
import edu.ijse.Config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

//        Girl girl=context.getBean(Girl.class);
//        girl.chat();

          Boy boy=context.getBean(Boy.class);
          boy.chatWithGirl();

        context.registerShutdownHook();
    }
}