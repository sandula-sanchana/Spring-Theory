package edu.ijse._4_spring_test_log_and_web_doc.service;

import edu.ijse._4_spring_test_log_and_web_doc.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {

    void saveCustomer(CustomerDTO dto);
    void updateCustomer(CustomerDTO dto);
    List<CustomerDTO> getAllCustomers();
    CustomerDTO getCustomer(int id);
    void deleteCustomer(int id);

}
