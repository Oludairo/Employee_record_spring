package africa.semicolon.bankingApplication.services;

import africa.semicolon.bankingApplication.data.models.AccountType;
import africa.semicolon.bankingApplication.data.repositories.BankRepositoryImpl;
import africa.semicolon.bankingApplication.data.repositories.CustomerRepository;
import africa.semicolon.bankingApplication.dtos.requests.CreateAccountRequest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankServiceImplTest {
    BankService bankService;

    @BeforeEach
    void setUp() {
        bankService = new BankServiceImpl();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createTwoBanks_secondId_willBe02() {
        //when
        String gtCoId = bankService.createBank("GTCO");
        String firstBankId = bankService.createBank("FIRST bank");
        //assert
        assertEquals("01", gtCoId);
        assertEquals("02", firstBankId);

    }

    @Test
    void createTwoBanks_repositoryShouldHaveTwoBanks(){
        String gtCoId = bankService.createBank("GTCO");
        String firstBankId = bankService.createBank("FIRST bank");
        assertEquals("01", gtCoId);
        assertEquals("02", firstBankId);
        assertEquals(2, bankService.findAllBanks().size());
        System.out.println(bankService.findAllBanks());
    }

    @Test
    void bankCanCreateForCustomers_test(){
        String gtCoId = bankService.createBank("GTCO");
        //when
        CreateAccountRequest createAccountRequest = new CreateAccountRequest();
        createAccountRequest.setAccountType(AccountType.CURRENT);
        createAccountRequest.setBankId("01");
        createAccountRequest.setFirstName("Agba");
        createAccountRequest.setLastName("Mon-shure");
        String accountNumber = bankService.createAccount(createAccountRequest);
        //assert
        assertEquals("0100000001", accountNumber);
    }

    @Test
    void createTwoAccountInBank1_accountShouldBe02(){
        String gtCoId = bankService.createBank("GTCO");
        //when
        CreateAccountRequest agbasForm = new CreateAccountRequest();
        agbasForm.setAccountType(AccountType.CURRENT);
        agbasForm.setBankId("01");
        agbasForm.setFirstName("Agba");
        agbasForm.setLastName("Mon-shure");
        String agbaAccountNumber = bankService.createAccount(agbasForm);

        CreateAccountRequest ajohnnesForm = new CreateAccountRequest();
        ajohnnesForm.setAccountType(AccountType.CURRENT);
        ajohnnesForm.setFirstName("Agba");
        ajohnnesForm.setBankId("01");
        ajohnnesForm.setLastName("Mon-shure");
        String ajohnneAccountNumber = bankService.createAccount(ajohnnesForm);
        //assert
        assertEquals("0100000001", agbaAccountNumber);
        assertEquals("0100000002", ajohnneAccountNumber);
    }

    @Test
    void createTwoAccountInBank1_andOneAccountInBank2_accountShouldBe02(){
        String gtCoId = bankService.createBank("GTCO");
        String secondBAnkId = bankService.createBank("First Bank");
        //when
        CreateAccountRequest agbasForm = new CreateAccountRequest();
        agbasForm.setAccountType(AccountType.CURRENT);
        agbasForm.setBankId("01");
        agbasForm.setFirstName("Agba");
        agbasForm.setLastName("Mon-shure");
        String agbaAccountNumber = bankService.createAccount(agbasForm);

        CreateAccountRequest ajohnnesForm = new CreateAccountRequest();
        ajohnnesForm.setAccountType(AccountType.CURRENT);
        ajohnnesForm.setFirstName("Ajohnes");
        ajohnnesForm.setBankId("01");
        ajohnnesForm.setLastName("Sleepy");
        String ajohnneAccountNumber = bankService.createAccount(ajohnnesForm);

        CreateAccountRequest jerryForm = new CreateAccountRequest();
        jerryForm.setAccountType(AccountType.CURRENT);
        jerryForm.setFirstName("Jerry");
        jerryForm.setBankId("02");
        ajohnnesForm.setLastName("IntelliJ");
        String jerryAccountNumber = bankService.createAccount(jerryForm);
        //assert
        assertEquals("0100000001", agbaAccountNumber);
        assertEquals("0100000002", ajohnneAccountNumber);
        assertEquals("0200000001", jerryAccountNumber);
    }

    @Test
    void whenAccount(){
        String gtCoId = bankService.createBank("GTCO");
        //when
        CreateAccountRequest agbasForm = new CreateAccountRequest();
        agbasForm.setAccountType(AccountType.CURRENT);
        agbasForm.setBankId("01");
        agbasForm.setFirstName("Agba");
        agbasForm.setLastName("Mon-shure");
        String agbaAccountNumber = bankService.createAccount(agbasForm);
        CustomerService customerService = new CustomerServiceImpl();
        assertEquals(1, customerService.findAll().size());
    }
}