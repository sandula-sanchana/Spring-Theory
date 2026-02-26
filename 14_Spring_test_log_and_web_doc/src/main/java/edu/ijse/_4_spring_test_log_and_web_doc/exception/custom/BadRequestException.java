package edu.ijse._4_spring_test_log_and_web_doc.exception.custom;

public class BadRequestException extends  RuntimeException{

    public BadRequestException(String msg){
        super(msg);
    }
}
