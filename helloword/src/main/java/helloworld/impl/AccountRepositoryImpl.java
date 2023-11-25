package helloworld.impl;

import helloworld.Account;
import helloworld.AccountRepository;
import org.springframework.stereotype.Repository;

@Repository
public class AccountRepositoryImpl implements AccountRepository {
    @Override
    public void updateAccount(Account account) {

    }

    @Override
    public Account getAccountById(int id) {
        Account account1 = new Account();
        account1.setId(1);
        account1.setName("NameAccount1");
        return account1;
    }
}
