package computer.controller;

import computer.service.CreatingService;
import computer.view.MachineView;

public class ApplicationInjector {

    private static final MachineView VIEW = new MachineView();
    private static final CreatingService CREATING_SERVICE = new CreatingService(VIEW);


    public static MachineView getView(){
        return VIEW;
    }
    public static CreatingService getCreatingService(){
        return CREATING_SERVICE;
    }

    private ApplicationInjector(){}

}
