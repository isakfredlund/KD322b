import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JScrollBar;


public class BikeShop extends JFrame {

/** deklarerar vardet for cyklarna*/	
	BikeStore myBikeStore = new BikeStore();
	
	private JPanel contentPane;
	private JTextField txtListOfBikes;
	private JTextField inputSize;
	private JTextField inputColor;
	private JTextField inputPrice;
	private JTextArea textArea;
	private JLabel lblSize;
	private JLabel lblColor;
	private JLabel lblPrice;
	private JSlider slider;
	private JScrollBar scrollBar;
	private JSlider slider_1;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikeShop frame = new BikeShop();
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
	public BikeShop() {
		/** har laggs alla cyklar in*/
		myBikeStore.addBike("Blue", 28, 1000);
		myBikeStore.addBike("Green", 28, 1000);
		myBikeStore.addBike("Yellow", 28, 1000);
		myBikeStore.addBike("Blue", 28, 1000);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/** funktioner för knappen, add new*/
		textArea = new JTextArea();
		textArea.setBounds(28, 63, 208, 236);
		contentPane.add(textArea);
		textArea.setText(myBikeStore.getAllBikes());
		
		JButton btnAddBike = new JButton("Add bike");
		btnAddBike.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int storlek;
				int pris;
				try {
					storlek = Integer.parseInt(inputSize.getText());
					pris = Integer.parseInt(inputPrice.getText());
					myBikeStore.addBike(inputColor.getText(), storlek, pris);
					textArea.setText(myBikeStore.getAllBikes());
				}
				catch(NumberFormatException a){
					
				}
			
				//myBike.nbrButtonPressed(Add bike);
				//int i = myBike.getOperand();
				
			}
		});
		btnAddBike.setBounds(286, 151, 117, 29);
		contentPane.add(btnAddBike);
		
		txtListOfBikes = new JTextField();
		txtListOfBikes.setText("LIST OF BIKES");
		txtListOfBikes.setBounds(79, 23, 101, 28);
		contentPane.add(txtListOfBikes);
		txtListOfBikes.setColumns(10);
		
		inputSize = new JTextField();
		inputSize.setBounds(321, 23, 101, 28);
		contentPane.add(inputSize);
		inputSize.setColumns(10);
		
		inputColor = new JTextField();
		inputColor.setBounds(321, 57, 101, 28);
		contentPane.add(inputColor);
		inputColor.setColumns(10);
		
		inputPrice = new JTextField();
		inputPrice.setBounds(321, 94, 101, 28);
		contentPane.add(inputPrice);
		inputPrice.setColumns(10);
		
		lblSize = new JLabel("SIZE:");
		lblSize.setBounds(248, 29, 61, 16);
		contentPane.add(lblSize);
		
		lblColor = new JLabel("COLOR:");
		lblColor.setBounds(248, 63, 61, 16);
		contentPane.add(lblColor);
		
		lblPrice = new JLabel("PRICE:");
		lblPrice.setBounds(248, 100, 61, 16);
		contentPane.add(lblPrice);
		
		slider = new JSlider();
		slider.setBounds(28, 269, 208, 29);
		contentPane.add(slider);
		
		scrollBar = new JScrollBar();
		scrollBar.setBounds(221, 63, 15, 236);
		contentPane.add(scrollBar);
		
		slider_1 = new JSlider();
		slider_1.setBounds(38, 293, 190, 29);
		contentPane.add(slider_1);
	}
}
