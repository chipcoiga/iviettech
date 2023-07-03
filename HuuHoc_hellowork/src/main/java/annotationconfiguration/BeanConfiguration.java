package annotationconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import pojobeans.AccountRepository;
import pojobeans.AccountRepositoryImpl;
import pojobeans.AccountService;
import pojobeans.AccountServiceImpl;

@Configuration
@ComponentScan(basePackages = "annotationconfiguration.pojobeans")
//@EnableAspectJAutoProxy
public class BeanConfiguration {

}
