package edu.by.services;

import edu.by.entity.Car;
import edu.by.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Sukora Stas.
 */
@Service
public class CarService {
    @Autowired
    CarRepository carRepositiry;
    private List<Car> all;


    public List<Car> getAll() {
        return (List<Car>) carRepositiry.findAll();
    }


    public Car getById(Long id) {
        return carRepositiry.findOne(id);
    }

    public Car create(Car car) {
        return carRepositiry.save(car);
    }

    public void delete(long id) {
        carRepositiry.delete(id);
    }
}
