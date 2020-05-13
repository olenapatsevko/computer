package computer.controller;

import computer.entity.Laptop;
import computer.view.View;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.context.ApplicationContext;

import java.util.List;

@Data
@AllArgsConstructor
public class MainController {

    private  View view ;
    private  List<Laptop> laptops ;
    private CommandFabric commandFabric;


    public void run(ApplicationContext applicationContext) {
        while (true) {
            commandFabric.createCommand(applicationContext);
        }
    }
}
