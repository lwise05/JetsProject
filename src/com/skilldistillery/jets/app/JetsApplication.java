package com.skilldistillery.jets.app;

import java.util.Scanner;

public class JetsApplication {

	private AirField airField = new AirField();
	private static Scanner sc;
	// no more fields. No list of jets.

	public static void main(String[] args) {
		JetsApplication app = new JetsApplication();
		sc = new Scanner(System.in);

		app.launch();
		app.sc.close();
	}

	private void launch() {
		int menuChoice = sc.nextInt();
		
		do {
		displayUserMenu();
		menuChoice = sc.nextInt();
		
		switch(menuChoice) {
		case 1:
			break;
			
		case 2:
			break;
			
		case 3:
			break;
			
		case 4:
			break;
			
		case 5:
			break;
			
		case 6:
			break;
			
		case 7:
			break;
			
		case 8:
			break;
			
		case 9:
			break;
			
		default:
				System.out.println("Oops! You entered an invalid option. Choose from 1-9 from the Menu.");
			
		
		//act on choice
		} while (menuChoice < 9);
		
		}
	

	private void displayUserMenu() {

		System.out.println();
		System.out.println("1. List fleet");
		System.out.println("2. Fly all jets");
		System.out.println("3. View fastest jet");
		System.out.println("4. View jet with longest range");
		System.out.println("5. Load all Cargo Jets");
		System.out.println("6. Dogfight!");
		System.out.println("7. Add a jet to Fleet");
		System.out.println("8. Remove a jet from Fleet");
		System.out.println("9. Quit");
		System.out.println();

	}

	// add jet to fleet goes in this class but must continue
}

