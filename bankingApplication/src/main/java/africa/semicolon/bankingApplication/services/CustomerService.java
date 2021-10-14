package africa.semicolon.bankingApplication.services;

import africa.semicolon.bankingApplication.data.models.Account;
import africa.semicolon.bankingApplication.data.models.Customer;
import africa.semicolon.bankingApplication.dtos.responses.CustomerResponse;

import java.util.*;
import java.util.Collection;

public interface CustomerService {


    List<CustomerResponse> findAll();
}
