package RestaurantCafe;

import java.util.Scanner;

public abstract class Fusionfood extends RestaurantCafe {
	
	public Fusionfood(RestaurantCafekind kind) {
		super(kind);
	}

	@Override
	public abstract void getUserInput(Scanner input);

	@Override
	public void printInfo() {
		String skind = getkindString();
		System.out.println("kind:" + skind + "Area:" + Area + "Name:" + Name + " Food:" + Food + "Price:" + Price);	  		
	}
	
	public void setFoodwithTD(Scanner input) {
		char answer = 'x';
		while (answer != 't' && answer != 'T' && answer != 'd' && answer != 'D') {
			System.out.print("Tea or Dessert? (T/D)");
			answer = input.next().charAt(0);
			if (answer == 't' || answer == 'T') {
				setFood(input);
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
				setFood(input);
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
	}
}
