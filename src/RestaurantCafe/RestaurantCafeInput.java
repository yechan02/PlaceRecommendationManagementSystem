package RestaurantCafe;

import java.util.Scanner;

import Exceptions.PriceFormatException;

public interface RestaurantCafeInput {

	public String getArea();
	
	public void setArea(String area);
	
	public String getName();
	
	public void setName(String name);
	
	public String getFood();
	
	public void setFood(String food);
	
	public String getPrice();
	
	public void setPrice(String price) throws PriceFormatException;
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setArea(Scanner input);
	
	public void setName(Scanner input);
	
	public void setFood(Scanner input);
	
	public void setPrice(Scanner input);
}
