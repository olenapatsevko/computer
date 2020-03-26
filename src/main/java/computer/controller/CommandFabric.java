package computer.controller;

import computer.entity.Laptop;
import computer.service.EditService;
import computer.utility.ScanUtil;
import computer.view.View;

import java.util.Arrays;
import java.util.List;

public class CommandFabric {
    private Command command;
    public final View view = ApplicationInjector.getView();

    public void createCommand(List<Laptop> laptops) {
        view.print("Enter command "+ Arrays.toString(Actions.values()));
        try {
            switch (Actions.valueOf(ScanUtil.scanString().toUpperCase())) {
                case CREATE:
                    command = new CreateCommand(ApplicationInjector.getCreatingService());
                    break;
                case PRINT:
                    command = new PrintCommand(view);
                    break;
                case EDIT:
                    command = new EditCommand(EditService.getInstance());
                    break;
                case INCREMENT:
                    command = new IncrementCommand(EditService.getInstance());
                    break;
                case EXIT:
                    System.exit(0);
            }
            command.execute(laptops);
        } catch (Exception e) {
            view.print("invalid input");
        }
}

}
