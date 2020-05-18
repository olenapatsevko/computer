package computer.dto;


import computer.entity.Computer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class ComputerDTO {

    private long id;
    private long computerId;
    private String name;
    private int processorFrequency;
    private int quantityOfKernel;
    private int computerDataStorage;
    private int computerMemory;

    private double screen;
    private double weight;
    private double battery;


    public computer.entity.Laptop getLaptop() {
        return new computer.entity.Laptop(id, screen, weight, battery, getComputer());
    }

    public Computer getComputer() {
        return new Computer(computerId, name, processorFrequency, quantityOfKernel, computerDataStorage, computerMemory);
    }
}
