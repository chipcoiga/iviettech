package annotationconfiguration;

import annotationconfiguration.validator.AccountAgeValidator;
import annotationconfiguration.validator.AccountBalanceValidator;
import annotationconfiguration.validator.AccountPasswordValidator;
import annotationconfiguration.validator.AccountValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import pojobeans.AccountRepository;
import pojobeans.AccountRepositoryImpl;
import pojobeans.AccountService;
import pojobeans.AccountServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "annotationconfiguration.pojobeans")
public class BeanConfiguration {

    @Bean
    public List<AccountValidator> validators() {
        List<AccountValidator> validators = new ArrayList<>();
        validators.add(new AccountAgeValidator());
        validators.add(new AccountBalanceValidator());
        validators.add(new AccountPasswordValidator());
        return validators;
    }
}
