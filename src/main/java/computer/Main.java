package computer;

import computer.controller.MachineController;
import computer.entity.Laptop;
import proxy.LaptopProxy;

public class Main {

    public static void main(String[] args) {
      //  MachineController machineController = new MachineController();
        //machineController.run();
        LaptopProxy laptopProxy = new LaptopProxy(Laptop.builder()
                .battery(1)
                .computerDataStorage(1)
                .computerMemory(1)
        .screen(12)
        .name("a")
        .processorFrequency(12)
        .quantityOfKernel(12)
        .weight(12)
        .build());
        laptopProxy.increment();
    }
}
