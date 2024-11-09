package com.skilldistillery.jets.entities;

import com.skilldistillery.jets.app.CombatReady;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet () {
		super();
	}

	public FighterJet(String model, int speed, int range, double price) {
		super(model, speed, range, price);
		
	}

	@Override
	public void fight() {
		System.out.println("Fighter jets are fighting!");
	}
	
	
	
	
}
