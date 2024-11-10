package com.skilldistillery.jets.entities;


public class PassengerJet extends Jet {

	public PassengerJet(String model, int speed, int range, double price) {
		super(model, speed, range, price);
	}
	
	@Override
	public String toString() {
		return "Passenger Jet \n Model: "+ getModel()  + "\n Speed: " + getSpeed() + "MPH \n Range: " + getRange()
				+ "\n Price: $" + getPrice();
	}

	

}
