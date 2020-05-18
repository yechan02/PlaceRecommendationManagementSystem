package TouristSpot;

import java.util.Scanner;

public class Touristattraction extends TouristSpot {
	
	public Touristattraction(TouristSpotkind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setArea(input);
		setName(input);
	}
	
	public void printInfo() {
		String skind = getkindString();
		System.out.println("kind:" + skind + "Area:" + Area + "Name:" + Name);	  	
	}
}
