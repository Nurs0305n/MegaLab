package kg.parking.carservices.controllers;

import kg.parking.carservices.models.Car;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class CarController {

    @PostMapping("/create")
    public Car create(@RequestBody Car car) {
        System.out.println(car);
        return car;
    }

}
