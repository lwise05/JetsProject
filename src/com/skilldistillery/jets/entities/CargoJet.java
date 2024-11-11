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
		System.out.println("Loading up the cargo jet now! Looks like we'll be transporting some mail and packages. ");

	}

	@Override
	public String toString() {
		return "Cargo Jet \n Model: " + getModel() + "\n Speed: " + getSpeed() + "MPH \n Range: " + getRange()
				+ "\n Price: $" + getPrice();
	}
	@Override
	public void fly() {
		double fuelRange = getRange() / getSpeed();
		System.out.println(
				"The Cargo Jet, Model " + getModel() + " is flying! \nThis aircraft is priced at $" + getPrice()
						+ ".\nIt can go up to " + getSpeed() + "MPH (mach " + getSpeedInMach() + "). \nIt can fly for "
						+ getRange() + " miles, which is close to " + fuelRange + " hours before needing to refuel.");
		System.out.println();
	}

}
