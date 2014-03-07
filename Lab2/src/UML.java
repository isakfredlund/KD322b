import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;


public class UML extends JFrame {

	private JPanel contentPane;
	private JTextField txtHouse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UML frame = new UML();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UML() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtHouse = new JTextField();
		txtHouse.setBounds(161, 5, 57, 28);
		txtHouse.setText("House");
		contentPane.add(txtHouse);
		txtHouse.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("-");
		textPane.setBounds(47, 66, 1, 16);
		contentPane.add(textPane);
		
		JTextPane txtpnyearintsizeintnbrofhousesint = new JTextPane();
		txtpnyearintsizeintnbrofhousesint.setText("-year:int\n-size:int\n-nbrOfHouses:int\n+MIN_SIZE:int\n\n+House(year:int, size:int)\n+getNbrOfHouses()\ngetSize():int\ngetYear():int\n\n\n/** minus = private, plus = public**/");
		txtpnyearintsizeintnbrofhousesint.setBounds(47, 66, 294, 306);
		contentPane.add(txtpnyearintsizeintnbrofhousesint);
	}
}
