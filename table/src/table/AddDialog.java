package table;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddDialog extends JDialog{
	
	private JTextField a = new JTextField();
	private JTextField b = new JTextField();
	private JTextField c = new JTextField();
	private JTextField d = new JTextField();
	private JButton ok = new JButton("OK");

	public AddDialog() {
		initialize();
	}
	
	private void initialize() {
		setTitle("Please enter Info: ");
		setLayout(new BorderLayout());
		add(initPrompts(), BorderLayout.CENTER);
//		addOkayListener();
        add(ok, BorderLayout.SOUTH);
        setSize(450,125);
	}
	
	private JPanel initPrompts() {
		JPanel panel = new JPanel(new GridLayout(4, 4));
		panel.add(new JLabel("Type: "));
		panel.add(a);
		panel.add(new JLabel("Manufacturer: "));
		panel.add(b);
		panel.add(new JLabel("Year of Model: "));
		panel.add(c);
		panel.add(new JLabel("Price: "));
		panel.add(d);
		
		return panel;
	}
	
	public void addOkayListener(ActionListener ac) {
		ok.addActionListener(ac);
	}
	
	public String getGivenType() {
		return a.getText();
	}
	
	public String getManufacturer() {
		return b.getText();
	}
	
	public String getModelYear() {
		return c.getText();
	}
	
	public String getPrice() {
		return d.getText();
	}


}
