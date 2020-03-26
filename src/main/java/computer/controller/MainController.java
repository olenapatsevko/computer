package computer.controller;

import computer.entity.Laptop;
import computer.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainController {

    public final View view = ApplicationInjector.getView();
    public final List<Laptop> laptops = new ArrayList<>();


    public void run() {
        while (true) {
            ApplicationInjector.getCommandFabric().createCommand(laptops);
        }
    }
}
