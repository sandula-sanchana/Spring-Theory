package edu.ijse.Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Boy {

            @Autowired
            Girl girl;

            Boy(){
                System.out.println("boy created");
            }

            public void chatWithGirl(){
                girl.chat();
            }

}
