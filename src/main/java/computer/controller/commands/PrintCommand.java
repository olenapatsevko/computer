package computer.controller.commands;

import computer.controller.MainController;
import computer.entity.Laptop;
import computer.view.View;
import lombok.Data;
import org.springframework.context.ApplicationContext;

import java.util.List;

@Data
public class PrintCommand implements Command {
    private final View view;

    public PrintCommand(View view) {
        this.view = view;
    }

    @Override
    public void execute(ApplicationContext applicationContext){
        view.print(applicationContext.getBean(MainController.class).getLaptops().toString());
    }
}
