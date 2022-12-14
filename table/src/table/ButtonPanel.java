package table;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel {
	
private JButton add = new JButton("Add");
	
	public ButtonPanel() {
		add(add);
		setVisible(true);
	}
	
	public void addAddListener(ActionListener al) {
		add.addActionListener(al);
	}

}
