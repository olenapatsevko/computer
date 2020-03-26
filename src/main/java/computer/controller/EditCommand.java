package computer.controller;

import computer.entity.Laptop;
import computer.service.EditService;

import java.util.List;
import java.util.logging.Logger;

public class EditCommand implements Command {
    private static final Logger LOGGER = Logger.getLogger(EditCommand.class.getName());
   private final EditService editService;

    public EditCommand( EditService editService) {
        this.editService = editService;
    }


    @Override
    public void execute(List<Laptop> laptops) {
        try {
            editService.editElement(editService.findEditableElement(), laptops);
        }catch (IndexOutOfBoundsException e){
            LOGGER.warning("Invalid index entered in edit method");
        }
    }



}
