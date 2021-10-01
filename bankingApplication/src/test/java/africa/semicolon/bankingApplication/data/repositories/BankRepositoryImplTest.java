package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankRepositoryImplTest {
    BankRepository bankRepository;

    @BeforeEach
    void setUp() {
        bankRepository = new BankRepositoryImpl();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void save() {
        Bank bank = new Bank("002");
        bank.setName("GTBank");
        Bank savedBank = bankRepository.save(bank);
        assertEquals(bank, savedBank);
    }

    @Test
    void findAccountByBankId() {
        Bank bank = new Bank("002");
        bank.setName("GTBank");
        bankRepository.save(bank);
        Bank foundBank = bankRepository.findAccountByBankId("002");
        assertEquals(bank, foundBank);
    }

    @Test
    void delete() {
        Bank bank = new Bank("002");
        bank.setName("GTBank");
        bankRepository.save(bank);
        assertNotNull(bankRepository.findAccountByBankId("002"));

        bankRepository.delete(bank);

        assertNull(bankRepository.findAccountByBankId("bank"));
    }

    @Test
    void testDelete() {
        Bank bank = new Bank("002");
        bank.setName("GTBank");
        bankRepository.save(bank);
        assertNotNull(bankRepository.findAccountByBankId("002"));

        bankRepository.delete("002");

        assertNull(bankRepository.findAccountByBankId("002"));
    }

    @Test
    void findAll() {
        Bank bank = new Bank("002");
        bank.setName("GTBank");
        bankRepository.save(bank);
        bankRepository.save(bank);
        bankRepository.save(bank);
        assertEquals(3, bankRepository.findAll().size());
    }
}