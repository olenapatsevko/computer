package computer.entity;

import lombok.*;
import org.springframework.stereotype.Component;

@Data
@ToString
@Component
public abstract class Computer {

    private String name;
    private int processorFrequency;
    private int quantityOfKernel;
    private int computerDataStorage;
    private int computerMemory;

    public Computer(String name, int processorFrequency, int quantityOfKernel, int computerDataStorage, int computerMemory) {
        this.name = name;
        this.processorFrequency = processorFrequency;
        this.quantityOfKernel = quantityOfKernel;
        this.computerDataStorage = computerDataStorage;
        this.computerMemory = computerMemory;
    }
}

