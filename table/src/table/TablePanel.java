package table;

import java.awt.BorderLayout;
import java.time.LocalDate;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TablePanel extends JPanel{
	private JTable table = null;
	private DefaultTableModel model = new DefaultTableModel();
	
	
	public TablePanel() {
	  setLayout(new BorderLayout());
	  initTableWithModel();	
	  JScrollPane jsp = new JScrollPane(table);
	  add(jsp, BorderLayout.CENTER);
	  setVisible(true);
	}
	
	public void addRow(String a, String b, String c, String d) {
	  model.addRow(new Object[] {a, b, c, d});
	}
	
	private void initTable() {
		String[] columnNames = {
				"Type", "Manufacturer", "Year of Model","Price"
		};
		
		Object[][] data = {
				{"Nimbus 3000", "Hogsmeat", LocalDate.of(2030, 6, 3).toString(), "$100"},
				{"Charlie", "Hogswarts", LocalDate.of(2015, 01, 10).toString(), "$200"}
		};
		
	    table = new JTable(data, columnNames);
	}
	
	private void initTableWithModel() {
		model.addColumn("Type");
		model.addColumn("Manufacturer");
		model.addColumn("Year of Model");
		model.addColumn("Price");
		
		model.addRow(new Object[] {"Nimbus 3000", "Hogsmeat", LocalDate.of(2030, 6, 3).toString(), "$100"});
		model.addRow(new Object[] {"Nimbus 4000", "Hogswarts", LocalDate.of(2015, 01, 10).toString(), "$200"});
		
		
	    table = new JTable(model);
	}

}
