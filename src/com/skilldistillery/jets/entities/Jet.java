package com.skilldistillery.jets.entities;

public abstract class Jet {
	
	private String model;
	private int speed;
	private int range;
	private double price;
	
	public Jet (){
		
	}
	
	public Jet(String model, int speed, int range, double price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}


	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
//	This prints out the to string but doesn't specify the class names (cargo, fighter, passenger)

	public String toString() {
		return "Jet [model=" + model + ", speed=" + speed + " MPH " + ", range=" + range + ", price= $" + price + "]";
	}
	 
	
	public void fly() {
		//override in all subclasses
		double fuelRange = range / speed;
		System.out.println("Model " + model + " is flying! This aircraft is priced at $" + price + " and can go up to " + speed + "MPH (mach " + getSpeedInMach() + "). It can fly for " + range
			+ " miles, which is close to " + fuelRange + " hours before needing to refuel.");	
	}
	
	
	
	public double getSpeedInMach() {
		// look up how to convert mph to mach
		double mach = speed / 767.269;
		//no need to override 
		return mach;
	}
	
}
