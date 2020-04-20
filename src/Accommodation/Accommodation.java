package Accommodation;

import java.util.Scanner;

public class Accommodation {
	protected Accommodationkind kind = Accommodationkind.Motel;
	protected String Area;
	protected String Name;
	protected int Price;
	
	public Accommodation() {
	}
	
	public Accommodation(String Area, String Name, int Price) {
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

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}
	
	public void printInfo() {
		System.out.println("Area:" + Area + "Name:" + Name + "Price:" + Price);	  	
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Area:");
		String Area = input.next();
		this.setArea(Area);
		
		System.out.print("Name:");
		String Name = input.next();
		this.setName(Name);
		
		System.out.print("Price:");
		int Price = input.nextInt();
		this.setPrice(Price);
	}
}