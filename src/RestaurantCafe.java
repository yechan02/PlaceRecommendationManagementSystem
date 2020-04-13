
public class RestaurantCafe {
    String Area;
	String Name;
	String Food;
	int Price;
	static int numRestaurantCafeRegistered = 0;
	
	public RestaurantCafe() {
		numRestaurantCafeRegistered++;
	}
	
	public RestaurantCafe(String Area, String Name, String Food, int Price) {
		this.Area = Area;
		this.Name = Name;
		this.Food = Food;
		this.Price = Price;
		numRestaurantCafeRegistered++;
	}
	
	public void printInfo() {
		System.out.println("Area:" + Area + "Name:" + Name + " Food:" + Food + "Price:" + Price);	  	
		
	}

}
