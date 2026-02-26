package edu.ijse._4_spring_test_log_and_web_doc.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {
  @Bean
  public ModelMapper modelMapper() {
      return new ModelMapper();
  }
}
