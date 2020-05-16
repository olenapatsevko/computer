package computer.controller;

import computer.controller.commands.Command;

import lombok.Data;
import org.springframework.context.ApplicationContext;

import java.util.Map;

@Data
public class CommandFabric {


    private Map<Actions, Command> actions;



    public void createCommand(ApplicationContext applicationContext) {

    }

}
