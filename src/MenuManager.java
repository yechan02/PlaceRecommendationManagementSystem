import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		RestaurantCafeManager RestaurantCafeManager = new RestaurantCafeManager(input);
		AccommodationManager AccommodationManager = new AccommodationManager(input);
		TouristSpotManager TouristSpotManager = new TouristSpotManager(input);

		slectMenu(input, RestaurantCafeManager, AccommodationManager, TouristSpotManager);
	}
	
	public static void slectMenu(Scanner input, RestaurantCafeManager RestaurantCafeManager, AccommodationManager AccommodationManager, TouristSpotManager TouristSpotManager) {
		int num = -1;
		while (num !=13) {
			try {
				ShowMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					RestaurantCafeManager.addRestaurantCafe ();
					break;
				case 2:
					AccommodationManager.addAccommodation ();
					break;
				case 3:
					TouristSpotManager.addTouristSpot ();
					break;
				case 4:
					RestaurantCafeManager.deleteRestaurantCafe ();
					break;
				case 5:
					AccommodationManager.deleteAccommodation ();
					break;
				case 6:
					TouristSpotManager.deleteTouristSpot ();
					break;
				case 7:
					RestaurantCafeManager.editRestaurantCafe ();
					break;
				case 8:
					AccommodationManager.editAccommodation ();
					break;
				case 9:
					TouristSpotManager.editTouristSpot ();
					break;
				case 10:
					RestaurantCafeManager.viewRestaurantCafe ();
					break;
				case 11:
					AccommodationManager.viewAccommodations ();
					break;
				case 12:
					TouristSpotManager.viewTouristSpot ();
					break;
				default:
					continue;				
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 13!");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}	
	}
	
	public static void ShowMenu() {
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
		System.out.println("10. View Restaurants, Cafes");
		System.out.println("11. View Accommodations");
		System.out.println("12. View Tourist Spots");
		System.out.println("13. See You Again");
		System.out.println("Slect one number between 1 - 13");
	}
}