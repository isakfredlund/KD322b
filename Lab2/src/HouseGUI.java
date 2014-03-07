import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import java.awt.Toolkit;


public class HouseGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
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
	public HouseGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(HouseGUI.class.getResource("/Image/Zeppelin.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("CheckBox.select"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(42, 17, 362, 341);
		contentPane.add(textArea);
		
		House HouseObject = new House(1968, 40);
		House HouseObject2 = new House(1864, 200);
		House HouseObject3 = new House(1950, 70);
		
		House[] houseAr = new House[10];
		
		houseAr [0] = HouseObject;
		houseAr [1] = HouseObject2;
		houseAr [2] = HouseObject3;
		
		for(int i = 0; i < houseAr.length;i++){
			if(houseAr[i] != null){
			int a = i + 1;
		textArea.append("Hus nummer " + a + " och ar" +houseAr[i].getSize() + " och ar " +houseAr[i].getYear()+ " Kvm \n" );
		}
		}
	
		textArea.append("Antal hus ar: " + House.getNbrHouses());
	}
}

