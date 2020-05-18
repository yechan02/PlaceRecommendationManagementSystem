package TouristSpot;

import java.util.Scanner;

public interface TouristSpotInput {
	
	public String getName();
	
	public void setArea(String area);
	
	public void setName(String name);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setArea(Scanner input);
	
	public void setName(Scanner input);
}
