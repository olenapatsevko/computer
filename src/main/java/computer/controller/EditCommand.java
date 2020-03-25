package computer.controller;

import computer.entity.Laptop;
import computer.service.EditService;

import java.util.List;

public class EditCommand implements Command {
   private final EditService editService;

    public EditCommand( EditService editService) {


        this.editService = editService;
    }


    @Override
    public void execute(List<Laptop> laptops) {
      editService.  editElement(editService.findEditableElement(), laptops);

    }



}
