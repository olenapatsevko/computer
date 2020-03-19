package computer.entity;

import computer.exceptions.annotations.Call;
import lombok.*;

@Data
@ToString
@EqualsAndHashCode(callSuper = false)
public class Laptop extends Computer implements Machine {

    private double screen;
    private double weight;
    private double battery;

    @Call
    public void increment() {
        this.setScreen(this.getScreen() + 1);
    }


}
