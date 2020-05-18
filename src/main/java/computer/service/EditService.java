package computer.service;

import computer.dto.ComputerDTO;
import computer.repositories.ComputerRepository;
import computer.repositories.LaptopRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Data
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class EditService {

    private LaptopRepository laptopRepository;
    private ComputerRepository computerRepository;

    public void editElement(ComputerDTO model) {
        laptopRepository.save(model.getLaptop());
        computerRepository.save(model.getComputer());
    }
}
