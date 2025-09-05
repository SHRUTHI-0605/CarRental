package com.example.carrental_project.service;

import java.util.List;

import com.example.carrental_project.entity.Car;

public interface CarService {
	Car saveCar(Car car);
	List<Car> getAllCars();
	Car getCarById(Long id);
	Car updateCar(Long id,Car car);
    void deleteCar(Long id);	

}
