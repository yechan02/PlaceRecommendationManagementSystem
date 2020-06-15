package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import RestaurantCafe.RestaurantCafeInput;
import manager.RestaurantCafeManager;

public class RestaurantCafeViewer extends JPanel {
	
	WindowFrame frame;
	
	RestaurantCafeManager RestaurantCafeManager;

	public RestaurantCafeViewer(WindowFrame frame, RestaurantCafeManager RestaurantCafeManager) {
		this.frame = frame;
		this.RestaurantCafeManager = RestaurantCafeManager;
		
		System.out.println("***" + RestaurantCafeManager.size() + "***");

		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Area");
		model.addColumn("Name");
		model.addColumn("Food");
		model.addColumn("Price");
		
		for (int i=0; i< RestaurantCafeManager.size(); i++) {
			Vector row = new Vector();
			RestaurantCafeInput ri = RestaurantCafeManager.get(i);
			row.add(ri.getArea());
			row.add(ri.getName());
			row.add(ri.getFood());
			row.add(ri.getPrice());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
}