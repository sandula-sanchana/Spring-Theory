package edu.ijse.backend.controller;


import edu.ijse.backend.dto.CustomerDTO;
import edu.ijse.backend.service.CustomerInterface;
import edu.ijse.backend.service.CustomerServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    private final CustomerInterface customerService;

    public CustomerController(CustomerServiceImpl customerServiceimpl) {
        this.customerService = customerServiceimpl;
    }

    @PostMapping
    public void saveCustomer(@RequestBody CustomerDTO customerDTO){
        System.out.println("save customer");
        customerService.saveCustomer(customerDTO);

    }

}

