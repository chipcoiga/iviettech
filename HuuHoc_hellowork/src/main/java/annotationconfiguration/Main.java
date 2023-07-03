package annotationconfiguration;

import annotationconfiguration.pojobeans.AccountService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationbasedconfiguration/beans.xml");
        AccountService accountService = context.getBean("accountService", AccountService.class);

        System.out.println("Before money transfer ");
        System.out.println("Account 1 balance : " + accountService.getAccount(1).getBalance());
        System.out.println("Account 2 balance : " + accountService.getAccount(2).getBalance());

        accountService.transferMoney(1,2,5.0);
        System.out.println("==============================");
        System.out.println("after money transfer ");
        System.out.println("Account 1 balance : " + accountService.getAccount(1).getBalance());
        System.out.println("Account 2 balance : " + accountService.getAccount(2).getBalance());
    }
}
