import config.BeanConfiguration;
import entity.CustomerEntity;
import entity.OrderEntity;
import entity.ProductEntity;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.transaction.annotation.Transactional;
import repository.CustomerRepository;
import repository.OrderRepository;
import repository.ProductRepository;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
//        CustomerRepository repository = context.getBean("customerRepository",  CustomerRepository.class);

//        CustomerEntity customer = new CustomerEntity();
//        customer.setName("LHLoc6");
//        customer.setBirthdate(LocalDateTime.now());
//        customer.setSex(true);
//        customer.setPhone("");
//
//        repository.save(customer);
//        System.out.println(repository.findById(1L));

//        LocalDateTime year20 = LocalDateTime.now().minus(20, ChronoUnit.YEARS);
//        System.out.println(year20);
//        LocalDateTime year30 = LocalDateTime.now().minus(30, ChronoUnit.YEARS);
//        System.out.println(year30);
//        System.out.println(repository.findBySexAndBirthdateBetween(true, year30, year20).size());

//        repository.findBySexAndBirthdateBetween(true, year30, year20).forEach(customer -> {
//            System.out.println(customer.getId());
//            System.out.println(customer.getName());
//            System.out.println(customer.getBirthdate());
//            System.out.println("=======");
//        });


//        repository.findByPhoneOrEmail("", "email1@gmail.com").forEach(customer -> {
//            System.out.println(customer.getId());
//            System.out.println(customer.getName());
//            System.out.println(customer.getBirthdate());
//            System.out.println("=======");
//        });

//        ProductEntity productEntity = new ProductEntity();
//        productEntity.setName("Chả cá");
//        productEntity.setPrice(5000D);

        ProductRepository productRepository = context.getBean("productRepository",  ProductRepository.class);
//        productEntity = productRepository.save(productEntity);

//
//        OrderEntity orderEntity = new OrderEntity();
//        orderEntity.setOrderDate(LocalDateTime.now());
//        orderEntity.setCustomerName("LHLoc");
//        orderEntity.setProductEntities(List.of(productEntity));
//
        OrderRepository orderRepository = context.getBean("orderRepository", OrderRepository.class);
////        orderRepository.save(orderEntity);


        orderRepository.findAll().forEach(order -> {
            System.out.println(order.getProductEntities().get(0).getName());
        });
    }

}