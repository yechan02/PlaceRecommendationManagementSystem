package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.AccommodationManager;
import manager.RestaurantCafeManager;
import manager.TouristSpotManager;

public class WindowFrame extends JFrame {
	
	RestaurantCafeManager RestaurantCafeManager;
	AccommodationManager AccommodationManager;
	TouristSpotManager TouristSpotManager;
	
	MenuSelection menuselection;
	RestaurantCafeAdder restaurantcafeadder;
	AccommodationAdder accommodationadder;
	TouristSpotAdder touristspotadder;
	RestaurantCafeViewer restaurantcafeviewer;
	AccommodationViewer accommodationviewer;
	TouristSpotViewer touristspotviewer;
	
	public WindowFrame(RestaurantCafeManager RestaurantCafeManager, AccommodationManager AccommodationManager, TouristSpotManager TouristSpotManager) {
		
		this.RestaurantCafeManager = RestaurantCafeManager;
		this.AccommodationManager = AccommodationManager;
		this.TouristSpotManager = TouristSpotManager;
		menuselection = new MenuSelection(this);
		restaurantcafeadder = new RestaurantCafeAdder(this);
		accommodationadder = new AccommodationAdder(this);
		touristspotadder = new TouristSpotAdder(this);
		restaurantcafeviewer = new RestaurantCafeViewer(this, this.RestaurantCafeManager);
		accommodationviewer = new AccommodationViewer(this, this.AccommodationManager = AccommodationManager);
		touristspotviewer = new TouristSpotViewer(this, this.TouristSpotManager = TouristSpotManager);
		
		
		this.setSize(600, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setupPanel(menuselection);
		this.setVisible(true);
	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public RestaurantCafeAdder getRestaurantcafeadder() {
		return restaurantcafeadder;
	}

	public void setRestaurantcafeadder(RestaurantCafeAdder restaurantcafeadder) {
		this.restaurantcafeadder = restaurantcafeadder;
	}

	public AccommodationAdder getAccommodationadder() {
		return accommodationadder;
	}

	public void setAccommodationadder(AccommodationAdder accommodationadder) {
		this.accommodationadder = accommodationadder;
	}

	public TouristSpotAdder getTouristspotadder() {
		return touristspotadder;
	}

	public void setTouristspotadder(TouristSpotAdder touristspotadder) {
		this.touristspotadder = touristspotadder;
	}

	public RestaurantCafeViewer getRestaurantcafeviewer() {
		return restaurantcafeviewer;
	}

	public void setRestaurantcafeviewer(RestaurantCafeViewer restaurantcafeviewer) {
		this.restaurantcafeviewer = restaurantcafeviewer;
	}

	public AccommodationViewer getAccommodationviewer() {
		return accommodationviewer;
	}

	public void setAccommodationviewer(AccommodationViewer accommodationviewer) {
		this.accommodationviewer = accommodationviewer;
	}

	public TouristSpotViewer getTouristspotviewer() {
		return touristspotviewer;
	}

	public void setTouristspotviewer(TouristSpotViewer touristspotviewer) {
		this.touristspotviewer = touristspotviewer;
	}
}
