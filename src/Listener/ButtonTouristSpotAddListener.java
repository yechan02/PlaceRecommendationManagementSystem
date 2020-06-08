package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.AccommodationAdder;
import gui.RestaurantCafeAdder;
import gui.RestaurantCafeViewer;
import gui.TouristSpotAdder;
import gui.WindowFrame;

public class ButtonTouristSpotAddListener implements ActionListener {

	WindowFrame frame;
	
	public ButtonTouristSpotAddListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		TouristSpotAdder adder = frame.getTouristspotadder();
		frame.setupPanel(adder);
	}
}
