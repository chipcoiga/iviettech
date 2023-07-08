import config.BeanConfiguration;
import entity.CustomerEntity;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repository.CustomerRepository;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        CustomerRepository repository = context.getBean("customerRepository",  CustomerRepository.class);

//        CustomerEntity customer = new CustomerEntity();
//        customer.setName("LHLoc6");
//        customer.setBirthdate(LocalDateTime.now());
//        customer.setSex(true);
//        customer.setPhone("");
//
//        repository.save(customer);
        System.out.println(repository.findById(1L));

        LocalDateTime year20 = LocalDateTime.now().minus(20, ChronoUnit.YEARS);
//        System.out.println(year20);
        LocalDateTime year30 = LocalDateTime.now().minus(30, ChronoUnit.YEARS);
//        System.out.println(year30);
//        System.out.println(repository.findBySexAndBirthdateBetween(true, year30, year20).size());

//        repository.findBySexAndBirthdateBetween(true, year30, year20).forEach(customer -> {
//            System.out.println(customer.getId());
//            System.out.println(customer.getName());
//            System.out.println(customer.getBirthdate());
//            System.out.println("=======");
//        });


        repository.findByPhoneOrEmail("", "email1@gmail.com").forEach(customer -> {
            System.out.println(customer.getId());
            System.out.println(customer.getName());
            System.out.println(customer.getBirthdate());
            System.out.println("=======");
        });
    }

}