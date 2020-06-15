package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import Accommodation.AccommodationInput;
import TouristSpot.TouristSpotInput;
import manager.TouristSpotManager;

public class TouristSpotViewer extends JPanel {
	
	WindowFrame frame;
	
	TouristSpotManager TouristSpotManager;

	public TouristSpotViewer(WindowFrame frame, TouristSpotManager TouristSpotManager) {
		this.frame = frame;
		this.TouristSpotManager = TouristSpotManager;
		
		System.out.println("***" + TouristSpotManager.size() + "***");

		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Area");
		model.addColumn("Name");
		
		for (int i=0; i< TouristSpotManager.size(); i++) {
			Vector row = new Vector();
			TouristSpotInput ti = TouristSpotManager.get(i);
			row.add(ti.getArea());
			row.add(ti.getName());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
}