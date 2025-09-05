package com.example.carrental_project.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.carrental_project.entity.Car;
import com.example.carrental_project.service.CarService;

@RestController
@RequestMapping("/api/Car")
public class CarController {
	private final CarService carService;
	
	public CarController(CarService carService) {
		this.carService= carService;
		}
   @PostMapping
	public Car createCar(@RequestBody Car car) {
	   return carService.saveCar(car);
   }
   @GetMapping("/{id}")
	public Car getCarById(@PathVariable Long id) {
	   return carService.getCarById(id);
  }
   
   @PutMapping("/{id}")
	public Car updateCar(@PathVariable Long id,@RequestBody Car car) {
	   return carService.updateCar(id ,car);
  }
   @DeleteMapping("/{id}")
	public void deleteCar(@PathVariable Long id) {
	    carService.deleteCar(id);
 }


}
