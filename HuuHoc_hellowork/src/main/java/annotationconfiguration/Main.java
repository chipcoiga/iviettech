package annotationconfiguration;

import annotationconfiguration.pojobeans.Account;
import annotationconfiguration.pojobeans.AccountService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        AccountService accountService = context.getBean("accountService", AccountService.class);

        Account account = new Account();
        account.setAge(0);
        account.setBalance(101);
        account.setPassword("123456789");


        accountService.createAccount(account);
    }
}
