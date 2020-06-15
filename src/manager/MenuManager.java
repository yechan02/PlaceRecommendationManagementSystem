package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		RestaurantCafeManager RestaurantCafeManager = getObject("RestaurantCafeManager.ser");
		if (RestaurantCafeManager == null) {
			RestaurantCafeManager = new RestaurantCafeManager(input);
		}
		AccommodationManager AccommodationManager = getObject1("AccommodationManager.ser");
		if (AccommodationManager == null) {
			AccommodationManager = new AccommodationManager(input);
		}
		TouristSpotManager TouristSpotManager = getObject2("TouristSpotManager.ser");
		if (TouristSpotManager == null) {
			TouristSpotManager = new TouristSpotManager(input);
		}

		WindowFrame frame = new WindowFrame(RestaurantCafeManager, AccommodationManager, TouristSpotManager);
		slectMenu(input, RestaurantCafeManager, AccommodationManager, TouristSpotManager);
		putObject(RestaurantCafeManager, "RestaurantCafeManager.ser");
		putObject1(AccommodationManager, "AccommodationManager.ser");
		putObject2(TouristSpotManager, "TouristSpotManager.ser");
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
					logger.log("add a RestaurantCafe");
					break;
				case 2:
					AccommodationManager.addAccommodation ();
					logger.log("add a Accommodation");
					break;
				case 3:
					TouristSpotManager.addTouristSpot ();
					logger.log("add a TouristSpot");
					break;
				case 4:
					RestaurantCafeManager.deleteRestaurantCafe ();
					logger.log("delete a RestaurantCafe");
					break;
				case 5:
					AccommodationManager.deleteAccommodation ();
					logger.log("delete a Accommodation");
					break;
				case 6:
					TouristSpotManager.deleteTouristSpot ();
					logger.log("delete a TouristSpot");
					break;
				case 7:
					RestaurantCafeManager.editRestaurantCafe ();
					logger.log("edit a RestaurantCafe");
					break;
				case 8:
					AccommodationManager.editAccommodation ();
					logger.log("edit a Accommodation");
					break;
				case 9:
					TouristSpotManager.editTouristSpot ();
					logger.log("edit a TouristSpot");
					break;
				case 10:
					RestaurantCafeManager.viewRestaurantCafe ();
					logger.log("view a List of RestaurantCafe");
					break;
				case 11:
					AccommodationManager.viewAccommodations ();
					logger.log("view a List of Accommodations");
					break;
				case 12:
					TouristSpotManager.viewTouristSpot ();
					logger.log("view a List of TouristSpot");
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
	
	public static RestaurantCafeManager getObject(String filename) {
		RestaurantCafeManager RestaurantCafeManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			RestaurantCafeManager = (RestaurantCafeManager) in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return RestaurantCafeManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return RestaurantCafeManager;
	}
	
	public static void putObject(RestaurantCafeManager RestaurantCafeManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(RestaurantCafeManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static AccommodationManager getObject1(String filename) {
		AccommodationManager AccommodationManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			AccommodationManager = (AccommodationManager) in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return AccommodationManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return AccommodationManager;
	}
	
	public static void putObject1(AccommodationManager AccommodationManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(AccommodationManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static TouristSpotManager getObject2(String filename) {
		TouristSpotManager TouristSpotManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			TouristSpotManager = (TouristSpotManager) in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return TouristSpotManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return TouristSpotManager;
	}
	
	public static void putObject2(TouristSpotManager TouristSpotManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(TouristSpotManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}