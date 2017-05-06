package edu.by.repository;

import edu.by.entity.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Sukora Stas.
 */
@Repository
public interface CarRepository extends CrudRepository<Car,Long>{

}
