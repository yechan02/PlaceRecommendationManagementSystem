import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantCafeManager {
	ArrayList<RestaurantCafe> RestaurantsCafes = new ArrayList<RestaurantCafe>();
	Scanner input;
	RestaurantCafeManager(Scanner input) {
		this.input = input;
	}
	
	public void addRestaurantCafe () {
		RestaurantCafe RestaurantCafe = new RestaurantCafe();
		System.out.print("Area:");
		RestaurantCafe.Area = input.next();
		System.out.print("Name:");
		RestaurantCafe.Name = input.next();
		System.out.print("Food:");
		RestaurantCafe.Food = input.next();
		System.out.print("Price:");
		RestaurantCafe.Price = input.nextInt();
		RestaurantsCafes.add(RestaurantCafe);
	}
	
	public void deleteRestaurantCafe () {	
		System.out.print("Name:");
		String Name = input.next();
		int index = -1;
		for (int i = 0; i<RestaurantsCafes.size(); i++) {
			if (Name.equals(RestaurantsCafes.get(i).Name)) {
				index = i;
				break;
			}
		}
		
		if (index >= 0) {
			RestaurantsCafes.remove(index);
			RestaurantCafe.numRestaurantCafeRegistered--;
			System.out.println("the RestaurantCafe" + Name + "is deleted");
		}
		else {
			System.out.println("the RestaurantCafe has not been regestered");
			return;
		}
	}
	
    public void editRestaurantCafe () {	
    	System.out.print("Name:");
		String Name = input.next();
		for (int i = 0; i<RestaurantsCafes.size(); i++) {
			RestaurantCafe RestaurantCafe = RestaurantsCafes.get(i);
			if (Name.equals(RestaurantCafe.Name)) {
				int num = -1;
				while (num !=5) {
					System.out.println("** Restaurant,Cafe Edit Menu **");
					System.out.println("1. Edit Area");
					System.out.println("2. Edit Name");
					System.out.println("3. Edit Food");
					System.out.println("4. Edit Price");
					System.out.println("5. See You Again");
					System.out.println("Slect one number between 1 - 5");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Area:");
						RestaurantCafe.Area = input.next();
					}
					else if (num == 2) {
						RestaurantCafe.Area = input.next();
						System.out.print("Name:");
					}
					else if (num == 3) {
						System.out.print("Food:");
						RestaurantCafe.Food = input.next();
					}
					else if (num == 4) {
						System.out.print("Price:");
						RestaurantCafe.Price = input.nextInt();
					}
					else {
						continue;
					} // if
				} // while
				break;
			} // if
		} // for
	}
    
	public void viewRestaurantCafe () {	
//		System.out.print("Area:");
//		String Area = input.next();
		System.out.println("# of registered RestaurantsCafes:" + RestaurantCafe.numRestaurantCafeRegistered);
		for (int i = 0; i<RestaurantsCafes.size(); i++) {
			RestaurantsCafes.get(i).printInfo();
		}
	}
}
