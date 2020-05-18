package Accommodation;

import java.util.Scanner;

public class Hotel extends Accommodation {
	
	public Hotel(Accommodationkind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setArea(input);
		setName(input);
		setPrice(input);
	}
	
	public void printInfo() {
		String skind = getkindString();
		System.out.println("kind:" + skind + "Area:" + Area + "Name:" + Name + "Price:" + Price);	  	
	}
}
