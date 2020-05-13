package computer.controller.commands;

import computer.controller.MainController;
import computer.entity.Laptop;
import lombok.Data;
import org.springframework.context.ApplicationContext;

@Data
public class CreateCommand implements Command {

    @Override
    public void execute(ApplicationContext applicationContext) {
        applicationContext.getBean(MainController.class).getLaptops().add(applicationContext.getBean(Laptop.class));
    }
}
