package twod.view;

import java.awt.Color;

import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.table.DefaultTableModel;

import twod.controller.KpopController;

public class TwoDPanel extends JPanel
{
	private KpopController baseController;
	private JTable stringTable;
	private SpringLayout baseLayout;
	
	String[] kpopNames = {"BTS", "BIGBANG", "Topp Dogg", "SHINee" };
	Object[][] data = {{"BTS"}, {"BIGBANG"}, {"Topp Dogg"}, {"SHINee"}};
	
	public TwoDPanel(KpopController baseController)
	{
		stringTable = new JTable();
		
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		
		setupPanel();
		setupTable();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.CYAN);
		
		this.add(stringTable);
		
	}
	
	private void setupTable()
	{
		DefaultTableModel myTableModel = new DefaultTableModel(data, kpopNames);
		stringTable.setModel(myTableModel);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}


	
}
