package TouristSpot;

import java.util.Scanner;

public class TouristSpot {
	protected TouristSpotkind kind = TouristSpotkind.Touristattraction;
	protected String Area;
	protected String Name;
	
	public TouristSpot() {
	}
	
	public TouristSpot(String Area, String Name) {
		this.Area = Area;
		this.Name = Name;		
	}
	
	public TouristSpot(TouristSpotkind kind, String Area, String Name) {
		this.kind = kind;
		this.Area = Area;
		this.Name = Name;		
	}
	
	public TouristSpotkind getKind() {
		return kind;
	}

	public void setKind(TouristSpotkind kind) {
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
	
	String skind = "none";
	public void printInfo() {
		switch(this.kind) {
		case Touristattraction:
			skind = "Attraction";
			break;
		case Leisure:
			skind = "Leisure";
			break;
		case Performance:
			skind = "Performance";
			break;
		default:
		}
		System.out.println("kind:" + skind + "Area:" + Area + "Name:" + Name);	  	
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Area:");
		String Area = input.next();
		this.setArea(Area);
		
		System.out.print("Name:");
		String Name = input.next();
		this.setName(Name);
	}
}
