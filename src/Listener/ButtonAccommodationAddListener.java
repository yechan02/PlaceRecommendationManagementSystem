package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.AccommodationAdder;
import gui.RestaurantCafeAdder;
import gui.RestaurantCafeViewer;
import gui.WindowFrame;

public class ButtonAccommodationAddListener implements ActionListener {

	WindowFrame frame;
	
	public ButtonAccommodationAddListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		AccommodationAdder adder = frame.getAccommodationadder();
		frame.setupPanel(adder);
	}
}
