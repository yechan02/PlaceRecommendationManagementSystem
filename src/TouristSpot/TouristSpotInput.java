package TouristSpot;

import java.util.Scanner;

public interface TouristSpotInput {
	
	public String getArea();
	
	public void setArea(String area);
	
	public String getName();
	
	public void setName(String name);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setArea(Scanner input);
	
	public void setName(Scanner input);
}