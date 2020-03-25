package computer.controller;

import computer.entity.Laptop;
import computer.service.CreatingService;

import java.util.List;

public class CreateCommand implements Command {

    public final CreatingService createService;

    public CreateCommand(CreatingService createService) {
        this.createService = createService;
    }

    @Override
    public void execute(List<Laptop> laptops) {

    }
}
