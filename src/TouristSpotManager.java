import java.util.ArrayList;
import java.util.Scanner;

public class TouristSpotManager {
	ArrayList<TouristSpot> TouristSpots = new ArrayList<TouristSpot>();
	Scanner input;
	TouristSpotManager(Scanner input) {
		this.input = input;
	}
	
	public void addTouristSpot () {
		TouristSpot TouristSpot = new TouristSpot();
		System.out.print("Area:");
		TouristSpot.Area = input.next();
		System.out.print("Name:");
		TouristSpot.Name = input.next();
		TouristSpots.add(TouristSpot);
	}
	
	public void deleteTouristSpot () {	
		System.out.print("Name:");
		String Name = input.next();
		int index = -1;
		for (int i = 0; i<TouristSpots.size(); i++) {
			if (Name.equals(TouristSpots.get(i).Name)) {
				index = i;
				break;
			}
		}
		
		if (index >= 0) {
			TouristSpots.remove(index);
			TouristSpot.numTouristSpotRegistered--;
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
					} // if
				} // while
				break;
			} // if
		} // for
	}
	
	public void viewTouristSpot () {	
//    	System.out.print("Area:");
//		String Area = input.next();
		System.out.println("# of registered TouristSpots:" + TouristSpot.numTouristSpotRegistered);
		for (int i = 0; i<TouristSpots.size(); i++) {
			TouristSpots.get(i).printInfo();
		}
	}

}
