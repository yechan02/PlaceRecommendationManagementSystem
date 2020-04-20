import java.util.ArrayList;
import java.util.Scanner;

import Accommodation.Accommodation;
import Accommodation.Hotel;
import RestaurantCafe.Chinesefood;
import RestaurantCafe.RestaurantCafe;

public class AccommodationManager {
	ArrayList<Accommodation> Accommodations = new ArrayList<Accommodation>();
	Scanner input;
	AccommodationManager(Scanner input) {
		this.input = input;
	}

	public void addAccommodation () {
		int kind = 0;
		Accommodation Accommodation;
		while (kind != 1 && kind !=2) {
			System.out.print("1 for Motel  ");
			System.out.print("2 for Hotel  ");
			System.out.print("Select num for Accommodation kind:");
			kind = input.nextInt();
			if (kind == 1) {
				Accommodation = new Accommodation();
				Accommodation.getUserInput(input);
				Accommodations.add(Accommodation);
				break;
			}
			else if (kind == 2) {
				Accommodation = new Hotel();
				Accommodation.getUserInput(input);
				Accommodations.add(Accommodation);
				break;
			}
			else {
				System.out.print("Select num for RestaurantCafe kind:");
			}
		}
	}
	
	public void deleteAccommodation () {	
		System.out.print("Name:");
		String Name = input.next();
		int index = -1;
		for (int i = 0; i<Accommodations.size(); i++) {
			if (Name.equals(Accommodations.get(i).getName())) {
				index = i;
				break;
			}
		}
		
		if (index >= 0) {
			Accommodations.remove(index);
			System.out.println("the Accommodation" + Name + "is deleted");
		}
		else {
			System.out.println("the Accommodation has not been regestered");
			return;
		}
	}
	
	
    public void editAccommodation () {	
		System.out.print("Name:");
		String Name = input.next();
		for (int i = 0; i<Accommodations.size(); i++) {
			Accommodation Accommodation = Accommodations.get(i);
			if (Name.equals(Accommodation.getName())) {
				int num = -1;
				while (num !=4) {
					System.out.println("** Accommodation Edit Menu **");
					System.out.println("1. Edit Area");
					System.out.println("2. Edit Name");
					System.out.println("3. Edit Price");
					System.out.println("4. See You Again");
					System.out.println("Slect one number between 1 - 5");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Area:");
						String area = input.next();
						Accommodation.setArea(area);
					}
					else if (num == 2) {
						System.out.print("Name:");
						String name = input.next();
						Accommodation.setName(name);
					}
					else if (num == 3) {
						System.out.print("Price:");
						int price = input.nextInt();
						Accommodation.setPrice(price);
					}
					else {
						continue;
					} // if
				} // while
				break;
			} // if
		} // for
	}
    
	public void viewAccommodations () {	
//		System.out.print("Area:");
//		String Area = input.next();
		System.out.println("# of registered Accomodations:" + Accommodations.size());
		for (int i = 0; i<Accommodations.size(); i++) {
			Accommodations.get(i).printInfo();
		}
	}
}
