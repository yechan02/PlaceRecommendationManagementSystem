package RestaurantCafe;

import java.util.Scanner;

public class Koreanfood extends RestaurantCafe {
	
	public Koreanfood(RestaurantCafekind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setArea(input);
		setName(input);
		setFood(input);
		setPrice(input);
	}
	
	public void printInfo() {
		String skind = getkindString();
		System.out.println("kind:" + skind + "Area:" + Area + "Name:" + Name + " Food:" + Food + "Price:" + Price);	  		
	}
}
