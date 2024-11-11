package com.skilldistillery.jets.entities;

import com.skilldistillery.jets.app.CombatReady;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet () {
		super();
	}


	public FighterJet(String model, int speed, int range, double price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}
 
	@Override
	public void fight() {
		System.out.println("Fighter jets are fighting!");
	}
	
	@Override
	public String toString() {
		return "Fighter Jet \n Model: "+ getModel()  + "\n Speed: " + getSpeed() + "MPH \n Range: " + getRange()
				+ "\n Price: $" + getPrice();
	}
	
	@Override
	public void fly() {
		double fuelRange = getRange() / getSpeed();
		System.out.println(
				"The Fighter Jet, Model " + getModel() + " is flying! \nThis aircraft is priced at $" + getPrice()
						+ ".\nIt can go up to " + getSpeed() + "MPH (mach " + getSpeedInMach() + "). \nIt can fly for "
						+ getRange() + " miles, which is close to " + fuelRange + " hours before needing to refuel.");
		System.out.println();
	}
	
	
	
}
