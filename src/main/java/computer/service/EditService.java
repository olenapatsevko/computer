package computer.service;

import computer.entity.Laptop;
import computer.utility.ScanUtil;
import computer.view.View;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class EditService {
    private static EditService instance;
    private  View view;


    public static EditService getInstance(){
        if (instance == null){
            instance = new EditService();
        }
        return instance;
    }

    private EditService(View view) {
        this.view = view;

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
        return null;
    }
}
