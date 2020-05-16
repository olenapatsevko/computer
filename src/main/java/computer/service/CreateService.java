package computer.service;

import computer.entity.Laptop;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreateService {

    public Laptop create() {
        return new Laptop();
    }
}
