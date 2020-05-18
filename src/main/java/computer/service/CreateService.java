package computer.service;

import computer.dto.LaptopDTO;
import computer.repositories.ComputerRepository;
import computer.repositories.LaptopRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CreateService {

    private LaptopRepository laptopRepository;
    private ComputerRepository computerRepository;

    public void insertLaptop(LaptopDTO laptopDTO) {
        computer.entity.Laptop laptop1 = laptopDTO.getLaptop();
        laptop1.setComputer(computerRepository.save(laptopDTO.getComputer()));
        laptopRepository.save(laptop1);

    }

}
