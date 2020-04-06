
public class TouristSpot {
	String Area;
	String Name;
	
	public TouristSpot() {	
	}
	
	public TouristSpot(String Area, String Name) {
		this.Area = Area;
		this.Name = Name;
	}
	
	public void printInfo() {
		System.out.println("Area:" + Area + "Name:" + Name);	  	
	}

}
