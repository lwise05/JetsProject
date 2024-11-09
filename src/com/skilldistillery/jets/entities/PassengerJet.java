package com.skilldistillery.jets.entities;

public class PassengerJet extends Jet {

	public PassengerJet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PassengerJet(String model, int speed, int range, double price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}
//	@Override
//	public void fly() {
////		double fuelRange = getRange() / this.getSpeed();
////		System.out.println("Model " + getModel() + ", Speed()=" + getSpeed() + "MPH, Range()=" + getRange()
////			+ ", Price()= $" + getPrice() + ". It can fly for " + fuelRange + " before needing to refuel.");	
//	}
//	
//	@Override
//	public String toString() {
//		return "Passenger Jet [Model()=" + getModel() + ", Speed()=" + getSpeed() + "MPH, Range()=" + getRange()
//				+ ", Price()= $" + getPrice() ;
//	}

}
