import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		RestaurantCafeManager RestaurantCafeManager = new RestaurantCafeManager(input);
		AccommodationManager AccommodationManager = new AccommodationManager(input);
		TouristSpotManager TouristSpotManager = new TouristSpotManager(input);
		int num = -1;
		while (num !=13) {
			System.out.println("*** Place Recommendation ***");
			System.out.println("Select Your Theme");
			System.out.println("1. Add Restaurant, Cafe");
			System.out.println("2. Add Accommodation");
			System.out.println("3. Add Tourist Spot");
			System.out.println("4. Delete Restaurant, Cafe");
			System.out.println("5. Delete Accommodation");
			System.out.println("6. Delete Tourist Spot");
			System.out.println("7. Edit Restaurant, Cafe");
			System.out.println("8. Edit Accommodation");
			System.out.println("9. Edit Tourist Spot");
			System.out.println("10. View Restaurant, Cafe");
			System.out.println("11. View Accommodation");
			System.out.println("12. View Tourist Spot");
			System.out.println("13. See You Again");
			System.out.println("Slect one number between 1 - 13");
			num = input.nextInt();
			if (num == 1) {
				RestaurantCafeManager.addRestaurantCafe ();
			}
			else if (num == 2) {
				AccommodationManager.addAccommodation ();
			}
			else if (num == 3) {
				TouristSpotManager.addTouristSpot ();
			}
			else if (num == 4) {
				RestaurantCafeManager.deleteRestaurantCafe ();
			}
			else if (num == 5) {
				AccommodationManager.deleteAccommodation ();
			}
			else if (num == 6) {
				TouristSpotManager.deleteTouristSpot ();
			}
			else if (num == 7) {
				RestaurantCafeManager.editRestaurantCafe ();
			}
			else if (num == 8) {
				AccommodationManager.editAccommodation ();
			}
			else if (num == 9) {
				TouristSpotManager.editTouristSpot ();
			}
			else if (num == 10) {
				RestaurantCafeManager.viewRestaurantCafe ();
			}
			else if (num == 11) {
				AccommodationManager.viewAccommodation ();
			}
			else if (num == 12) {
				TouristSpotManager.viewTouristSpot ();
			}
			else {
				continue;
			}
		}
	}

	public static void addRestaurantCafe () {
		Scanner input = new Scanner(System.in);
		System.out.print("Area:");
		String Area = input.next();
		System.out.print("Name:");
		String Name = input.next();
		System.out.print("Food:");
		String Food = input.next();
		System.out.print("Price:");
		int Price = input.nextInt();
	}
	
	public static void addAccommodation () {
		Scanner input = new Scanner(System.in);
		System.out.print("Area:");
		String Area = input.next();
		System.out.print("Name:");
		String Name = input.next();
		System.out.print("Accommodation type:");
		String Accommodationtype = input.next();
		System.out.print("Price:");
		int Price = input.nextInt();
	}
	
	public static void addTouristSpot () {
		Scanner input = new Scanner(System.in);
		System.out.print("Area:");
		String Area = input.next();
		System.out.print("Name:");
		String Name = input.next();
	}
	
	public static void deleteRestaurantCafe () {	
		Scanner input = new Scanner(System.in);
		System.out.print("Name:");
		String Name = input.next();
	}
	
	public static void deleteAccommodation () {	
		Scanner input = new Scanner(System.in);
		System.out.print("Name:");
		String Name = input.next();
	}
	
	public static void deleteTouristSpot () {	
		Scanner input = new Scanner(System.in);
		System.out.print("Name:");
		String Name = input.next();
	}
	
    public static void editRestaurantCafe () {	
    	Scanner input = new Scanner(System.in);
    	System.out.print("Name:");
		String Name = input.next();
	}
    
    public static void editAccommodation () {	
		Scanner input = new Scanner(System.in);
		System.out.print("Name:");
		String Name = input.next();
	}
	
	public static void editTouristSpot () {	
		Scanner input = new Scanner(System.in);
		System.out.print("Name:");
		String Name = input.next();
	}
    
	public static void viewRestaurantCafe () {	
		Scanner input = new Scanner(System.in);
		System.out.print("Area:");
		String Area = input.next();
	}
	
	public static void viewAccommodation () {	
		Scanner input = new Scanner(System.in);
		System.out.print("Area:");
		String Area = input.next();
	}
	
	public static void viewTouristSpot () {	
    	Scanner input = new Scanner(System.in);
    	System.out.print("Area:");
		String Area = input.next();
	}
}
	

