package computer.controller.commands;


import computer.service.EditService;
import lombok.Data;
import org.springframework.context.ApplicationContext;

@Data
public class IncrementCommand implements Command {
    private EditService editService;

    public IncrementCommand(EditService editService) {
        this.editService = editService;
    }

    @Override
    public void execute(ApplicationContext applicationContext) {


    }
}
