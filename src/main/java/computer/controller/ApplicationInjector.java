package computer.controller;

import computer.service.CreatingService;
import computer.service.EditService;
import computer.view.View;


public class ApplicationInjector {

    private static final View VIEW = new View();
    private static final CreatingService CREATING_SERVICE = new CreatingService(VIEW );
    private static final EditService EDIT_SERVICE = new EditService(VIEW, CREATING_SERVICE);


    public static View getView(){
        return VIEW;
    }
    public static CreatingService getCreatingService(){
        return CREATING_SERVICE;
    }
    public static EditService getEditService(){return EDIT_SERVICE;}
    private ApplicationInjector(){}

}
