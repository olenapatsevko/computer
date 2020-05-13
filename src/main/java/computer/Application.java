package computer;

import computer.controller.MainController;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("config.xml", "command.xml", "entity.xml");
        context.getBean(MainController.class).run(context);

    }
}
