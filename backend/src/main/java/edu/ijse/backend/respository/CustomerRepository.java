package edu.ijse.backend.respository;


import edu.ijse.backend.dto.CustomerDTO;
import edu.ijse.backend.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,String> {


}
