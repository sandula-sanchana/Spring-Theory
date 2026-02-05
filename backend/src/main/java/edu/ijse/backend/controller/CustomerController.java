package edu.ijse.backend.controller;


import edu.ijse.backend.dto.CustomerDTO;
import edu.ijse.backend.service.CustomerInterface;
import edu.ijse.backend.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    private final CustomerInterface customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public void saveCustomer(@RequestBody CustomerDTO customerDTO){
        System.out.println("save customer");
        customerService.saveCustomer(customerDTO);

    }

}

