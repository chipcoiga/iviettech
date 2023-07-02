package helloworld;

public interface AccountRepository {
    void updateAccount(Account account);
    Account getAccountById(int id);
}
