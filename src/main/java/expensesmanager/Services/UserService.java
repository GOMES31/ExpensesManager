package expensesmanager.Services;

import expensesmanager.Entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findById(int Id);

    void save(User user);

    void deleteById(int id);
}
