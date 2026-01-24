package edu.ijse.Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Boy {

            @Autowired// auto resolve DI
            @Qualifier("girl") //for reference side
            Agreement agreement;

            Boy(){
                System.out.println("boy created");
            }

            public void chatWithGirl(){
                agreement.chat();
            }

}
