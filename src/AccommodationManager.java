import java.util.ArrayList;
import java.util.Scanner;

public class AccommodationManager {
	ArrayList<Accommodation> Accommodations = new ArrayList<Accommodation>();
	Scanner input;
	AccommodationManager(Scanner input) {
		this.input = input;
	}

	public void addAccommodation () {
		Accommodation Accommodation = new Accommodation();
		System.out.print("Area:");
		Accommodation.Area = input.next();
		System.out.print("Name:");
		Accommodation.Name = input.next();
		System.out.print("Accommodation type:");
		Accommodation.Accommodationtype = input.next();
		System.out.print("Price:");
		Accommodation.Price = input.nextInt();
		Accommodations.add(Accommodation);
	}
	
	public void deleteAccommodation () {	
		System.out.print("Name:");
		String Name = input.next();
		int index = -1;
		for (int i = 0; i<Accommodations.size(); i++) {
			if (Name.equals(Accommodations.get(i).Name)) {
				index = i;
				break;
			}
		}
		
		if (index >= 0) {
			Accommodations.remove(index);
			Accommodation.numAccommodationRegistered--;
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
			if (Name.equals(Accommodation.Name)) {
				int num = -1;
				while (num !=5) {
					System.out.println("** Accommodation Edit Menu **");
					System.out.println("1. Edit Area");
					System.out.println("2. Edit Name");
					System.out.println("3. Edit Accommodationtype");
					System.out.println("4. Edit Price");
					System.out.println("5. See You Again");
					System.out.println("Slect one number between 1 - 5");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Area:");
						Accommodation.Area = input.next();
					}
					else if (num == 2) {
						System.out.print("Name:");
						Accommodation.Name = input.next();
					}
					else if (num == 3) {
						System.out.print("Accommodation type:");
						Accommodation.Accommodationtype = input.next();
					}
					else if (num == 4) {
						System.out.print("Price:");
						Accommodation.Price = input.nextInt();
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
		System.out.println("# of registered Accomodations:" + Accommodation.numAccommodationRegistered);
		for (int i = 0; i<Accommodations.size(); i++) {
			Accommodations.get(i).printInfo();
		}
	}
}
