package edu.ijse;


import edu.ijse.bean.SpringBean;
import edu.ijse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        SpringBean springBean1=context.getBean(SpringBean.class);
        System.out.println("springBean1:"+springBean1);

        context.registerShutdownHook();


        //singleton-one instance,shared,stateless,thread safe,faster,lower mamery use,creation and destroy managed by spring
        //prototype-per request,sloweer, only creation managed by spring,statefull,non theread safe beans, ,hign memory use

    }
}