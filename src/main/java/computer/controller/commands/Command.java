package computer.controller.commands;

import org.springframework.context.ApplicationContext;

public interface Command {

     void execute(ApplicationContext applicationContext);
}
