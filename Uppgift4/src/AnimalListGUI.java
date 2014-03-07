import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;


public class AnimalListGUI extends JFrame {

	private JPanel contentPane;
	private ArrayList<Animal> animalZoo; 
	private JTextArea textArea;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalListGUI frame = new AnimalListGUI();
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
	public AnimalListGUI() {
		
		animalZoo = new ArrayList<Animal> ();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(18, 23, 411, 232);
		contentPane.add(textArea);
		
		JLabel lblAnimallist = new JLabel("AnimalList");
		lblAnimallist.setBounds(18, 6, 131, 16);
		contentPane.add(lblAnimallist);
		
		animalZoo.add(new Cats("Kalle", 6, 9));
		animalZoo.add(new Cats("Wille", 6, 9));
		animalZoo.add(new Dogs("Dogge", 9, true));
		animalZoo.add(new Dogs("Buster", 9, false));
		animalZoo.add(new Snakes("Spape", false));
		animalZoo.add(new Snakes("Sneaky", true));
		
		for(Animal i :animalZoo){
			textArea.append(i.getInfo() + "\n");
		}
	}
}
