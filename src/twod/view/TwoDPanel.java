package twod.view;

public class TwoDPanel 
{
	private JTable kpopTable;
	
	private void setupPanel()
	{
		this.add(kpopTable);
	}
	
	private void setupTable()
	{
		String [] columnHeaders = {"column 0", "Column 1", "Column 2"};
		DefaultTableModel tableModel = new DefaultTableModel(baseController.getMyKpop(), columnHeaders);
		kpopTable = new JTable(tableModel);
		DefaultTableModel kpopTableModel = new DefaultTableModel(baseController.getMyKpop() columnHeaders);
		kpopTable = new JTable(kpopTableModel);
		
	}
}
