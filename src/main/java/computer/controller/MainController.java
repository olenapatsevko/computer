package computer.controller;

import computer.entity.Laptop;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.context.ApplicationContext;

import java.util.List;

@Data
@AllArgsConstructor
public class MainController {

    private  List<Laptop> laptops ;
    private CommandFabric commandFabric;


    public void run(ApplicationContext applicationContext) {
        while (true) {
            commandFabric.createCommand(applicationContext);
        }
    }
}
