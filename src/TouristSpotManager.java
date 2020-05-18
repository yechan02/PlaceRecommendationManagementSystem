import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import TouristSpot.Leisure;
import TouristSpot.TouristSpot;
import TouristSpot.TouristSpotInput;
import TouristSpot.TouristSpotkind;
import TouristSpot.Touristattraction;

public class TouristSpotManager {
	ArrayList<TouristSpotInput> TouristSpots = new ArrayList<TouristSpotInput>();
	Scanner input;
	TouristSpotManager(Scanner input) {
		this.input = input;
	}
	
	public void addTouristSpot () {
		int kind = 0;
		TouristSpotInput TouristSpotInput;
		while (kind < 1 || kind > 2) {
			try {
				System.out.println("1 for Touristattraction  ");
				System.out.println("2 for Leisure  ");
				System.out.print("Select num 1, 2 for TouristSpot kind:");
				kind = input.nextInt();
				if (kind == 1) {
					TouristSpotInput = new Touristattraction(TouristSpotkind.Touristattraction);
					TouristSpotInput.getUserInput(input);
					TouristSpots.add(TouristSpotInput);
					break;
				}
				else if (kind == 2) {
					TouristSpotInput = new Leisure(TouristSpotkind.Leisure);
					TouristSpotInput.getUserInput(input);
					TouristSpots.add(TouristSpotInput);
					break;
				}
				else {
					System.out.print("Select num for RestaurantCafe kind:");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 2!");
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;	
			}
		}
	}
	
	public void deleteTouristSpot () {	
		System.out.print("Name:");
		String Name = input.next();
		int index = findIndex(Name);
		RemovefromTouristSpot(index, Name);
	}
	
	public int findIndex(String Name) {
		int index = -1;
		for (int i = 0; i<TouristSpots.size(); i++) {
			if (Name.equals(TouristSpots.get(i).getName())) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int RemovefromTouristSpot(int index, String Name) {
		if (index >= 0) {
			TouristSpots.remove(index);
			System.out.println("the TouristSpot" + Name + "is deleted");
			return 1;
		}
		else {
			System.out.println("the TouristSpot has not been regestered");
			return -1;
		}		
	}
	
	public void editTouristSpot () {	
		System.out.print("Name:");
		String Name = input.next();
		for (int i = 0; i<TouristSpots.size(); i++) {
			TouristSpotInput TouristSpot = TouristSpots.get(i);
			if (Name.equals(TouristSpot.getName())) {
				int num = -1;
				while (num !=3) {
					ShowEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						TouristSpot.setArea(input);
						break;
					case 2:
						TouristSpot.setName(input);
						break;
					default:
						continue;
					}
				} // while
				break;
			} // if
		} // for
	}
	
	public void viewTouristSpot () {	
//    	System.out.print("Area:");
//		String Area = input.next();
		System.out.println("# of registered TouristSpots:" + TouristSpots.size());
		for (int i = 0; i<TouristSpots.size(); i++) {
			TouristSpots.get(i).printInfo();
		}
	}

	public void ShowEditMenu() {
		System.out.println("** TouristSpot Edit Menu **");
		System.out.println("1. Edit Area");
		System.out.println("2. Edit Name");
		System.out.println("3. See You Again");
		System.out.println("Slect one number between 1 - 3");		
	}
}
