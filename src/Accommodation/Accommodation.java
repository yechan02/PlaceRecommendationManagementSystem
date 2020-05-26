package Accommodation;

import java.io.Serializable;
import java.util.Scanner;

import Exceptions.PriceFormatException;

public abstract class Accommodation implements AccommodationInput, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1993573701653137682L;
	
	protected Accommodationkind kind = Accommodationkind.Motel;
	protected String Area;
	protected String Name;
	protected String Price;
	
	public Accommodation() {
	}
	
	public Accommodation(Accommodationkind kind) {
		this.kind = kind;
	}
	
	public Accommodation(String Area, String Name, String Price) {
		this.Area = Area;
		this.Name = Name;
		this.Price = Price;
	}
	
	public Accommodation(Accommodationkind kind, String Area, String Name, String Price) {
		this.kind = kind;
		this.Area = Area;
		this.Name = Name;
		this.Price = Price;
	}
	
	public Accommodationkind getKind() {
		return kind;
	}

	public void setKind(Accommodationkind kind) {
		this.kind = kind;
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) throws PriceFormatException {
		if (!price.contains("$") && !price.equals("")) {
			throw new PriceFormatException();
		}
		
		this.Price = price;
	}
	
	public abstract void printInfo();
	
	public void setArea(Scanner input) {
		System.out.print("Area:");
		String area = input.next();
		this.setArea(area);
	}
	
	public void setName(Scanner input) {
		System.out.print("Name:");
		String name = input.next();
		this.setName(name);
	}
	
	public void setPrice(Scanner input) {
		String price = "";
		while (!price.contains("$")) {
			System.out.print("Price:");
			price = input.next();
			try {
				this.setPrice(price);
			} catch (PriceFormatException e) {
				System.out.println("Incorrect Price Format. Put the price that contains $");
			}
		}
	}
	
	public String getkindString() {
		String skind = "none";
		switch(this.kind) {
		case Motel:
			skind = "Motel";
			break;
		case Hotel:
			skind = "Hotel";
			break;
		case ResortCondo:
			skind = "Resort";
			break;
		case Pension:
			skind = "Pension";
			break;
		case Guesthouse:
			skind = "Guest";
			break;
		default:
		}
		return skind;
	}
}