
public class RestaurantCafe {
    String Area;
	String Name;
	String Food;
	int Price;
	
	public RestaurantCafe() {	
	}
	
	public RestaurantCafe(String Area, String Name, String Food, int Price) {
		this.Area = Area;
		this.Name = Name;
		this.Food = Food;
		this.Price = Price;
	}
	
	public void printInfo() {
		System.out.println("Area:" + Area + "Name:" + Name + " Food:" + Food + "Price:" + Price);	  	
		
	}

}
