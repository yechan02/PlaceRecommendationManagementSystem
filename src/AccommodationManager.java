import java.util.Scanner;

public class AccommodationManager {
	Accommodation Accommodation;
	Scanner input;
	AccommodationManager(Scanner input) {
		this.input = input;
	}

	public void addAccommodation () {
		Accommodation = new Accommodation();
		System.out.print("Area:");
		Accommodation.Area = input.next();
		System.out.print("Name:");
		Accommodation.Name = input.next();
		System.out.print("Accommodation type:");
		Accommodation.Accommodationtype = input.next();
		System.out.print("Price:");
		Accommodation.Price = input.nextInt();
	}
	
	public void deleteAccommodation () {	
		System.out.print("Name:");
		String Name = input.next();
		if (Name.equals(Accommodation.Name)) {
			Accommodation = null;
			System.out.println("the Accommodation is deleted");
		}
		else System.out.println("the Accommodation has not been regestered");
			return;
	}
	
    public void editAccommodation () {	
		System.out.print("Name:");
		String Name = input.next();
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
				}
			}
		}
	}
    
	public void viewAccommodation () {	
		System.out.print("Area:");
		String Area = input.next();
		if (Area.equals(Accommodation.Area)) {
			Accommodation.printInfo();
		}
	}
}
