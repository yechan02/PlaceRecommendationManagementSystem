package manager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import RestaurantCafe.Chinesefood;
import RestaurantCafe.Koreanfood;
import RestaurantCafe.RestaurantCafe;
import RestaurantCafe.RestaurantCafeInput;
import RestaurantCafe.RestaurantCafekind;
import RestaurantCafe.TeaDessert;

public class RestaurantCafeManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5331480528682187122L;
	
	ArrayList<RestaurantCafeInput> RestaurantsCafes = new ArrayList<RestaurantCafeInput>();
	transient Scanner input;
	RestaurantCafeManager(Scanner input) {
		this.input = input;
	}
	
	public void addRestaurantCafe () {
		int kind = 0;
		RestaurantCafeInput RestaurantCafeInput;
		while (kind < 1 || kind > 3) {
			try {
				System.out.println("1 for Korean food  ");
				System.out.println("2 for Chinese food  ");
				System.out.println("3 for TeaDessert  ");
				System.out.print("Select num 1, 2, or 3 for RestaurantCafe kind:");
				kind = input.nextInt();
				if (kind == 1) {
					RestaurantCafeInput = new Koreanfood(RestaurantCafekind.Koreanfood);
					RestaurantCafeInput.getUserInput(input);
					RestaurantsCafes.add(RestaurantCafeInput);
					break;
				}
				else if (kind == 2) {
					RestaurantCafeInput = new Chinesefood(RestaurantCafekind.Chinesefood);
					RestaurantCafeInput.getUserInput(input);
					RestaurantsCafes.add(RestaurantCafeInput);
					break;
				}
				else if (kind == 3) {
					RestaurantCafeInput = new TeaDessert(RestaurantCafekind.TeaDessert);
					RestaurantCafeInput.getUserInput(input);
					RestaurantsCafes.add(RestaurantCafeInput);
					break;
				}
				else {
					System.out.print("Select num for RestaurantCafe kind:");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 3!");
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;	
			}
		}
	}
	
	public void deleteRestaurantCafe () {	
		System.out.print("Name:");
		String Name = input.next();
		int index = findIndex(Name);
		RemovefromRestaurantCafe(index, Name);
	}
	
	public int findIndex(String Name) {
		int index = -1;
		for (int i = 0; i<RestaurantsCafes.size(); i++) {
			if (Name.equals(RestaurantsCafes.get(i).getName())) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int RemovefromRestaurantCafe(int index, String Name) {
		if (index >= 0) {
			RestaurantsCafes.remove(index);
			System.out.println("the RestaurantCafe" + Name + "is deleted");
			return 1;
		}
		else {
			System.out.println("the RestaurantCafe has not been regestered");
			return -1;
		}
	}
	
    public void editRestaurantCafe () {	
    	System.out.print("Name:");
		String Name = input.next();
		for (int i = 0; i<RestaurantsCafes.size(); i++) {
			RestaurantCafeInput RestaurantCafe = RestaurantsCafes.get(i);
			if (Name.equals(RestaurantCafe.getName())) {
				int num = -1;
				while (num !=5) {
					ShowEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						RestaurantCafe.setArea(input);
						break;
					case 2:
						RestaurantCafe.setName(input);
						break;
					case 3:
						RestaurantCafe.setFood(input);
						break;
					case 4:
						RestaurantCafe.setPrice(input);
						break;
					default:
						continue;
					}
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
	
	public int size() {
		return RestaurantsCafes.size();
	}
	
	public RestaurantCafeInput get(int index) {
		return (RestaurantCafe) RestaurantsCafes.get(index);
	}
	
	public void ShowEditMenu() {
		System.out.println("** Restaurant,Cafe Edit Menu **");
		System.out.println("1. Edit Area");
		System.out.println("2. Edit Name");
		System.out.println("3. Edit Food");
		System.out.println("4. Edit Price");
		System.out.println("5. See You Again");
		System.out.println("Slect one number between 1 - 5");		
	}
}