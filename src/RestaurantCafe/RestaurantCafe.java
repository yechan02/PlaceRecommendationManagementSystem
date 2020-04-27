package RestaurantCafe;

import java.util.Scanner;

public class RestaurantCafe {
	protected RestaurantCafekind kind = RestaurantCafekind.Koreanfood;
    protected String Area;
	protected String Name;
	protected String Food;
	protected int Price;
	
	public RestaurantCafe() {
	}
	
	public RestaurantCafe(RestaurantCafekind kind) {
		this.kind = kind;
	}
	
	public RestaurantCafe(String Area, String Name, String Food, int Price) {
		this.Area = Area;
		this.Name = Name;
		this.Food = Food;
		this.Price = Price;
	}
	
	public RestaurantCafe(RestaurantCafekind kind, String Area, String Name, String Food, int Price) {
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

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}
	
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case Koreanfood:
			skind = "Korea";
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
			skind = "TeaDessert";
			break;
		default:
		}
		System.out.println("kind:" + skind + "Area:" + Area + "Name:" + Name + " Food:" + Food + "Price:" + Price);	  		
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Area:");
		String Area = input.next();
		this.setArea(Area);
		
		System.out.print("Name:");
		String Name = input.next();
		this.setName(Name);
		
		System.out.print("Food:");
		String Food = input.next();
		this.setFood(Food);
		
		System.out.print("Price:");
		int Price = input.nextInt();
		this.setPrice(Price);
	}
}
