package edu.ijse;


import edu.ijse.bean.SpringBean;
import edu.ijse.bean.TestBean;
import edu.ijse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(); //spring container//context
       context.register(AppConfig.class); //register the app config class(inside the context)
       context.refresh();//manage lifecycle // that that the container ready to use


        SpringBean springBean1=new SpringBean();// u can use new keywords and make objects from spring bean, but there just pojo
        SpringBean springBean2=new SpringBean();
        System.out.println("springBean:"+springBean1);
        System.out.println("springBean2:"+springBean2);

        SpringBean sp1=context.getBean(SpringBean.class);// SPRING BEAN IS SINGLETON , JUST 1 FOR A CONTAINER
        SpringBean sp2=context.getBean(SpringBean.class);
        System.out.println("sp:"+sp1);
        System.out.println("sp2:"+sp2);

        //BEAN ID MADE OF CLASSNAME START WITH simple letter
        SpringBean springBean=(SpringBean) context.getBean("springBean");
        System.out.println("springBean:"+springBean);

        edu.ijse.bean.TestBean testBean =(TestBean) context.getBean("testbeanX");
        System.out.println("springBean3:"+testBean);

       context.registerShutdownHook();// It registers a shutdown hook so that when the JVM is shutting down, Spring closes the application context and releases resources properly.
    }
}