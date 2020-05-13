package computer.entity;

import computer.exceptions.annotations.Call;
import lombok.*;
import org.springframework.stereotype.Component;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
public class Laptop extends Computer implements Machine {

    private double screen;
    private double weight;
    private double battery;

    public Laptop(String name, int processorFrequency, int quantityOfKernel, int computerDataStorage, int computerMemory, double screen, double weight, double battery) {
        super(name, processorFrequency, quantityOfKernel, computerDataStorage, computerMemory);
        this.screen = screen;
        this.weight = weight;
        this.battery = battery;
    }

    @Call
    public void increment() {
        this.setScreen(this.getScreen() + 1);
    }




}
