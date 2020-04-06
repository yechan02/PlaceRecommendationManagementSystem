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
		System.out.print("Area:");
		String Area = input.next();
		if (Area.equals(Accommodation.Area)) {
			Accommodation = null;
			System.out.println("the Accommodation is deleted");
		}
		else System.out.println("the Accommodation has not been regestered");
			return;
	}
	
    public void editAccommodation () {	
		System.out.print("Area:");
		String Area = input.next();
		if (Area.equals(Accommodation.Area)) {
			System.out.println("the Accommodation to be edited is" + Area);
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
