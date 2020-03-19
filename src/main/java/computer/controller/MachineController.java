package computer.controller;

import computer.entity.Laptop;
import computer.exceptions.InvalidDataException;
import computer.service.CreatingService;
import computer.view.View;

import java.util.ArrayList;
import java.util.List;

public class MachineController {

    public final View view = ApplicationInjector.getView();
    public final CreatingService createService = ApplicationInjector.getCreatingService();
    public final List<Laptop> laptops = new ArrayList<>();

    public void run() {
        while (true) {
            view.print("1 - add an element \n 2 - view elements \n any other integer - exit");

            try {
                switch (view.scanInt()) {
                    case (1):
                        laptops.add(createService.create());
                        break;

                    case (2):
                        view.print(laptops.toString());
                        break;

                    default:
                        return;

                }
            }catch (InvalidDataException e){
                view.print("invalid input");
            }
        }


    }


}
