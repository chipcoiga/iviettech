package annotationconfiguration.pr51;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "abc")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public String getName() {
        String name = userRepository.getName();
        System.out.println(name + "haha");
        return name;
    }
}
