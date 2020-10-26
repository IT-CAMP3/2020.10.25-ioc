package root.database;

import root.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

public class UserRepositoryImpl implements IUserRepository {
    @Override
    public boolean authenticate(String login, String pass) {
        System.out.println("UserRepositoryImpl authenticate");
        return false;
    }

    @Override
    public boolean register(String login, String pass) {
        System.out.println("UserRepositoryImpl register");
        return false;
    }

    @Override
    public List<User> getUsers() {
        System.out.println("UserRepositoryImpl getUsers");
        return null;
    }
}
