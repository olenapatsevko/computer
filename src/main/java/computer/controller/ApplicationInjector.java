package computer.controller;

import computer.view.MachineView;

public class ApplicationInjector {

    private static final MachineView VIEW = new MachineView();

    public static MachineView getView(){
        return VIEW;
    }

    private ApplicationInjector(){}

}
