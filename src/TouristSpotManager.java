import java.util.Scanner;

public class TouristSpotManager {
	TouristSpot TouristSpot;
	Scanner input;
	TouristSpotManager(Scanner input) {
		this.input = input;
	}
	
	public void addTouristSpot () {
		TouristSpot = new TouristSpot();
		System.out.print("Area:");
		TouristSpot.Area = input.next();
		System.out.print("Name:");
		TouristSpot.Name = input.next();
	}
	
	public void deleteTouristSpot () {	
		System.out.print("Area:");
		String Area = input.next();
		if (Area.equals(TouristSpot.Area)) {
			TouristSpot = null;
			System.out.println("the TouristSpot is deleted");
		}
		else System.out.println("the TouristSpot has not been regestered");
			return;
	}
	
	public void editTouristSpot () {	
		System.out.print("Area:");
		String Area = input.next();
		if (Area.equals(TouristSpot.Area)) {
			System.out.println("the TouristSpot to be edited is" + Area);
		}
	}
	
	public void viewTouristSpot () {	
    	System.out.print("Area:");
		String Area = input.next();
		if (Area.equals(TouristSpot.Area)) {
			TouristSpot.printInfo();
		}
	}

}
