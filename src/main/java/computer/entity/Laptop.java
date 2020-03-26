package computer.entity;

import computer.exceptions.annotations.Call;
import lombok.*;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
public class Laptop extends Computer implements Machine {

    private double screen;
    private double weight;
    private double battery;

    protected Laptop(Builder builder) {
        setName(builder.name);
        setProcessorFrequency(builder.processorFrequency);
        setQuantityOfKernel(builder.quantityOfKernel);
        setComputerDataStorage(builder.computerDataStorage);
        setComputerMemory(builder.computerMemory);
        setScreen(builder.screen);
        setWeight(builder.weight);
        setBattery(builder.battery);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Call
    public void increment() {
        this.setScreen(this.getScreen() + 1);
    }


    public static final class Builder {
        private String name;
        private int processorFrequency;
        private int quantityOfKernel;
        private int computerDataStorage;
        private int computerMemory;
        private double screen;
        private double weight;
        private double battery;

        public Builder() {
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder processorFrequency(int val) {
            processorFrequency = val;
            return this;
        }

        public Builder quantityOfKernel(int val) {
            quantityOfKernel = val;
            return this;
        }

        public Builder computerDataStorage(int val) {
            computerDataStorage = val;
            return this;
        }

        public Builder computerMemory(int val) {
            computerMemory = val;
            return this;
        }

        public Builder screen(double val) {
            screen = val;
            return this;
        }

        public Builder weight(double val) {
            weight = val;
            return this;
        }

        public Builder battery(double val) {
            battery = val;
            return this;
        }

        public Laptop build() {
            return new Laptop(this);
        }
    }
}
