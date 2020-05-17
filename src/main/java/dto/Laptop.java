package dto;

import computer.entity.Computer;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Laptop {


    private String name;
    private int processorFrequency;
    private int quantityOfKernel;
    private int computerDataStorage;
    private int computerMemory;

    private double screen;
    private double weight;
    private double battery;


    public computer.entity.Laptop getLaptop(){
        return  new computer.entity.Laptop(screen, weight, battery, getComputer());
    }

    public Computer getComputer(){
        return new Computer(name, processorFrequency, quantityOfKernel, computerDataStorage,computerMemory);
    }
}
