import helloworld.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Account account1 = (Account) context.getBean("account1");
        System.out.println(account1.getId());
        System.out.println(account1.getName());
        System.out.println(account1.getAge());
        System.out.println("========");
        Account account2 = (Account) context.getBean("account2");
        System.out.println(account2.getId());
        System.out.println(account2.getName());
        System.out.println(account2.getAge());

        ExpressionParser parser = new SpelExpressionParser();
        Expression exp = parser.parseExpression("new String('hello world').toUpperCase()");
        String message = exp.getValue(String.class);
        System.out.println(message);
    }
}
