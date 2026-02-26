package edu.ijse._4_spring_test_log_and_web_doc.repository;

import edu.ijse._4_spring_test_log_and_web_doc.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {


}
