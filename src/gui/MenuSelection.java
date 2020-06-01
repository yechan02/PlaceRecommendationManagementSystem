package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuSelection extends JFrame {
	
	public MenuSelection() {
		this.setSize(600, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Menu Selection");
		
		JButton button1 = new JButton("Add Restaurant, Cafe");
		JButton button2 = new JButton("Add Accommodation");
		JButton button3 = new JButton("Add Tourist Spot");
		JButton button4 = new JButton("Delete Restaurant, Cafe");
		JButton button5 = new JButton("Delete Accommodation");
		JButton button6 = new JButton("Delete Tourist Spot");
		JButton button7 = new JButton("Edit Restaurant, Cafe");
		JButton button8 = new JButton("Edit Accommodation");
		JButton button9 = new JButton("Edit Tourist Spot");
		JButton button10 = new JButton("View Restaurants, Cafes");
		JButton button11 = new JButton("View Accommodations");
		JButton button12 = new JButton("View Tourist Spots");
		JButton button13 = new JButton("Exit Program");
		
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		panel2.add(button6);
		panel2.add(button7);
		panel2.add(button8);
		panel2.add(button9);
		panel2.add(button10);
		panel2.add(button11);
		panel2.add(button12);
		panel2.add(button13);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		
		this.setVisible(true);
		
	}

}
