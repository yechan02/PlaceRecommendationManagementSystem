package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class RestaurantCafeAdder extends JPanel {
	
	WindowFrame frame;
	
	public RestaurantCafeAdder(WindowFrame frame) {
		this.frame = frame;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelArea = new JLabel("Area: ", JLabel.TRAILING);
		JTextField fieldArea = new JTextField(10);
		labelArea.setLabelFor(fieldArea);
		panel.add(labelArea);
		panel.add(fieldArea);
		
		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelFood = new JLabel("Food: ", JLabel.TRAILING);
		JTextField fieldFood = new JTextField(10);
		labelFood.setLabelFor(fieldFood);
		panel.add(labelFood);
		panel.add(fieldFood);
		
		JLabel labelPrice = new JLabel("Price: ", JLabel.TRAILING);
		JTextField fieldPrice = new JTextField(10);
		labelPrice.setLabelFor(fieldPrice);
		panel.add(labelPrice);
		panel.add(fieldPrice);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.add(panel);
		this.setVisible(true);
	}
}
