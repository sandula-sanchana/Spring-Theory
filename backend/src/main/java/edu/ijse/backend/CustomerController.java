package edu.ijse.backend;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    @PostMapping
    public void saveCustomer(@RequestBody CustomerDTO customerDTO){
        System.out.println("save customer");
        System.out.println(customerDTO.getId());
        System.out.println(customerDTO.getName());
        System.out.println(customerDTO.getAddress());
    }

}

