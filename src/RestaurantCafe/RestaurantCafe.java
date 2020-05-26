package RestaurantCafe;

import java.io.Serializable;
import java.util.Scanner;

import Exceptions.PriceFormatException;

public abstract class RestaurantCafe implements RestaurantCafeInput, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4522559585883517606L;
	
	protected RestaurantCafekind kind = RestaurantCafekind.Koreanfood;
    protected String Area;
	protected String Name;
	protected String Food;
	protected String Price;
	
	public RestaurantCafe() {
	}
	
	public RestaurantCafe(RestaurantCafekind kind) {
		this.kind = kind;
	}
	
	public RestaurantCafe(String Area, String Name, String Food, String Price) {
		this.Area = Area;
		this.Name = Name;
		this.Food = Food;
		this.Price = Price;
	}
	
	public RestaurantCafe(RestaurantCafekind kind, String Area, String Name, String Food, String Price) {
		this.kind = kind;
		this.Area = Area;
		this.Name = Name;
		this.Food = Food;
		this.Price = Price;
	}
	
	public RestaurantCafekind getKind() {
		return kind;
	}

	public void setKind(RestaurantCafekind kind) {
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

	public String getFood() {
		return Food;
	}

	public void setFood(String food) {
		Food = food;
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
	
	public void setFood(Scanner input) {
		System.out.print("Food:");
		String food = input.next();
		this.setFood(food);		
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
		case Koreanfood:
			skind = "Korea.";
			break;
		case Chinesefood:
			skind = "China";
			break;
		case Westernfood:
			skind = "West";
			break;
		case Japanesefood:
			skind = "Japan";
			break;
		case TeaDessert:
			skind = "Tea";
			break;
		default:
		}
		return skind;
	}
}