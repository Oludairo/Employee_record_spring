package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountRepositoryImpl implements AccountRepository{
    List<Account> accounts = new ArrayList<>();

    @Override
    public Account save(Account account) {
        accounts.add(account);
        return account;
    }

    @Override
    public Account findAccountByCustomerId(String id) {
        for (Account account: accounts) {
            if (account.getCustomerId().equalsIgnoreCase(id)) {
                return account;
            }
        }
        return null;
    }

    @Override
    public void delete(Account account) {
        accounts.remove(account);

    }

    @Override
    public void delete(String customerId) {
        Account account = findAccountByCustomerId(customerId);
        delete(account);

    }

    @Override
    public List<Account> findAll() {
        return accounts;
    }
}
