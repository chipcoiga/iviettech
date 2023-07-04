package annotationconfiguration.pojobeans;

import org.springframework.stereotype.Service;

@Service("accountService1")
public class Account2ServiceImpl implements AccountService {
    @Override
    public void createAccount(Account account) {

    }

    @Override
    public void transferMoney(long fromAccountId, long toAccountId, double amount) {
        System.out.println("hehe");
    }

    @Override
    public void depositMoney(long accountId, double amount) throws Exception {
        System.out.println("hehe");
    }

    @Override
    public Account getAccount(long accountId) {
        return new Account();
    }
}
