package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.Account;
import africa.semicolon.bankingApplication.data.models.AccountType;
import africa.semicolon.bankingApplication.data.models.Bvn;
import africa.semicolon.bankingApplication.data.models.Customer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountRepositoryImplTest {
    AccountRepository accountRepository;

    @BeforeEach
    void setUp() {
        accountRepository = new AccountRepositoryImpl();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void save() {
        Account account = new Account();
        Customer customer = new Customer();
        Bvn bvn = new Bvn("388403284", customer);
        customer.setBvn(bvn.getId());
        account.setCustomerId(customer.getBvn());
        account.setNumber("0176443308");
        account.setType(AccountType.SAVINGS);
        Account savedAccount = accountRepository.save(account);
        assertEquals(account, savedAccount);

    }

    @Test
    void findAccountByCustomerId() {
        Account account = new Account();
        Customer customer = new Customer();
        Bvn bvn = new Bvn("388403284", customer);
        customer.setBvn(bvn.getId());
        account.setCustomerId(customer.getBvn());
        account.setNumber("0176443308");
        account.setType(AccountType.SAVINGS);
        accountRepository.save(account);
        Account foundAccount = accountRepository.findAccountByCustomerId(customer.getBvn());
        assertEquals(account, foundAccount);
    }

    @Test
    void delete() {
        Account account = new Account();
        Customer customer = new Customer();
        Bvn bvn = new Bvn("388403284", customer);
        customer.setBvn(bvn.getId());
        account.setCustomerId(customer.getBvn());
        account.setNumber("0176443308");
        account.setType(AccountType.SAVINGS);
        accountRepository.save(account);
        assertNotNull(accountRepository.findAccountByCustomerId("388403284"));

        accountRepository.delete("0176443308");

        assertNull(accountRepository.findAccountByCustomerId("0176543308"));

    }

    @Test
    void testDelete() {
        Account account = new Account();
        Customer customer = new Customer();
        Bvn bvn = new Bvn("388403284", customer);
        customer.setBvn(bvn.getId());
        account.setCustomerId(customer.getBvn());
        account.setNumber("0176443308");
        account.setType(AccountType.SAVINGS);
        accountRepository.save(account);
        assertNotNull(accountRepository.findAccountByCustomerId("388403284"));

        accountRepository.delete("388403284");

        assertNull(accountRepository.findAccountByCustomerId("388403284"));
    }

    @Test
    void findAll() {
        Account account = new Account();
        Customer customer = new Customer();
        Bvn bvn = new Bvn("388403284", customer);
        customer.setBvn(bvn.getId());
        account.setCustomerId(customer.getBvn());
        account.setNumber("0176443308");
        account.setType(AccountType.SAVINGS);
        accountRepository.save(account);
        accountRepository.save(account);
        accountRepository.save(account);
        assertEquals(3, accountRepository.findAll().size());
    }
}