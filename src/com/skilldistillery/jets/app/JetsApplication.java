package com.skilldistillery.jets.app;

import java.util.Scanner;

public class JetsApplication {
	
	private AirField airField = new AirField();
	private static Scanner sc;
	//no more fields. No list of jets.

	public static void main(String[] args) {
		JetsApplication app = new JetsApplication();
		sc = new Scanner(System.in);
		
		
		app.launch();
		sc.close();
	}

	private void launch() {
		//loop
		//displayUserMenu()
		//get choice from scanner
		//act on choice
	}
	
	private void displayUserMenu() {
		
	}

}
