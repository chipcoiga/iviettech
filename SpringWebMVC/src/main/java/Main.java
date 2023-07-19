import config.BeanConfiguration;
import config.MainWebAppInitializer;
import config.WebConfig;
import entity.OrderDetailEntity;
import entity.OrderEntity;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.OrderService;

public class Main {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                BeanConfiguration.class,
                MainWebAppInitializer.class,
                WebConfig.class);
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
//
//        OrderService service = context.getBean("orderService", OrderService.class);
//
//        OrderEntity order = new OrderEntity();
//        order.setCustomerName("ko phai LHLoc");
//
//        OrderDetailEntity detail = new OrderDetailEntity();
//        detail.setProductName("Tu lanh");
//
//        service.saveOrder(order, detail);
    }

}