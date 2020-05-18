package Accommodation;

import java.util.Scanner;

import Exceptions.PriceFormatException;

public interface AccommodationInput {
	
	public String getName();
	
	public void setArea(String area);
	
	public void setName(String name);
	
	public void setPrice(String price) throws PriceFormatException;
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setArea(Scanner input);
	
	public void setName(Scanner input);
	
	public void setPrice(Scanner input);
}