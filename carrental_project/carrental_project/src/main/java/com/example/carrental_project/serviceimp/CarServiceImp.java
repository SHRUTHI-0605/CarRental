package com.example.carrental_project.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.carrental_project.entity.Car;
import com.example.carrental_project.repository.CarRepository;
import com.example.carrental_project.service.CarService;

@Service
public class CarServiceImp implements CarService {
	@Autowired
	private CarRepository carrepo;
	@Override
	public Car saveCar(Car car) {
		return carrepo.save(car);
		
	}
	
	@Override
	public Car getCarById(Long id) {
		return carrepo.findById(id)
				.orElseThrow(() -> new RuntimeException("Product not found with id" + id));
		
	}
	@Override
	public List<Car> getAllCars()
	{
		return carrepo.findAll();
		
	}
	@Override
	public Car updateCar(Long id, Car car) {
		Car existingCar = carrepo.findById(id)
				.orElseThrow(() -> new RuntimeException("Product not found with id" + id));
		
		existingCar.setModel(car.getModel());
		existingCar.setRate(car.getRate());
		existingCar.setLplate(car.getLplate());
		return carrepo.save(existingCar);
		
		
	}
 @Override
 public void deleteCar(Long id) {
	 carrepo.deleteById(id);
 }
		

}
