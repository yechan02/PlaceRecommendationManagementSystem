package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.AccommodationViewer;
import gui.RestaurantCafeViewer;
import gui.TouristSpotViewer;
import gui.WindowFrame;

public class ButtonTouristSpotViewListener implements ActionListener {

	WindowFrame frame;
	
	public ButtonTouristSpotViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		TouristSpotViewer viewer = frame.getTouristspotviewer();
		frame.setupPanel(viewer);
	}
}
