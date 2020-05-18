package TouristSpot;

import java.util.Scanner;

import Accommodation.AccommodationInput;

public abstract class TouristSpot implements TouristSpotInput {
	protected TouristSpotkind kind = TouristSpotkind.Touristattraction;
	protected String Area;
	protected String Name;
	
	public TouristSpot() {
	}
	
	public TouristSpot(TouristSpotkind kind) {
		this.kind = kind;
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
	
	public String getkindString() {
		String skind = "none";
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
		return skind;
	}
}
