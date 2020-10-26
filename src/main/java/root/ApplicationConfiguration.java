package root;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import root.database.IUserRepository;
import root.database.UserRepositoryDatabaseImpl;
import root.database.UserRepositoryImpl;
import root.gui.GUI1;
import root.gui.GUI2;
import root.gui.GUI3;

@Configuration
@ComponentScan("root.gui")
public class ApplicationConfiguration {

    @Bean
    public UserRepositoryDatabaseImpl userRepositoryDatabase() {
        return new UserRepositoryDatabaseImpl();
    }
}
