package TouristSpot;

import java.util.Scanner;

public class Leisure extends TouristSpot {
	
	public void getUserInput(Scanner input) {
		System.out.print("Area:");
		String Area = input.next();
		this.setArea(Area);
		
		System.out.print("Name:");
		String Name = input.next();
		this.setName(Name);
	}

}
