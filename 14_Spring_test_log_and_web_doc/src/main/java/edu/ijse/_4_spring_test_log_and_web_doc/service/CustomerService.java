package edu.ijse._4_spring_test_log_and_web_doc.service;

import edu.ijse._4_spring_test_log_and_web_doc.dto.CustomerDTO;
import edu.ijse._4_spring_test_log_and_web_doc.entity.Customer;

import java.util.List;

public interface CustomerService {

    Customer saveCustomer(CustomerDTO dto);
    void updateCustomer(CustomerDTO dto);
    List<CustomerDTO> getAllCustomers();
    CustomerDTO getCustomer(int id);
    void deleteCustomer(int id);

}
