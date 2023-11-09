package annotationconfiguration;

import annotationconfiguration.pojobeans.AccountService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import java.security.InvalidKeyException;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        List.of().stream().filter(i -> i > 5).collect(Collectors.toList());
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



@Service
class BaiTap {
    public void bai1() throws InvalidKeyException {
        System.out.println("hehe");
        throw new InvalidKeyException();
    }
}

class LamBaiTap {
    private BaiTap baiTap;

    public void lamBaiTap4() {
        hideException(() -> baiTap.bai1());
    }

    public void hideException(LamBaiTapHo lamBaiTapHo) {
        try {
            lamBaiTapHo.apply();
        } catch (InvalidKeyException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        LamBaiTap lamBaiTap = new LamBaiTap();
        lamBaiTap.baiTap = new BaiTap();
        lamBaiTap.lamBaiTap4();

    }
}

@FunctionalInterface
interface LamBaiTapHo {
    void apply() throws InvalidKeyException;
}

