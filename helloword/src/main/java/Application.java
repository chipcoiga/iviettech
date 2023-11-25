import helloworld.Account;
import helloworld.AccountService;
import helloworld.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Application {
    AccountService accountService;
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        AccountService accountService = (AccountService) context.getBean("accountService");

        Account account1 = accountService.getAccount(1);
        System.out.println(account1.getId());
        System.out.println(account1.getName());
        System.out.println(account1.getAge());


//        Account account1 = (Account) context.getBean("account1");
//        System.out.println(account1.getId());
//        System.out.println(account1.getName());
//        System.out.println(account1.getAge());
//        System.out.println("========");
//        Account account2 = (Account) context.getBean("account2");
//        System.out.println(account2.getId());
//        System.out.println(account2.getName());
//        System.out.println(account2.getAge());
//
//        ExpressionParser parser = new SpelExpressionParser();
//        Expression exp = parser.parseExpression("new String('hello world').toUpperCase()");
//        String message = exp.getValue(String.class);
//        System.out.println(message);
    }
}
