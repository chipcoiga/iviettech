package annotationconfiguration.validator;

import annotationconfiguration.pojobeans.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountBalanceValidator implements AccountValidator {
    @Override
    public void validate(Account account) {
        if (account.getBalance() <= 100) {
            throw new IllegalArgumentException("Account Balance phải lớn hơn 100 củ");
        }
    }
}
