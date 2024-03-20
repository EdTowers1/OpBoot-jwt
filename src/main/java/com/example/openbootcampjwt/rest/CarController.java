package com.example.openbootcampjwt.rest;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.openbootcampjwt.domain.Car;
import com.example.openbootcampjwt.service.CarService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

public class CarController {

    private final Logger log = LoggerFactory.getLogger(CarController.class);

    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars/{id}")
    @ApiOperation("Buscar choche por id")
    public ResponseEntity<Car> findById(@ApiParam("Clave primaria car") @PathVariable Long id){

        log.info("Rest request to find one car");

        Optional<Car> carOptiona = this.carService.findById(id);
    }
    

}
