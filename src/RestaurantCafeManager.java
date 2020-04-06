import java.util.Scanner;

public class RestaurantCafeManager {
	RestaurantCafe RestaurantCafe;
	Scanner input;
	RestaurantCafeManager(Scanner input) {
		this.input = input;
	}
	
	public void addRestaurantCafe () {
		RestaurantCafe = new RestaurantCafe();
		System.out.print("Area:");
		RestaurantCafe.Area = input.next();
		System.out.print("Name:");
		RestaurantCafe.Name = input.next();
		System.out.print("Food:");
		RestaurantCafe.Food = input.next();
		System.out.print("Price:");
		RestaurantCafe.Price = input.nextInt();
	}
	
	public void deleteRestaurantCafe () {	
		System.out.print("Area:");
		String Area = input.next();
		if (Area.equals(RestaurantCafe.Area)) {
			RestaurantCafe = null;
			System.out.println("the RestaurantCafe is deleted");
		}
		else System.out.println("the RestaurantCafe has not been regestered");
			return;
	}
	
    public void editRestaurantCafe () {	
    	System.out.print("Area:");
		String Area = input.next();
		if (Area.equals(RestaurantCafe.Area)) {
			System.out.println("the RestaurantCafe to be edited is" + Area);
		}
	}
    
	public void viewRestaurantCafe () {	
		System.out.print("Area:");
		String Area = input.next();
		if (Area.equals(RestaurantCafe.Area)) {
			RestaurantCafe.printInfo();
		}
	}

}
