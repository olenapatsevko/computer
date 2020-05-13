package computer.controller;

import computer.controller.commands.Command;
import computer.utility.ScanUtil;
import computer.view.View;
import lombok.Data;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.Map;

@Data
public class CommandFabric {

    private View view;
    private Map<Actions, Command> actions;

    CommandFabric(View view) {
        this.view = view;
    }

    public void createCommand(ApplicationContext applicationContext) {
        view.print("Enter command " + Arrays.toString(Actions.values()));
        try {
            actions.get(Actions.valueOf(ScanUtil.scanString().toUpperCase())).execute(applicationContext);
        } catch (Exception e) {
            view.print("invalid input");
        }
    }

}
