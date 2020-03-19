package computer.service;

import computer.entity.Laptop;
import computer.view.View;

public class CreatingService {
    private final View view;

    public CreatingService (View view){
         this.view = view;
    }

    public Laptop create() {

        return     Laptop.builder()
                    .name(view.inputString("name"))
                    .weight(view.inputDouble("weight"))
                    .screen(view.inputDouble("screen"))
                    .quantityOfKernel(view.inputInt("Kernel"))
                    .processorFrequency(view.inputInt("processor frequency"))
                    .computerMemory(view.inputInt("memory"))
                    .computerDataStorage(view.inputInt("data storage"))
                    .battery(view.inputDouble("battery"))
                    .build();



    }
}
