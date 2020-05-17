package computer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@EqualsAndHashCode
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "computer")
public class Computer {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id")
    private long id;
    private String name;
    private int processorFrequency;
    private int quantityOfKernel;
    private int computerDataStorage;
    private int computerMemory;

    @OneToOne(mappedBy = "computer")
    private Laptop laptop;

   public  Computer(String name, int processorFrequency, int quantityOfKernel, int computerDataStorage, int computerMemory){
       this.name = name;
       this.processorFrequency= processorFrequency;
       this.quantityOfKernel= quantityOfKernel;
       this.computerDataStorage= computerDataStorage;
       this.computerMemory = computerMemory;
   }

}

