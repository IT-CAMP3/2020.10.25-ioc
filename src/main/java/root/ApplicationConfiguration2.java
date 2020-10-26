package root;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import root.database.UserRepositoryDatabaseImpl;
import root.database.UserRepositoryImpl;

@Configuration
@ComponentScan("root.gui")
public class ApplicationConfiguration2 {
    @Bean
    public UserRepositoryImpl userRepositoryDatabase() {
        return new UserRepositoryImpl();
    }
}
