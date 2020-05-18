package computer.service;


import computer.repositories.ComputerRepository;
import computer.repositories.LaptopRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
@Data
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class EditService {

    private LaptopRepository laptopRepository;
    private ComputerRepository computerRepository;

    public void editElement(Model model){

    }
}
