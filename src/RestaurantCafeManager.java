import java.util.ArrayList;
import java.util.Scanner;

import RestaurantCafe.Chinesefood;
import RestaurantCafe.RestaurantCafe;
import RestaurantCafe.RestaurantCafekind;
import RestaurantCafe.TeaDessert;

public class RestaurantCafeManager {
	ArrayList<RestaurantCafe> RestaurantsCafes = new ArrayList<RestaurantCafe>();
	Scanner input;
	RestaurantCafeManager(Scanner input) {
		this.input = input;
	}
	
	public void addRestaurantCafe () {
		int kind = 0;
		RestaurantCafe RestaurantCafe;
		while (kind != 1 && kind !=2) {
			System.out.println("1 for Korean food  ");
			System.out.println("2 for Chinese food  ");
			System.out.println("3 for TeaDessert  ");
			System.out.print("Select num for RestaurantCafe kind:");
			kind = input.nextInt();
			if (kind == 1) {
				RestaurantCafe = new RestaurantCafe(RestaurantCafekind.Koreanfood);
				RestaurantCafe.getUserInput(input);
				RestaurantsCafes.add(RestaurantCafe);
				break;
			}
			else if (kind == 2) {
				RestaurantCafe = new Chinesefood(RestaurantCafekind.Chinesefood);
				RestaurantCafe.getUserInput(input);
				RestaurantsCafes.add(RestaurantCafe);
				break;
			}
			else if (kind == 3) {
				RestaurantCafe = new TeaDessert(RestaurantCafekind.TeaDessert);
				RestaurantCafe.getUserInput(input);
				RestaurantsCafes.add(RestaurantCafe);
				break;
			}
			else {
				System.out.print("Select num for RestaurantCafe kind:");
			}
		}
	}
	
	public void deleteRestaurantCafe () {	
		System.out.print("Name:");
		String Name = input.next();
		int index = -1;
		for (int i = 0; i<RestaurantsCafes.size(); i++) {
			if (Name.equals(RestaurantsCafes.get(i).getName())) {
				index = i;
				break;
			}
		}
		
		if (index >= 0) {
			RestaurantsCafes.remove(index);
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
			if (Name.equals(RestaurantCafe.getName())) {
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
						String area = input.next();
						RestaurantCafe.setArea(area);
					}
					else if (num == 2) {
						System.out.print("Name:");
						String name = input.next();
						RestaurantCafe.setName(name);
					}
					else if (num == 3) {
						System.out.print("Food:");
						String food = input.next();
						RestaurantCafe.setFood(food);
					}
					else if (num == 4) {
						System.out.print("Price:");
						int price = input.nextInt();
						RestaurantCafe.setPrice(price);
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
		System.out.println("# of registered RestaurantsCafes:" + RestaurantsCafes.size());
		for (int i = 0; i<RestaurantsCafes.size(); i++) {
			RestaurantsCafes.get(i).printInfo();
		}
	}
}
