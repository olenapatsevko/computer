package computer.service;

import com.google.common.collect.Lists;
import computer.entity.Laptop;
import computer.repositories.LaptopRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class LaptopService {


    private LaptopRepository laptopRepository;


    public List<Laptop> getAllLaptops() {
        return Lists.newArrayList(laptopRepository.findAll());
    }

    public void deleteLaptop(long id) {
        laptopRepository.deleteById(id);
    }
}
