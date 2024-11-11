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

	@Override
	public void fly() {
		double fuelRange = getRange() / getSpeed();
		System.out.println(
				"The Passenger Jet, Model " + getModel() + " is flying! \nThis aircraft is priced at $" + getPrice()
						+ ".\nIt can go up to " + getSpeed() + "MPH (mach " + getSpeedInMach() + "). \nIt can fly for "
						+ getRange() + " miles, which is close to " + fuelRange + " hours before needing to refuel.");
		System.out.println();
	}

} 
