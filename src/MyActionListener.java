import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class MyActionListener implements ActionListener {

	private JLabel label;
	
	public MyActionListener(JLabel label) {
		this.label = label ;}
	
	public void actionPerformed(ActionEvent e) {
label.setText("World");}

	
	
	
}
