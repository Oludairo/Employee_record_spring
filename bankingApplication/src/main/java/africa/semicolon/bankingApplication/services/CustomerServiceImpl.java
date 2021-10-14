package africa.semicolon.bankingApplication.services;

import africa.semicolon.bankingApplication.data.models.Customer;
import africa.semicolon.bankingApplication.data.repositories.CustomerRepository;
import africa.semicolon.bankingApplication.data.repositories.CustomerRepositoryImpl;
import africa.semicolon.bankingApplication.dtos.responses.CustomerResponse;

import java.util.*;
import java.util.ArrayList;

public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository = new CustomerRepositoryImpl();


    @Override
    public List<CustomerResponse> findAll() {
        List<CustomerResponse> responses = new ArrayList<>();
        List<Customer> ourRealCustomers = customerRepository.findAll();
        for (Customer customer: ourRealCustomers){
            responses.add(new CustomerResponse(customer));
        }
//        ourRealCustomers.forEach(customer1 -> responses.add(new CustomerResponse(customer)));// Lambda---The same with the for loop
        return responses;
    }
}
