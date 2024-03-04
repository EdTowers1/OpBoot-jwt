package com.example.openbootcampjwt.service;

import com.example.openbootcampjwt.domain.Car;

import java.util.List;
import java.util.Optional;

public interface CarService {

    List<Car> findAll();

    Optional<Car> findById(Long id);

    Long count();

    Car save(Car car);

    void deleteById(Long id);

    void deleteAll();

    void deleteAll(List<Car> cars);

    void deleteAllById(List<Long> ids);

    //metodos customs
}
