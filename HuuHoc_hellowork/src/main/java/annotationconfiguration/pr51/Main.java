package annotationconfiguration.pr51;

import annotationconfiguration.pojobeans.AccountService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        UserService userService = context.getBean("abc", UserService.class);
//        annotationconfiguration.pojobeans.AccountService accountService = context.getBean("accountService", AccountService.class);

        String name = userService.getName();
        System.out.println(name);

//        System.out.println("Account 1 balance : " + accountService.getAccount(1).getBalance());

    }
}
