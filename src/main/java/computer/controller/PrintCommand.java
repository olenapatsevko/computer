package computer.controller;

import computer.entity.Laptop;
import computer.view.View;

import java.util.List;

public class PrintCommand implements Command {
    private final View view;

    public PrintCommand(View view) {
        this.view = view;
    }

    @Override
    public void execute(List<Laptop> laptops){
        view.print(laptops.toString());
    }
}
