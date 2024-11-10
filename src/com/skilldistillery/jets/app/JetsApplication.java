package com.skilldistillery.jets.app;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.skilldistillery.jets.entities.CargoJet;
import com.skilldistillery.jets.entities.Jet;

public class JetsApplication {

	private AirField airField = new AirField();

	Scanner sc; // initialized but no longer marked static
	// no more fields. No list of jets.

	public static void main(String[] args) {
		JetsApplication app = new JetsApplication();
		app.sc = new Scanner(System.in);

		app.launch();
		app.sc.close();
	}

	private void launch() {
		boolean keepgoing = true;
		int menuChoice;

		do {
			System.out.println();
			displayUserMenu();
			menuChoice = sc.nextInt();

			switch (menuChoice) {
			case 1:
				airField.listJets();
				break;

			case 2:
				airField.flyJets();
				break;

			case 3:
				Jet fastestJet = airField.fastestJet();
				System.out.println(fastestJet);
				break;

			case 4:
				Jet longestRange = airField.longestRange();
				System.out.println(longestRange);
				break;

			case 5:
				airField.cargo();
				break;

			case 6:
				airField.fight();
				break;

			case 7:
				addNewJet();
				break;

			case 8:
				remove();
				break;

			case 9:
				System.out.println("You are now exiting the program. Good-bye!");
				keepgoing = false;
				break;

			default:
				System.out.println("Oops! You entered an invalid option. Choose from 1-9 from the Menu.");
			}
		} while (keepgoing);

	}

	public void displayUserMenu() {

		System.out.println("*************************************");
		System.out.println("*              MENU                 *");
		System.out.println("*   Please choose from options 1-9  *");
		System.out.println("*                                   *");
		System.out.println("* 1. List fleet                     *");
		System.out.println("* 2. Fly all jets                   *");
		System.out.println("* 3. View fastest jet               *");
		System.out.println("* 4. View jet with longest range    *");
		System.out.println("* 5. Load all Cargo Jets            *");
		System.out.println("* 6. Dogfight!                      *");
		System.out.println("* 7. Add a jet to Fleet             *");
		System.out.println("* 8. Remove a jet from Fleet        *");
		System.out.println("* 9. Quit                           *");
		System.out.println("*                                   *");
		System.out.println("*************************************");

	}

	public void addNewJet() {
		Jet newJet;
		boolean keepGoing = true;
		String model = null;
		int speed = 0;
		int range = 0;
		double price = 0.0;

		System.out.println("Let's add a jet to the fleet.");

		System.out.println("Enter the model type: ");
		model = sc.next();

		while (keepGoing) {
			System.out.println("Enter how fast your jet will go: ");
			try {
				speed = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.err.println("Invalid input. Please enter in numbers");
				System.out.println(e);
				sc.nextLine();
			}
		}

		while (keepGoing) {
			System.out.println("Enter how far your jet will be travel: ");
			try {
				range = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.err.println("Invalid input. Please enter in numbers");
				System.out.println(e);
				sc.nextLine();
			}
		}

		while (keepGoing) {
			System.out.println("Enter in the price of your jet: ");
			try {
				price = sc.nextInt();
			} catch (InputMismatchException e) {
				System.err.println("Invalid input. Please enter in numbers");
				System.out.println(e);
				sc.nextLine();
			}
			keepGoing = false;
		}

		airField.addJet(model, speed, range, price);

	}
	
	public void remove () {
		airField.listJets();
		System.out.println();
		System.out.println("Please choose the number of jet you'd like removed");
		int jetChoice = sc.nextInt();
		airField.removeJet(jetChoice);
		
	}

	// add jet to fleet goes in this class but must continue
}
