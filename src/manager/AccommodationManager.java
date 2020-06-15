package manager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Accommodation.Accommodation;
import Accommodation.AccommodationInput;
import Accommodation.Accommodationkind;
import Accommodation.Hotel;
import Accommodation.Motel;
import TouristSpot.TouristSpot;
import TouristSpot.TouristSpotInput;

public class AccommodationManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6584562947384484105L;
	
	ArrayList<AccommodationInput> Accommodations = new ArrayList<AccommodationInput>();
	transient Scanner input;
	AccommodationManager(Scanner input) {
		this.input = input;
	}

	public void addAccommodation () {
		int kind = 0;
		AccommodationInput AccommodationInput;
		while (kind < 1 || kind > 2) {
			try {
				System.out.println("1 for Motel  ");
				System.out.println("2 for Hotel  ");
				System.out.print("Select num 1, 2 for Accommodation kind:");
				kind = input.nextInt();
				if (kind == 1) {
					AccommodationInput = new Motel(Accommodationkind.Motel);
					AccommodationInput.getUserInput(input);
					Accommodations.add(AccommodationInput);
					break;
				}
				else if (kind == 2) {
					AccommodationInput = new Hotel(Accommodationkind.Hotel);
					AccommodationInput.getUserInput(input);
					Accommodations.add(AccommodationInput);
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
	
	public void deleteAccommodation () {	
		System.out.print("Name:");
		String Name = input.next();
		int index = findIndex(Name);
		RemovefromAccommodation(index, Name);
	}
	
	public int findIndex(String Name) {
		int index = -1;
		for (int i = 0; i<Accommodations.size(); i++) {
			if (Name.equals(Accommodations.get(i).getName())) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int RemovefromAccommodation(int index, String Name) {
		if (index >= 0) {
			Accommodations.remove(index);
			System.out.println("the Accommodation" + Name + "is deleted");
			return 1;
		}
		else {
			System.out.println("the Accommodation has not been regestered");
			return -1;
		}
	}
	
    public void editAccommodation () {	
		System.out.print("Name:");
		String Name = input.next();
		for (int i = 0; i<Accommodations.size(); i++) {
			AccommodationInput Accommodation = Accommodations.get(i);
			if (Name.equals(Accommodation.getName())) {
				int num = -1;
				while (num !=4) {
					ShowEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						Accommodation.setArea(input);
						break;
					case 2:
						Accommodation.setName(input);
						break;
					case 3:
						Accommodation.setPrice(input);
						break;
					default:
						continue;
					}
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
	
	public int size() {
		return Accommodations.size();
	}
	
	public AccommodationInput get(int index) {
		return (Accommodation) Accommodations.get(index);
	}
	
	public void ShowEditMenu() {
		System.out.println("** Accommodation Edit Menu **");
		System.out.println("1. Edit Area");
		System.out.println("2. Edit Name");
		System.out.println("3. Edit Price");
		System.out.println("4. See You Again");
		System.out.println("Slect one number between 1 - 5");
	}
}