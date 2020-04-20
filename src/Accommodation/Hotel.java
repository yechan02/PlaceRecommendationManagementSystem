package Accommodation;

import java.util.Scanner;

public class Hotel extends Accommodation {
	
	public void getUserInput(Scanner input) {
		System.out.print("Area:");
		String Area = input.next();
		this.setArea(Area);
		
		System.out.print("Name:");
		String Name = input.next();
		this.setName(Name);
		
		System.out.print("Price:");
		int Price = input.nextInt();
		this.setPrice(Price);
	}
}
