/** 			 GUI 			**/


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextArea;

import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.border.MatteBorder;


public class Calculator extends JFrame {

	Calculator1 myCalculator = new Calculator1();

	private JPanel contentPane;
	private JTextField textField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Calculator.class.getResource("/Image/Math.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		final Calculator1 Calculator1Object = new Calculator1();
		
		JButton button = new JButton("1");
		button.setBounds(24, 114, 60, 50);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(1);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		contentPane.setLayout(null);
		contentPane.add(button);
		
		JButton button_1 = new JButton("2");
		button_1.setBounds(96, 114, 60, 50);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(2);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
				
			}
		});
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.setBounds(168, 114, 60, 50);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			myCalculator.numberButtonPressed(3);
			int i = myCalculator.getOperand();
			textField.setText(String.valueOf(i));	
			}
		});
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.setBounds(24, 176, 60, 50);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(4);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.setBounds(96, 176, 60, 50);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(5);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.setBounds(168, 176, 60, 50);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(6);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("7");
		button_6.setBounds(24, 238, 60, 50);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(7);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("8");
		button_7.setBounds(96, 238, 60, 50);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(8);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("9");
		button_8.setBounds(168, 238, 60, 50);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(9);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("0");
		button_9.setBounds(96, 300, 60, 49);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(0);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(0));
			}
		});
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("+");
		button_10.setBounds(240, 114, 41, 50);
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.plus();
				//int i = myCalculator.getOperand();
				//textField.setText(String.valueOf(0));
			}
		});
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("-");
		button_11.setBounds(240, 176, 41, 50);
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.minus();
				//textField.setText(String.valueOf(b))
			}
		});
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("=");
		button_12.setForeground(new Color(0, 0, 0));
		button_12.setBackground(new Color(0, 0, 0));
		button_12.setBounds(168, 300, 113, 49);
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.equals();
				int i = myCalculator.getResult();
				textField.setText(String.valueOf(i));
				
			}
		});
		contentPane.add(button_12);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(24, 300, 60, 49);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.clear();
				textField.setText("0");
			}
		});
		contentPane.add(btnC);
		
		JButton button_13 = new JButton("*");
		button_13.setBounds(240, 238, 41, 50);
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.mult();
			}
		});
		contentPane.add(button_13);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBackground(SystemColor.window);
		panel.setBounds(24, 31, 257, 57);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Chalkboard SE", Font.PLAIN, 16));
		textField.setBounds(6, 6, 245, 45);
		panel.add(textField);
		textField.setColumns(10);
	}
}
