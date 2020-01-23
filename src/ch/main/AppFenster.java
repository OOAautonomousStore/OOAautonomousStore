package ch.main;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
//import org.omg.CORBA.PUBLIC_MEMBER;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.function.Function;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;

public class AppFenster {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppFenster window = new AppFenster();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppFenster() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 650, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		JLabel lblHello = new JLabel("Hello");
		frame.getContentPane().add(lblHello, BorderLayout.EAST);
		

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.SOUTH);


		JButton btnNewButton = new JButton("New button");

		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				lblHello.setText("World");
			
			
			}
		});
		frame.getContentPane().add(btnNewButton, BorderLayout.SOUTH);
		
		frame.getContentPane().add(btnNewButton, BorderLayout.WEST);
}

}
