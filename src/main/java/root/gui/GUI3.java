package root.gui;

import root.database.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GUI3 {

    @Autowired
    private IUserRepository userRepository;

    public void login() {
        userRepository.getUsers();
    }

    public void register() {
        userRepository.register("asdf", "asdf");
    }

    public void setUserRepository(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
