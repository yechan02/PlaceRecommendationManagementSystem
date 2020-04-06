
public class Accommodation {
	String Area;
	String Name;
	String Accommodationtype;
	int Price;
	
	public Accommodation() {	
	}
	
	public Accommodation(String Area, String Name, String Food, int Price) {
		this.Area = Area;
		this.Name = Name;
		this.Accommodationtype = Accommodationtype;
		this.Price = Price;
	}
	
	public void printInfo() {
		System.out.println("Area:" + Area + "Name:" + Name + "Accommodationtype:" + Accommodationtype + "Price:" + Price);	  	
	}
}
