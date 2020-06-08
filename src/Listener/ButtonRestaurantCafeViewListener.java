package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.RestaurantCafeViewer;
import gui.WindowFrame;

public class ButtonRestaurantCafeViewListener implements ActionListener {

	WindowFrame frame;
	
	public ButtonRestaurantCafeViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		RestaurantCafeViewer viewer = frame.getRestaurantcafeviewer();
		frame.setupPanel(viewer);
	}
}
