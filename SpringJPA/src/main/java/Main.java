import config.BeanConfiguration;
import entity.CustomerEntity;
import entity.OrderDetailEntity;
import entity.OrderEntity;
import entity.ProductEntity;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import repository.CustomerRepository;
import repository.OrderRepository;
import repository.ProductRepository;
import service.CustomerService;
import service.OrderService;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
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

//        ProductRepository productRepository = context.getBean("productRepository",  ProductRepository.class);
//        productEntity = productRepository.save(productEntity);

//
//        OrderEntity orderEntity = new OrderEntity();
//        orderEntity.setOrderDate(LocalDateTime.now());
//        orderEntity.setCustomerName("LHLoc");
//        orderEntity.setProductEntities(List.of(productEntity));
//
//        OrderRepository orderRepository = context.getBean("orderRepository", OrderRepository.class);
////        orderRepository.save(orderEntity);


//        orderRepository.findAll().forEach(order -> {
//            System.out.println(order.getProductEntities().get(0).getName());
//        });

//        OrderService service = context.getBean("orderService", OrderService.class);
        CustomerService customerService = context.getBean("customerService", CustomerService.class);

//        for (int i = 0; i < 5; i++) {
//            CustomerEntity entity = new CustomerEntity();
//            entity.setPhone("0123456789");
//            entity.setName("customer" + i);
//            entity.setEmail("customer" + i + "@gmail.com");
//            entity.setSex(true);
//            entity.setBirthdate(LocalDateTime.of(2000, 1, 1, 1, 1, 1));
//            entity.setAddress("Da Nang");
//
//            customerService.createCustomer(entity);
//        }

        System.out.println("Find by ID");
        CustomerEntity entity = customerService.findById(2L);
        System.out.println(entity.getId());
        System.out.println(entity.getName());
        System.out.println(entity.getEmail());
        System.out.println("============");

        System.out.println("findAll");
        List<CustomerEntity> customerEntities = customerService.findAll();
        System.out.println(customerEntities.size());
        customerEntities.forEach(item -> System.out.println(item.getEmail()));
        System.out.println("============");


        System.out.println("findByName");
        List<CustomerEntity> customerEntitiesByName = customerService.findByName("customer4");
        System.out.println(customerEntitiesByName.size());
        customerEntitiesByName.forEach(item -> System.out.println(item.getEmail()));
        System.out.println("============");


        System.out.println("findByPhoneOrEmail");
        List<CustomerEntity> customerEntitiesByMailOrPhone = customerService.findByPhoneOrEmail("1234", "customer3@gmail.com");
        System.out.println(customerEntitiesByMailOrPhone.size());
        customerEntitiesByMailOrPhone.forEach(item -> System.out.println(item.getEmail()));
        System.out.println("============");


        System.out.println("findBySexAndBirthdateBetween");
        LocalDateTime from = LocalDateTime.of(2000, 1, 1, 1, 1, 1);
        LocalDateTime to = LocalDateTime.now();
        List<CustomerEntity> findBySexAndBirthdateBetween = customerService.findBySexAndBirthdateBetween(false, from, to);
        System.out.println(findBySexAndBirthdateBetween.size());
        findBySexAndBirthdateBetween.forEach(item -> System.out.println(item.getEmail()));
        System.out.println("============");

        System.out.println("findBySexAndBirthdateBetween2");
        List<CustomerEntity> findBySexAndBirthdateBetween2 = customerService.findBySexAndBirthdateBetween(true, from, to);
        System.out.println(findBySexAndBirthdateBetween2.size());
        findBySexAndBirthdateBetween2.forEach(item -> System.out.println(item.getEmail()));
        System.out.println("============");






//        OrderEntity order = new OrderEntity();
//        order.setCustomerName("ko phai LHLoc");
//        order.setCustomerAddress("minhthuthathu");
//
//        OrderDetailEntity detail = new OrderDetailEntity();
//        detail.setProductName("Tu lanh");
//
//        service.saveOrder(order, detail);

//        for (OrderEntity order1 : service.findAllOrder()) {
//            System.out.println(order1.getId());
//            System.out.println(order1.getCustomerName());
//            System.out.println("==============");
//        }

//        for (OrderEntity order1 : service.findAllOrder()) {
//            System.out.println("OrderID: " + order1.getId());
//            System.out.println("OrderDetailID: " + order1.getOrderDetailEntities().get(0).getId());
//            System.out.println("==============");
//        }

//        for (OrderEntity order1 : service.findByCustomerName()) {
//            System.out.println("OrderID: " + order1.getId());
//            System.out.println("OrderDetailID: " + order1.getOrderDetailEntities().get(0).getId());
//            System.out.println("Address: " + order1.getCustomerAddress());
//            System.out.println("==============");
//        }

    }

}