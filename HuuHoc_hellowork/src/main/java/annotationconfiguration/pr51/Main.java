package annotationconfiguration.pr51;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        UserService userService = context.getBean("abc", UserService.class);
        String name = userService.getName();
        System.out.println(name);
    }
}
