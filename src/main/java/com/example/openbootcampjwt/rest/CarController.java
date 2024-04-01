package com.example.openbootcampjwt.rest;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.openbootcampjwt.domain.Car;
import com.example.openbootcampjwt.service.CarService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/api")
public class CarController {

    private final Logger log = LoggerFactory.getLogger(CarController.class);

    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars/{id}")
    @ApiOperation("Buscar carro por id")
    public ResponseEntity<Car> findById(@ApiParam("Clave primaria car") @PathVariable Long id){

        log.info("Rest request to find one car");

        Optional<Car> carOptional = this.carService.findById(id);

        if(carOptional.isPresent()){
            return ResponseEntity.ok(carOptional.get());
        }

        return ResponseEntity.notFound().build();
    }

    @GetMapping("/cars")
    public List<Car> findAll(){
        log.info("REST request to find all cars");

        return this.carService.findAll();
    }

    @PostMapping("/cars")
    public ResponseEntity<Car> create(@RequestBody Car car){
        log.info("REST request to create a new car");

        if(car.getId() != null){
            log.warn("Trying to create a new car with existent Id");
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(this.carService.save(car));
    }
}
