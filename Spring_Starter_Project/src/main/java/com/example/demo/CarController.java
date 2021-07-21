package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
    
	@RequestMapping("/cars")
	public List<Car> gerAllCars(){
		
		return Arrays.asList(
				
				new Car("e10", "Toyota Prius", "Black"),
				new Car("e11", "Toyota Corolla", "White"),
				new Car("e12", "Toyota Yaris", "Blue")
				);
	}
}
