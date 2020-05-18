package Accommodation;

import java.util.Scanner;

public class Motel extends Accommodation {
	
	public Motel(Accommodationkind kind) {
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
