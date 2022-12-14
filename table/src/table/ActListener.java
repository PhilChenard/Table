package table;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActListener implements ActionListener{

	private TablePanel panel = new TablePanel();
	private AddDialog dialog = new AddDialog();

	public ActListener(TablePanel tp) {
		this.panel = tp;
		addDialogListener();
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		dialog.setVisible(true);

	}
	
	private void addDialogListener() {
		dialog.addOkayListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String a = dialog.getGivenType();
				String b = dialog.getManufacturer();
				String c = dialog.getModelYear();
				String d = dialog.getPrice();
				panel.addRow(a,  b,  c,  d);
			}
			
		});
	}
	
	
}
