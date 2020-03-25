package computer.service;

import computer.entity.Laptop;
import computer.utility.ScanUtil;
import computer.view.View;

import java.util.List;

public class EditService {
    private final View view;
    private final CreatingService creatingService;

    public EditService(View view, CreatingService creatingService) {
        this.view = view;
        this.creatingService = creatingService;
    }

    public int findEditableElement() {
        view.print("enter position of element which you want to remove");
        int e = ScanUtil.scanInt();
        return e < 0 ? findEditableElement() : e;
    }

    public void editElement(int element, List<Laptop> laptops ){
        laptops.add(element , elementChange( laptops.remove(element)) );
    }

    private Laptop elementChange(Laptop laptop){
        view.print(laptop.toString());
        return creatingService.create();
    }
}
