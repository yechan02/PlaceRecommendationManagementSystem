package RestaurantCafe;

import java.util.Scanner;

public class TeaDessert extends Fusionfood {
	
	protected String Foodtype;
	
	public TeaDessert(RestaurantCafekind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setArea(input);
		setName(input);
		setFoodwithTD(input);		
		setPrice(input);
	}	
}
