package computer.controller.commands;

import computer.controller.MainController;
import computer.service.EditService;
import lombok.Data;
import org.springframework.context.ApplicationContext;

import java.util.logging.Logger;

@Data
public class EditCommand implements Command {
    private Logger logger ;
    private EditService editService;

    public EditCommand(EditService editService, Logger logger) {

        this.editService = editService;
        this.logger = logger;
    }


    @Override
    public void execute(ApplicationContext applicationContext) {
        try {
            editService.editElement(editService.findEditableElement(), applicationContext.getBean(MainController.class).getLaptops());
        } catch (IndexOutOfBoundsException e) {
            logger.warning("Invalid index entered in edit method");
        }
    }



}
