package computer.repositories;

import computer.entity.Laptop;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LaptopRepository extends CrudRepository<Laptop, Long> {

}
