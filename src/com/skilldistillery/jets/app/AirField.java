package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.jets.entities.CargoJet;
import com.skilldistillery.jets.entities.FighterJet;
import com.skilldistillery.jets.entities.Jet;
import com.skilldistillery.jets.entities.PassengerJet;

public class AirField {

	private List<Jet> fleet = new ArrayList<>();
		
	// no other fields
	
	public AirField() {
		loadJetsFromFile("Jets.txt");
		
	}
	
	
	private void loadJetsFromFile(String fileName) {
		
		  try ( BufferedReader bufIn = new BufferedReader(new FileReader(fileName)) ) {
			  String line;
			  while ((line = bufIn.readLine()) != null) {
				  //convert line to array
				String [] jetFields = line.split(", ");
				String jetType = jetFields [0];
				String model = jetFields [1];
				int speed = Integer.parseInt(jetFields [2]);
				int range = Integer.parseInt(jetFields [3]);
				double price = Double.parseDouble(jetFields [4]);
				
				//construct object
				switch (jetType) {
				case "Cargo Jet" :
					Jet cargoJet = new CargoJet (model, speed, range, price);
					fleet.add(cargoJet);
					break;
					
				case "Fighter Jet":
					Jet FighterJet = new FighterJet (model, speed, range, price);
					fleet.add(FighterJet);
					break;
					
				case "Passenger Jet":
					Jet PassengerJet = new PassengerJet (model, speed, range, price);
					fleet.add(PassengerJet);
					break;
					
				default:
					break;
				}
			  }
			}
			catch (IOException e) {
			  System.err.println(e);
			}
	
		}
	
	public void listJets() {
// print out jet vs fleet. fleet would print out the entire list rather than the individual jet
		for (Jet jet : fleet) { 
			System.out.println(jet); 
		 }
	}
	
	public void flyJets() {
		for (Jet jet : fleet) {
		jet.fly();
		}
	}
	
	public Jet fastestJet() {
//		int maxSpeed = fleet.get(0).getSpeed();
		Jet fastest = fleet.get(0);
		for (int i = 0 ; i < fleet.size() ; i++) {
			if (fastest.getSpeed() < fleet.get(i).getSpeed()) {
				fastest = fleet.get(i);
			}
		}
		return fastest;
	}
	
	
	public Jet longestRange() {
		Jet longestRange = fleet.get(0);
		for (int i = 0 ; i < fleet.size() ; i++) {
			if (longestRange.getRange() < fleet.get(i).getRange()) {
				longestRange = fleet.get(i);
			}
		}
		return longestRange;
	}
	
	public void cargo () {
		//how to connect loadCargo method
	}
	
	public void fight () {
		//how to connect fight method
	}
	
	
	public void addJet(String model, int speed, int range, double price) {
		Jet newJet = new PassengerJet (model, speed, range, price);
		fleet.add(newJet);
		
	}
	
	public void removeJet () {
		
	}
	
	}

	
		
	
	//TODO public methods for handling jets


