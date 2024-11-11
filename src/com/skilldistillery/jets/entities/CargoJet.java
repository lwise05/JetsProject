package com.skilldistillery.jets.entities;

import com.skilldistillery.jets.app.CargoCarrier;

public class CargoJet extends Jet implements CargoCarrier {
	
	 

	public CargoJet() {
		super();
	
	}

	public CargoJet(String model, int speed, int range, double price) {
		super(model, speed, range, price);
		
	}

	@Override
	public void loadCargo() {
		System.out.println("Loading up the jet now! Looks like we'll be transporting some mail and packages. ");
		
	}

	@Override
	public String toString() {
		return "Cargo Jet \n Model: "+ getModel()  + "\n Speed: " + getSpeed() + "MPH \n Range: " + getRange()
				+ "\n Price: $" + getPrice();
	}

	
	
	
	
}
