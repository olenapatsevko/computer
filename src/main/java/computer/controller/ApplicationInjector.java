package computer.controller;

import computer.service.CreatingService;
import computer.view.View;


public class ApplicationInjector {

    private static final View VIEW = new View();
    private static final CreatingService CREATING_SERVICE = new CreatingService(VIEW );
    private static final CommandFabric COMMAND_FABRIC = new CommandFabric();


    public static View getView(){
        return VIEW;
    }
    public static CreatingService getCreatingService(){
        return CREATING_SERVICE;
    }
    public static CommandFabric getCommandFabric(){return COMMAND_FABRIC;}

    private ApplicationInjector(){}

}
