package edu.ijse.Bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Properties;

@Component
public class SpringBeanOne implements InitializingBean {

    @Value("${db.name}")
    private String db;
    @Value("${db.user}")
    private String user;
    private String password;
    private String url;


    SpringBeanOne(){
        System.out.println( db + " " + user);
    }


//    System variables - (os related variables)
//    Map<String,String> sv=System.getenv();

//    Java properties - (java related variables)
//    Resource bundles(.env,.properties,.yml,.yaml) -application related

    public static void main(String[] args) {
//        Map<String,String> sv=System.getenv();
//        System.out.println(sv);

//        Properties properties=System.getProperties();
//        for(Object key :properties.keySet()){
//            System.out.println(key + ":" +properties.get(key));
//        }
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println( db + " " + user);
    }
}
