package computer.controller;

import computer.entity.Laptop;
import computer.exceptions.InvalidDataException;
import computer.view.View;

import java.util.ArrayList;
import java.util.List;

public class MachineController {

    public final View view = ApplicationInjector.getView();
    public final List<Laptop> laptops = new ArrayList<>();

    public void run() {
        while (true) {
            view.print("1 - add an element \n 2 - view elements \n any other integer - exit");
            switch (view.scanInt()) {
                case (1):
                    laptops.add(create());
                    break;

                case (2):
                    view.print(laptops.toString());
                    break;

                default:
                    return;

            }

        }


    }

    public Laptop create() {
        Laptop laptop = new Laptop();
       try{
        laptop.setScreen(view.inputDouble("screen"));

       }catch (InvalidDataException e){
           view.print(e.getLocalizedMessage());
           this.create();
       }
       return laptop;
    }
}
