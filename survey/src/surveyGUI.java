
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;

//public class name surveyGUI
public class surveyGUI {

	//variables
	private JFrame frame;
	private JTextField textFirstName;
	private JTextField textLastName;
	private JTextField textCity;
	private JTextField textState;
	private JTextField textZipCode;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	//launch application
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					surveyGUI window = new surveyGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//create application
	public surveyGUI() {
		initialize();
	}

	//initialize
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 768, 848);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("User Survey:");
		lblTitle.setFont(new Font("Arial", Font.BOLD, 16));
		lblTitle.setBounds(10, 10, 100, 22);
		frame.getContentPane().add(lblTitle);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setFont(new Font("Arial", Font.PLAIN, 16));
		lblFirstName.setBounds(10, 52, 82, 22);
		frame.getContentPane().add(lblFirstName);
		
		textFirstName = new JTextField();
		textFirstName.setBounds(102, 56, 155, 19);
		frame.getContentPane().add(textFirstName);
		textFirstName.setColumns(10);
		
		textLastName = new JTextField();
		textLastName.setColumns(10);
		textLastName.setBounds(393, 56, 155, 19);
		frame.getContentPane().add(textLastName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setFont(new Font("Arial", Font.PLAIN, 16));
		lblLastName.setBounds(301, 59, 82, 15);
		frame.getContentPane().add(lblLastName);
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setFont(new Font("Arial", Font.PLAIN, 16));
		lblCity.setBounds(10, 94, 42, 23);
		frame.getContentPane().add(lblCity);
		
		textCity = new JTextField();
		textCity.setColumns(10);
		textCity.setBounds(52, 98, 155, 19);
		frame.getContentPane().add(textCity);
		
		JLabel lblState = new JLabel("State:");
		lblState.setFont(new Font("Arial", Font.PLAIN, 16));
		lblState.setBounds(248, 94, 53, 26);
		frame.getContentPane().add(lblState);
		
		textState = new JTextField();
		textState.setColumns(10);
		textState.setBounds(301, 98, 42, 19);
		frame.getContentPane().add(textState);
		
		JLabel lblZipCode = new JLabel("Zip Code:");
		lblZipCode.setFont(new Font("Arial", Font.PLAIN, 16));
		lblZipCode.setBounds(386, 94, 100, 26);
		frame.getContentPane().add(lblZipCode);
		
		textZipCode = new JTextField();
		textZipCode.setColumns(10);
		textZipCode.setBounds(466, 98, 96, 19);
		frame.getContentPane().add(textZipCode);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setFont(new Font("Arial", Font.PLAIN, 16));
		lblGender.setBounds(10, 137, 58, 22);
		frame.getContentPane().add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		buttonGroup_1.add(rdbtnMale);
		rdbtnMale.setFont(new Font("Arial", Font.PLAIN, 16));
		rdbtnMale.setBounds(74, 139, 83, 22);
		frame.getContentPane().add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		buttonGroup_1.add(rdbtnFemale);
		rdbtnFemale.setFont(new Font("Arial", Font.PLAIN, 16));
		rdbtnFemale.setBounds(154, 140, 82, 21);
		frame.getContentPane().add(rdbtnFemale);
		
		JLabel lblInterests = new JLabel("Interests:");
		lblInterests.setFont(new Font("Arial", Font.PLAIN, 16));
		lblInterests.setBounds(10, 201, 66, 22);
		frame.getContentPane().add(lblInterests);
		
		JLabel lblLine1 = new JLabel("Choose one or more");
		lblLine1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblLine1.setBounds(10, 222, 150, 22);
		frame.getContentPane().add(lblLine1);
		
		JLabel lblComPref = new JLabel("Communcation Preference:");
		lblComPref.setFont(new Font("Arial", Font.PLAIN, 16));
		lblComPref.setBounds(248, 201, 190, 22);
		frame.getContentPane().add(lblComPref);
		
		JLabel lblLine2 = new JLabel("Choose one");
		lblLine2.setFont(new Font("Arial", Font.PLAIN, 16));
		lblLine2.setBounds(248, 223, 89, 20);
		frame.getContentPane().add(lblLine2);
		
		JCheckBox chckbxArt = new JCheckBox("Art");
		chckbxArt.setFont(new Font("Arial", Font.PLAIN, 16));
		chckbxArt.setBounds(10, 266, 53, 26);
		frame.getContentPane().add(chckbxArt);
		
		JCheckBox chckbxMusic = new JCheckBox("Music");
		chckbxMusic.setFont(new Font("Arial", Font.PLAIN, 16));
		chckbxMusic.setBounds(10, 294, 82, 26);
		frame.getContentPane().add(chckbxMusic);
		
		JCheckBox chckbxScience = new JCheckBox("Science");
		chckbxScience.setFont(new Font("Arial", Font.PLAIN, 16));
		chckbxScience.setBounds(10, 322, 83, 26);
		frame.getContentPane().add(chckbxScience);
		
		JCheckBox chckbxTechnology = new JCheckBox("Technology");
		chckbxTechnology.setFont(new Font("Arial", Font.PLAIN, 16));
		chckbxTechnology.setBounds(10, 350, 112, 26);
		frame.getContentPane().add(chckbxTechnology);
		
		JCheckBox chckbxFood = new JCheckBox("Food");
		chckbxFood.setFont(new Font("Arial", Font.PLAIN, 16));
		chckbxFood.setBounds(10, 378, 71, 26);
		frame.getContentPane().add(chckbxFood);
		
		JCheckBox chckbxGames = new JCheckBox("Games");
		chckbxGames.setFont(new Font("Arial", Font.PLAIN, 16));
		chckbxGames.setBounds(10, 406, 82, 26);
		frame.getContentPane().add(chckbxGames);
		
		JRadioButton rdbtnEmail = new JRadioButton("Email");
		buttonGroup.add(rdbtnEmail);
		rdbtnEmail.setFont(new Font("Arial", Font.PLAIN, 16));
		rdbtnEmail.setBounds(248, 271, 71, 21);
		frame.getContentPane().add(rdbtnEmail);
		
		JRadioButton rdbtnTextMessage = new JRadioButton("Text Message");
		buttonGroup.add(rdbtnTextMessage);
		rdbtnTextMessage.setFont(new Font("Arial", Font.PLAIN, 16));
		rdbtnTextMessage.setBounds(248, 310, 125, 21);
		frame.getContentPane().add(rdbtnTextMessage);
		
		JRadioButton rdbtnPhone = new JRadioButton("Phone");
		buttonGroup.add(rdbtnPhone);
		rdbtnPhone.setFont(new Font("Arial", Font.PLAIN, 16));
		rdbtnPhone.setBounds(248, 350, 71, 21);
		frame.getContentPane().add(rdbtnPhone);
		
		JLabel lblSurveyResults = new JLabel("Survey Results:");
		lblSurveyResults.setFont(new Font("Arial", Font.PLAIN, 16));
		lblSurveyResults.setBounds(492, 222, 110, 20);
		frame.getContentPane().add(lblSurveyResults);
		
		
		JTextArea textAreaResults = new JTextArea();
		textAreaResults.setBounds(492, 247, 235, 282);
		frame.getContentPane().add(textAreaResults);
		
		JButton btnDisplayResults = new JButton("Display Results");
		btnDisplayResults.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String result = "";
				result += "First name: "+ textFirstName.getText()+"\n";
				result += "Last name: "+ textLastName.getText()+"\n";
				result += "City: "+ textCity.getText()+"\n";
				result += "State: "+ textState.getText()+"\n";
				result += "Zip Code: "+ textZipCode.getText()+"\n";
				
				result += "Gender: ";
				if(rdbtnMale.isSelected()) result += rdbtnMale.getText()+"\n";
				if(rdbtnFemale.isSelected()) result += rdbtnFemale.getText()+"\n";
				
				result += "Interests: \n";
				if(chckbxArt.isSelected()) result += chckbxArt.getText()+"\n";
				if(chckbxMusic.isSelected()) result += chckbxMusic.getText()+"\n";
				if(chckbxScience.isSelected()) result += chckbxScience.getText()+"\n";
				if(chckbxTechnology.isSelected()) result += chckbxTechnology.getText()+"\n";
				if(chckbxFood.isSelected()) result += chckbxFood.getText()+"\n";
				if(chckbxGames.isSelected()) result += chckbxGames.getText()+"\n";
				
				result +="Communication Preference: \n";
				if(rdbtnEmail.isSelected()) result += rdbtnEmail.getText()+"\n";
				if(rdbtnTextMessage.isSelected()) result += rdbtnTextMessage.getText()+"\n";
				if(rdbtnPhone.isSelected()) result += rdbtnPhone.getText()+"\n";
				
				//display results in text area
				textAreaResults.setText(result);
			
			}
		});
		btnDisplayResults.setFont(new Font("Arial", Font.PLAIN, 16));
		btnDisplayResults.setBounds(191, 453, 152, 39);
		frame.getContentPane().add(btnDisplayResults);
		
	}
//end class
}
