package edu.ijse._4_spring_test_log_and_web_doc;

import edu.ijse._4_spring_test_log_and_web_doc.dto.CustomerDTO;
import edu.ijse._4_spring_test_log_and_web_doc.entity.Customer;
import edu.ijse._4_spring_test_log_and_web_doc.repository.CustomerRepository;
import edu.ijse._4_spring_test_log_and_web_doc.service.CustomerService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CustomerServiceImplTest {

    private Customer customer;
    private CustomerDTO customerDTO;

    @InjectMocks
    private CustomerService customerService;

    @Mock
    private CustomerRepository customerRepository;

    @Mock
    private ModelMapper modelMapper;


    @BeforeEach//run before test cases
    public void setUp() {
        customerDTO = new CustomerDTO(null, "testName", "testAddress");
        customer = Customer.builder()
                .cName("testName")
                .cAddress("testAddress")
                .build();

    }

    @Test
    public void saveCustomerTestCase() {
        //arrange
        when(customerRepository.save(any(Customer.class))).thenReturn(customer);
        //action
        Customer saveCus=customerService.saveCustomer(customerDTO);
        //assert methods
        Assertions.assertNotNull(saveCus);
        Assertions.assertEquals(customer, saveCus);
        verify(customerRepository, times(1)).save(customer);

    }
}
