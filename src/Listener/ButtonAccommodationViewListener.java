package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.AccommodationViewer;
import gui.RestaurantCafeViewer;
import gui.WindowFrame;

public class ButtonAccommodationViewListener implements ActionListener {

	WindowFrame frame;
	
	public ButtonAccommodationViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		AccommodationViewer viewer = frame.getAccommodationviewer();
		frame.setupPanel(viewer);
	}
}
