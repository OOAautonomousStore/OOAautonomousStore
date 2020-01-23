import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.function.Function;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblHello = new JLabel("Hello");
		frame.getContentPane().add(lblHello, BorderLayout.NORTH);
		
		//Test
		JButton btnNewButton = new JButton("New button");
		
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				lblHello.setText("World");
			
			
			}
		});
		frame.getContentPane().add(btnNewButton, BorderLayout.SOUTH);
		
		
	}

}
