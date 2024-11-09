package com.skilldistillery.jets.entities;

import com.skilldistillery.jets.app.CargoCarrier;

public class CargoJet extends Jet implements CargoCarrier {
	
	
	public CargoJet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CargoJet(String model, int speed, int range, double price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void loadCargo() {
		System.out.println("Loading up the jet now! Looks like we'll be transporting some mail and packages. ");
		
	}

	
	
	
	
}
