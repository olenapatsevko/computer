package computer.controller;

import computer.entity.Laptop;
import computer.service.EditService;


import java.util.List;
import java.util.logging.Logger;

public class IncrementCommand implements Command {
    private static final Logger LOGGER = Logger.getLogger(IncrementCommand.class.getName());
    private final EditService editService;
    private Laptop laptop;

    public IncrementCommand(EditService editService) {
        this.editService = editService;
    }

    @Override
    public void execute(List<Laptop> laptops) {
        int index = editService.findEditableElement();
        try {
         //   laptop = new laptops.get(index);
        } catch (IndexOutOfBoundsException e) {
            LOGGER.info("Invalid index entered");
        }
        laptop.increment();
        laptops.add(index, laptop);

    }
}
