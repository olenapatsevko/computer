package computer.entity;

import lombok.*;

@Data
@ToString
public abstract class Computer {

    private String name;
    private int processorFrequency;
    private int quantityOfKernel;
    private int computerDataStorage;
    private int computerMemory;


}

