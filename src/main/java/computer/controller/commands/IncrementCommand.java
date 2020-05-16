package computer.controller.commands;

import computer.controller.MainController;
import computer.entity.Laptop;
import computer.service.EditService;
import lombok.Data;
import org.springframework.context.ApplicationContext;


import java.util.List;
import java.util.logging.Logger;

@Data
public class IncrementCommand implements Command {
    private EditService editService;

    public IncrementCommand(EditService editService) {
        this.editService = editService;
    }

    @Override
    public void execute(ApplicationContext applicationContext) {
        int index = editService.findEditableElement();
        applicationContext.getBean(MainController.class).getLaptops().get(index);
    }
}
