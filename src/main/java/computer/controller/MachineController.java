package computer.controller;

import computer.entity.Laptop;
import computer.exceptions.InvalidDataException;
import computer.utility.ScanUtil;
import computer.view.View;

import java.util.ArrayList;
import java.util.List;

public class MachineController {

    public final View view = ApplicationInjector.getView();
    public final List<Laptop> laptops = new ArrayList<>();
    private Command command;

    public void run() {
        while (true) {
            view.print("1 - add an element \n 2 - view elements \n 3 - edit element \n any other integer - exit");
            try {
                switch (ScanUtil.scanInt()) {
                    case (1):
                        command = new CreateCommand(ApplicationInjector.getCreatingService());
                        break;

                    case (2):
                        command = new PrintCommand(view);
                        break;

                    case (3):
                        command = new EditCommand(ApplicationInjector.getEditService());
                        break;

                    default:
                        return;

                }
                command.execute(laptops);
            } catch (InvalidDataException e) {
                view.print("invalid input");
            }
        }


    }


}
