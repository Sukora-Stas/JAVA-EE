package edu.by.controller;

import edu.by.entity.Car;
import edu.by.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sukora Stas.
 */
@RestController
public class CarController {
    @Autowired
    private CarService carService;
    @GetMapping("/addCar")
    public List<Car> getCar(){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1L, "Audi", 1197));
        cars.add(new Car(1l,"BMW",1256));
        return cars;
    }


    @GetMapping("/cars")
    public List<Car> getAll(){
        return  carService.getAll();
    }

    @GetMapping("cars/{id}")
    public Car getById(@PathVariable Long id){
        return carService.getById(id);
    }
    @PostMapping("/cars")
    public Car create(@RequestBody Car car){
        return carService.create(car);
    }

    @DeleteMapping("/cars/{id}")
    public void delete (@PathVariable long id){
        carService.delete(id);
    }

}
