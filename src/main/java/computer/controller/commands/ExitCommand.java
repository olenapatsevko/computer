package computer.controller.commands;

import org.springframework.context.ApplicationContext;

public class ExitCommand implements Command {
    @Override
    public void execute(ApplicationContext applicationContext) {
        System.exit(0);
    }
}
