package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import Accommodation.AccommodationInput;
import RestaurantCafe.RestaurantCafeInput;
import manager.AccommodationManager;

public class AccommodationViewer extends JPanel {
	
	WindowFrame frame;
	
	AccommodationManager AccommodationManager;

	public AccommodationViewer(WindowFrame frame, AccommodationManager AccommodationManager) {
		this.frame = frame;
		this.AccommodationManager = AccommodationManager;
		
		System.out.println("***" + AccommodationManager.size() + "***");

		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Area");
		model.addColumn("Name");
		model.addColumn("Price");
		
		for (int i=0; i< AccommodationManager.size(); i++) {
			Vector row = new Vector();
			AccommodationInput ai = AccommodationManager.get(i);
			row.add(ai.getArea());
			row.add(ai.getName());
			row.add(ai.getPrice());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
}