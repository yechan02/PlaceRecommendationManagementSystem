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
		System.out.print("Name:");
		String Name = input.next();
		if (Name.equals(TouristSpot.Name)) {
			TouristSpot = null;
			System.out.println("the TouristSpot is deleted");
		}
		else System.out.println("the TouristSpot has not been regestered");
			return;
	}
	
	public void editTouristSpot () {	
		System.out.print("Name:");
		String Name = input.next();
		if (Name.equals(TouristSpot.Name)) {
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
					TouristSpot.Area = input.next();
				}
				else if (num == 2) {
					System.out.print("Name:");
					TouristSpot.Name = input.next();
				}
				else {
					continue;
				}
			}
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
