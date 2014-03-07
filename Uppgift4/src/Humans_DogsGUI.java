import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Humans_DogsGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected static final Human String = null;
	private JPanel contentPane;
	private JTextField newHuman;
	private JTextField newDog;
	private JTextField showInfo;
	private JTextField showError;
	public Human human;
	public Dog dog;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Humans_DogsGUI frame = new Humans_DogsGUI();
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
	public Humans_DogsGUI() {
		
		human = new Human (null);
		dog = new Dog (null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 415, 353);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblHumansAndDogs = new JLabel("Humans and Dogs");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblHumansAndDogs, 22, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblHumansAndDogs, 130, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblHumansAndDogs, -75, SpringLayout.EAST, contentPane);
		lblHumansAndDogs.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		contentPane.add(lblHumansAndDogs);
		
		JButton btnNewHuman = new JButton("New Human");
		btnNewHuman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String namn = newHuman.getText();
				if(human != null && namn.length() > 3){		
				human = new Human(newHuman.getText());
				}else{
					showError.setText("Fail");
				}
				/*if(human != null){
					showInfo.setText("This human owns a dog named" + "dog");
				}*/
				
				//if (!.length) {
					//showInfo.setText("Dogless");
				//}
			}
		});
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblHumansAndDogs, -6, SpringLayout.NORTH, btnNewHuman);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewHuman, 68, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewHuman, 218, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewHuman, 335, SpringLayout.WEST, contentPane);
		contentPane.add(btnNewHuman);
		
		JButton btnNewButton = new JButton("Buy Dog");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(human != null){
					
					dog = new Dog(newDog.getText());
					human.buyDog(dog);
					/*showInfo.setText("The dog has got to have an owner");
					human.buyDog(showInfo.getText());
					dog = new Dog(showInfo.getText());
					human.buyDog(dog);*/
					
				//	if(!! newDog){
					//	showInfo.setText("Dogless");
					}
					}
			
		
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton, 111, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton, 218, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton, 335, SpringLayout.WEST, contentPane);
		contentPane.add(btnNewButton);
		
		JButton btnPrintInfo = new JButton("Print Info");
		btnPrintInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*if(human != null){
					showInfo.setText(human.getInfo());
					
				}else{
					showError.setText("Fail");
				}
				//human = new Human(newHuman.getText());
			}*/
		showInfo.setText(human.getInfo());
			}
				
			});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnPrintInfo, 152, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnPrintInfo, 218, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnPrintInfo, 335, SpringLayout.WEST, contentPane);
		contentPane.add(btnPrintInfo);
		
		newHuman = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, newHuman, 67, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, newHuman, 72, SpringLayout.WEST, contentPane);
		contentPane.add(newHuman);
		newHuman.setColumns(10);
		
		newDog = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, newDog, 110, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, newDog, 72, SpringLayout.WEST, contentPane);
		contentPane.add(newDog);
		newDog.setColumns(10);
		
		showInfo = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, showInfo, 193, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, showInfo, 72, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, showInfo, 233, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, showInfo, 335, SpringLayout.WEST, contentPane);
		contentPane.add(showInfo);
		showInfo.setColumns(10);
		
		showError = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, showError, 244, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, showError, 72, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, showError, 335, SpringLayout.WEST, contentPane);
		contentPane.add(showError);
		showError.setColumns(10);
		
		JLabel lblInfo = new JLabel("Info");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblInfo, 177, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblInfo, 80, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblInfo, 141, SpringLayout.WEST, contentPane);
		contentPane.add(lblInfo);
		
		JLabel lblErrorMessage = new JLabel("Error Message");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblErrorMessage, 230, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblErrorMessage, 82, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblErrorMessage, 187, SpringLayout.WEST, contentPane);
		contentPane.add(lblErrorMessage);
	}
}
