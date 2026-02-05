package edu.ijse.backend.service;

import edu.ijse.backend.dto.CustomerDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Service
public class CustomerService implements CustomerInterface {

    public void saveCustomer(CustomerDTO customerDTO){
        System.out.println("customerService.saveCustomer");
    }
}
