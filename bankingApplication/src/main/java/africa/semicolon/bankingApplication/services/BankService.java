package africa.semicolon.bankingApplication.services;

import africa.semicolon.bankingApplication.data.models.Bank;
import africa.semicolon.bankingApplication.dtos.requests.CreateAccountRequest;

import java.util.Collection;
import java.util.List;

public interface BankService {
    String createBank(String bankName);

    List<Bank> findAllBanks();

    String createAccount(CreateAccountRequest createAccountRequest);
}
