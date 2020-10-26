package root.database;

import org.springframework.stereotype.Component;
import root.model.User;

import java.util.List;

public class UserRepositoryDatabaseImpl implements IUserRepository {
    @Override
    public boolean authenticate(String login, String pass) {
        System.out.println("UserRepositoryDatabaseImpl authenticate");
        return false;
    }

    @Override
    public boolean register(String login, String pass) {
        System.out.println("UserRepositoryDatabaseImpl register");
        return false;
    }

    @Override
    public List<User> getUsers() {
        System.out.println("UserRepositoryDatabaseImpl getUsers");
        return null;
    }
}
