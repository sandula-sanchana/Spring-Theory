package edu.ijse.backend.service;

import edu.ijse.backend.dto.CustomerDTO;
import edu.ijse.backend.entity.Customer;
import edu.ijse.backend.respository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerServiceImpl implements CustomerInterface {


    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void saveCustomer(CustomerDTO customerDTO){
        System.out.println("customerService.saveCustomer");
        customerRepository.save(new Customer(customerDTO.getId(),customerDTO.getName(),customerDTO.getAddress()));
    }


}
