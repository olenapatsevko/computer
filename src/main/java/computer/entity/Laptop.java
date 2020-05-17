package computer.entity;


import lombok.*;

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

    @OneToOne(cascade = CascadeType.ALL)
    private Computer computer;


    }

