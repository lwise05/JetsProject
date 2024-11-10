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
	
	
	
	
}
