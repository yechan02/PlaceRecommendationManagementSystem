import java.util.ArrayList;
import java.util.Scanner;

import RestaurantCafe.Chinesefood;
import RestaurantCafe.RestaurantCafe;
import TouristSpot.Leisure;
import TouristSpot.TouristSpot;

public class TouristSpotManager {
	ArrayList<TouristSpot> TouristSpots = new ArrayList<TouristSpot>();
	Scanner input;
	TouristSpotManager(Scanner input) {
		this.input = input;
	}
	
	public void addTouristSpot () {
		int kind = 0;
		TouristSpot TouristSpot;
		while (kind != 1 && kind !=2) {
			System.out.print("1 for Touristattraction  ");
			System.out.print("2 for Leisure  ");
			System.out.print("Select num for TouristSpot kind:");
			kind = input.nextInt();
			if (kind == 1) {
				TouristSpot = new TouristSpot();
				TouristSpot.getUserInput(input);
				TouristSpots.add(TouristSpot);
				break;
			}
			else if (kind == 2) {
				TouristSpot = new Leisure();
				TouristSpot.getUserInput(input);
				TouristSpots.add(TouristSpot);
				break;
			}
			else {
				System.out.print("Select num for RestaurantCafe kind:");
			}
		}
	}
	
	public void deleteTouristSpot () {	
		System.out.print("Name:");
		String Name = input.next();
		int index = -1;
		for (int i = 0; i<TouristSpots.size(); i++) {
			if (Name.equals(TouristSpots.get(i).getName())) {
				index = i;
				break;
			}
		}
		
		if (index >= 0) {
			TouristSpots.remove(index);
			System.out.println("the TouristSpot" + Name + "is deleted");
		}
		else {
			System.out.println("the TouristSpot has not been regestered");
			return;
		}
	}
	
	public void editTouristSpot () {	
		System.out.print("Name:");
		String Name = input.next();
		for (int i = 0; i<TouristSpots.size(); i++) {
			TouristSpot TouristSpot = TouristSpots.get(i);
			if (Name.equals(TouristSpot.getName())) {
				int num = -1;
				while (num !=3) {
					System.out.println("** TouristSpot Edit Menu **");
					System.out.println("1. Edit Area");
					System.out.println("2. Edit Name");
					System.out.println("3. See You Again");
					System.out.println("Slect one number between 1 - 3");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Area:");
						String area = input.next();
						TouristSpot.setArea(area);
					}
					else if (num == 2) {
						System.out.print("Name:");
						String name = input.next();
						TouristSpot.setName(name);
					}
					else {
						continue;
					} // if
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

}
