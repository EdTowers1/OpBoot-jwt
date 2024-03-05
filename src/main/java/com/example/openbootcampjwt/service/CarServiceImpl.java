package com.example.openbootcampjwt.service;

import com.example.openbootcampjwt.domain.Car;
import com.example.openbootcampjwt.repository.CarRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {

    private static final Integer MIN_DOORS = 3;

    private final Logger log = LoggerFactory.getLogger(CarServiceImpl.class);

    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository){ this.carRepository =carRepository; }

    @Override
    public List<Car> findAll() {
        log.info("Executing findAll cars");
        return this.carRepository.findAll();
    }

    @Override
    public Optional<Car> findById(Long id) {
        log.info("Executing findById");
        return this.carRepository.findById(id);
    }

    @Override
    public Long count() {
        log.info("Get total number of cars");
        return this.carRepository.count();
    }

    @Override
    public Car save(Car car) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteAll(List<Car> cars) {

    }

    @Override
    public void deleteAllById(List<Long> ids) {

    }

    @Override
    public List<Car> findByDoors(Integer doors) {
        log.info("Executing findByDoors");

        if(doors < MIN_DOORS){
            log.warn("Trying to search less than allowed doors");
            return new ArrayList<>();
        }
        return this.carRepository.findByDoors(doors);
    }

    @Override
    public List<Car> findByManufacturerAndModel(String manufacturer, String model) {
        return null;
    }

    @Override
    public List<Car> findByDoorsGreaterThanEqual(Integer doors) {
        return null;
    }

    @Override
    public List<Car> findByModelContaining(String model) {
        return null;
    }

    @Override
    public List<Car> findByYearIn(List<Integer> years) {
        return null;
    }

    @Override
    public List<Car> findByYearBetween(Integer startYear, Integer endYear) {
        return null;
    }

    @Override
    public List<Car> findByReleaseDateBetween(LocalDate startDate, LocalDate endDate) {
        return null;
    }

    @Override
    public List<Car> findByAvailableTrue() {
        return null;
    }

    @Override
    public Long deleteAllByAvailableFalse() {
        return null;
    }
}
