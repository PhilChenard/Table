package table;

import javax.swing.JSplitPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZeFrame theFrame = new ZeFrame();
		
		ButtonPanel bp = new ButtonPanel();
		TablePanel tp = new TablePanel();
		ActListener ac = new ActListener(tp);
		bp.addAddListener(ac);
		
		JSplitPane jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, bp, tp);
		
		theFrame.add(jsp);
		theFrame.setVisible(true);

	}

}
