package RestaurantCafe;

import java.util.Scanner;

public class TeaDessert extends RestaurantCafe {
	
	protected String Foodtype;
	
	public TeaDessert(RestaurantCafekind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Area:");
		String Area = input.next();
		this.setArea(Area);
		
		System.out.print("Name:");
		String Name = input.next();
		this.setName(Name);
		
		char answer = 'x';
		while (answer != 't' && answer != 'T' && answer != 'd' && answer != 'D') {
			System.out.print("Tea or Dessert? (T/D)");
			answer = input.next().charAt(0);
			if (answer == 't' || answer == 'T') {
				System.out.print("What kind of Tea is it?:");
				String Food = input.next();
				this.setFood(Food);
				break;
			}
			else if (answer == 'd' || answer == 'D') {
				System.out.print("What kind of Dessert is it?:");
				String Food = input.next();
				this.setFood(Food);
				break;
			}
			else {
			}
		}
		
		answer = 'x';
		while (answer != 't' && answer != 'T' && answer != 'd' && answer != 'D') {
			System.out.print("Tea Name or Dessert Name? (T/D)");
			answer = input.next().charAt(0);
			if (answer == 't' || answer == 'T') {
				System.out.print("Tea Name:");
				String Food = input.next();
				this.setFood(Food);
				break;
			}
			else if (answer == 'd' || answer == 'D') {
				System.out.print("Dessert Name:");
				String Food = input.next();
				this.setFood(Food);
				break;
			}
			else {
			}
		}
		
		System.out.print("Price:");
		int Price = input.nextInt();
		this.setPrice(Price);
	}	
	
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case Koreanfood:
			skind = "Korea.";
			break;
		case Chinesefood:
			skind = "China";
			break;
		case Westernfood:
			skind = "West";
			break;
		case Japanesefood:
			skind = "Japan";
			break;
		case TeaDessert:
			skind = "Tea";
			break;
		default:
		}
		System.out.println("kind:" + skind + "Area:" + Area + "Name:" + Name + " Food:" + Food + "Foodtype:" + Food + "Price:" + Price);	  		
	}
}
