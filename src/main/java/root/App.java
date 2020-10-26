package root;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import root.gui.GUI1;
import root.gui.GUI2;
import root.gui.GUI3;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        GUI1 gui1 = context.getBean(GUI1.class);
        gui1.login();
        gui1.register();

        GUI2 gui2 = context.getBean(GUI2.class);
        gui2.login();
        gui2.register();

        ApplicationContext context2 = new AnnotationConfigApplicationContext(ApplicationConfiguration2.class);

        GUI3 gui3 = context2.getBean(GUI3.class);
        gui3.login();
        gui3.register();
    }
}
