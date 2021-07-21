package com.example.demo;

public class Car {
	
	private String carId;
	private String carColor;
	private String carName;
	
	//blank Constructor
	public Car() {
	
	}
	
	//constructoe of car class
	public Car(String carId, String carColor, String carName) {
		super();
		this.carId = carId;
		this.carColor = carColor;
		this.carName = carName;
	}
	public String getCarId() {
		return carId;
	}
	public void setCarId(String carId) {
		this.carId = carId;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	
	

}
