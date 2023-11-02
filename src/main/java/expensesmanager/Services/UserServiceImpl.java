package expensesmanager.Services;

import expensesmanager.Entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findById(int Id) {
        return null;
    }

    @Override
    public void save(User user) {

    }

    @Override
    public void deleteById(int id) {

    }
}
