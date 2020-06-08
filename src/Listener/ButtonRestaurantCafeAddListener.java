package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.RestaurantCafeAdder;
import gui.RestaurantCafeViewer;
import gui.WindowFrame;

public class ButtonRestaurantCafeAddListener implements ActionListener {

	WindowFrame frame;
	
	public ButtonRestaurantCafeAddListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		RestaurantCafeAdder adder = frame.getRestaurantcafeadder();
		frame.setupPanel(adder);
	}
}
