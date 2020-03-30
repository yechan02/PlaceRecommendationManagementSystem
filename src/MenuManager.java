import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 17;

		while (num !=18) {
			System.out.println("*** Place Recommendation ***");
			System.out.println("Select Your Theme");
			System.out.println("1. Add Restaurant, Cafe");
			System.out.println("2. Add Accommodation");
			System.out.println("3. Add Festival");
			System.out.println("4. Add Tourist Spot");
			System.out.println("5. Delete Restaurant, Cafe");
			System.out.println("6. Delete Accommodation");
			System.out.println("7. Delete FestivalTourist Spot");
			System.out.println("8. Delete Tourist Spot");
			System.out.println("9. Edit Restaurant, Cafe");
			System.out.println("10. Edit Accommodation");
			System.out.println("11. Edit Festival");
			System.out.println("12. Edit Tourist Spot");
			System.out.println("13. View Restaurant, Cafe");
			System.out.println("14. View Accommodation");
			System.out.println("15. View Festival");
			System.out.println("16. View Tourist Spot");
			System.out.println("17. Show Menu");
			System.out.println("18. See You Again");
			num = input.nextInt();
			if (num == 1) {
				addRestaurantCafe ();
			}
			else if (num == 5) {
				deleteRestaurantCafe ();
			}
			else if (num == 9) {
				editRestaurantCafe ();
			}
			else if (num == 13) {
				viewRestaurantCafe ();
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
		System.out.print("Name");
		String Name = input.next();
		System.out.print("Food:");
		String Food = input.next();
		System.out.print("Price:");
		int Price = input.nextInt();
	}
	
	public static void deleteRestaurantCafe () {	
		Scanner input = new Scanner(System.in);
		System.out.print("Area:");
		String Area = input.next();
	}
	
    public static void editRestaurantCafe () {	
    	Scanner input = new Scanner(System.in);
    	System.out.print("Area:");
		String Area = input.next();
	}
    
    public static void viewRestaurantCafe () {	
    	Scanner input = new Scanner(System.in);
    	System.out.print("Area:");
		String Area = input.next();
	}
}
	

