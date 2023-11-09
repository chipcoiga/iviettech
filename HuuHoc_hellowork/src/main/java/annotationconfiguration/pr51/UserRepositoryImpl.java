package annotationconfiguration.pr51;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @Override
    public String getName() {
        return "HEHE";
    }
}
