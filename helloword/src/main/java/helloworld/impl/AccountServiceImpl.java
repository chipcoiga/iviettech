package helloworld.impl;

import helloworld.Account;
import helloworld.AccountRepository;
import helloworld.AccountService;

public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    @Override
    public void updateAccount(Account account) {

    }

    @Override
    public Account getAccount(int id) {
        return accountRepository.getAccountById(id);
    }

    public void setAccountRepository(AccountRepository accountRepository) {
    }
}
