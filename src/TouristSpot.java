
public class TouristSpot {
	String Area;
	String Name;
	static int numTouristSpotRegistered = 0;
	
	public TouristSpot() {
		numTouristSpotRegistered++;
	}
	
	public TouristSpot(String Area, String Name) {
		this.Area = Area;
		this.Name = Name;
		numTouristSpotRegistered++;
		
	}
	
	public void printInfo() {
		System.out.println("Area:" + Area + "Name:" + Name);	  	
	}

}
