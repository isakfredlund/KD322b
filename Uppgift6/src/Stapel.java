import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.awt.event.ItemEvent;


public class Stapel extends JFrame {

	private Bargraph bargraph;
	
	private Document doc;
	
	private ArrayList<Diagram> programsList = new ArrayList<Diagram>();
	
	private JPanel contentPane;
	
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox;

	//private Diagram Diagram; 
	
	
	
	private Document openXmlFile(String fileName) { 
		Document doc = null;
		try { 
			File fXmlFile = new File(fileName);  
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance(); 
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();  
			doc = dBuilder.parse(fXmlFile);   
			doc.getDocumentElement().normalize();
			} catch
			(Exception e) {
				e.printStackTrace();  
				} 
		return doc; }
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stapel frame = new Stapel();
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
	public Stapel() {
		
		
		
		doc = openXmlFile("ht2013_antagning.xml");
		Element root = doc.getDocumentElement(); 
		NodeList nodes = root.getChildNodes();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(5, 43, 440, 28);
		contentPane.add(textArea);
		textArea.setText("First element: " + root.getNodeName());
		
		JLabel JLabel = new JLabel("");
		JLabel.setBounds(5, 5, 440, 28);
		contentPane.add(JLabel);
		JLabel.setText("Antal program: " + loadAllPrograms().size());
		
		
		programsList = loadAllPrograms();
		final JComboBox comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				bargraph.UpdateValue(programsList.get(comboBox.getSelectedIndex()).getWomen(),
						programsList.get(comboBox.getSelectedIndex()).getMen());
			}
		});
		comboBox.setBounds(6, 83, 439, 28);
		contentPane.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(programsList.toArray()));	// lägg till itemlistner..
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
				
				int index = comboBox.getSelectedIndex();
			}
		});
		
			
		
		
		
		bargraph = new Bargraph();
		bargraph.setBounds(5, 123, 440, 149);
		contentPane.add(bargraph);
		bargraph.getHeight();
		System.out.println(bargraph.getHeight());
		
		
		
		//bargraph.paint(g);
		//g.setColor(Color,BLUE);
		
		//fillRect(int x, int y, int w, int h)
			//bargraph.paint(g);
		//}
	}

	private ArrayList<Diagram>loadAllPrograms() { 
		
	ArrayList<Diagram> output = new ArrayList<Diagram>();

	
	NodeList programs = doc.getElementsByTagName("Program"); 
	for (int i = 0; i < programs.getLength(); i++) {
		
	
	    Node node = programs.item(i);
	    Element elm = (Element) node;
	    
	    String name = elm.getElementsByTagName("name").item(0).getTextContent();
	    String code = elm.getElementsByTagName("code").item(0).getTextContent();
	    int women = Integer.parseInt(elm.getElementsByTagName("women").item(0).getTextContent());
	    int men = Integer.parseInt(elm.getElementsByTagName("men").item(0).getTextContent());
	   
	
	
	Diagram diagram = new Diagram(name, code, women, men);
	    output.add(diagram);
	  }
	return output; }
}
