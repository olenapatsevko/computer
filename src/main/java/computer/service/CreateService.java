package computer.service;


import computer.repositories.ComputerRepository;
import computer.repositories.LaptopRepository;
import dto.Laptop;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CreateService {

    private LaptopRepository laptopRepository;
    private ComputerRepository computerRepository;


    public void insertLaptop(Laptop laptop) {
        computer.entity.Laptop laptop1 = laptop.getLaptop();
        laptop1.setComputer(computerRepository.save(laptop.getComputer()));
        laptopRepository.save(laptop1);

    }

}
