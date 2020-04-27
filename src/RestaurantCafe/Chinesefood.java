package RestaurantCafe;

import java.util.Scanner;

public class Chinesefood extends RestaurantCafe {
	
	public Chinesefood(RestaurantCafekind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Area:");
		String Area = input.next();
		this.setArea(Area);
		
		System.out.print("Name:");
		String Name = input.next();
		this.setName(Name);
		
		System.out.print("Food:");
		String Food = input.next();
		this.setFood(Food);
		
		System.out.print("Price:");
		int Price = input.nextInt();
		this.setPrice(Price);
	}	
}
