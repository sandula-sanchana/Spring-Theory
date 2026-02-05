package edu.ijse.backend.service;

import edu.ijse.backend.dto.CustomerDTO;

public interface CustomerInterface {
    public void  saveCustomer(CustomerDTO customerDTO);

    public void  updateCustomer(CustomerDTO customerDTO);
}
