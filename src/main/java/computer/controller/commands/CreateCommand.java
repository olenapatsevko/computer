package computer.controller.commands;

import computer.controller.MainController;
import computer.entity.Laptop;
import computer.service.CreateService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.context.ApplicationContext;

@Data
@AllArgsConstructor
public class CreateCommand implements Command {
private CreateService createService;
    @Override
    public void execute(ApplicationContext applicationContext) {
        applicationContext.getBean(MainController.class).getLaptops().add((Laptop) applicationContext.getBean("laptop"));
    }
}
