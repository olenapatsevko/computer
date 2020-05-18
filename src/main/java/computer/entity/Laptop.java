package computer.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@Entity
@Table(name = "laptop")
public class Laptop  {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id")
    private long id;

    private double screen;
    private double weight;
    private double battery;

    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "computer_id", referencedColumnName = "id")
    private Computer computer;

    public Laptop(double screen, double weight, double battery, Computer computer) {
        this.battery = battery;
        this.computer = computer;
        this.weight = weight;
        this.computer = computer;
        this.screen = screen;
    }

    public Laptop(long id, double screen, double weight, double battery, Computer computer) {
        this.id = id;
        this.battery = battery;
        this.computer = computer;
        this.weight = weight;
        this.computer = computer;
        this.screen = screen;
    }
}

