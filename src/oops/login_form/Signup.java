package oops.login_form;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.border.LineBorder;
import java.awt.Insets;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class Signup extends JFrame {

	private JPanel contentPane;
	private JTextField textEmailAddress;
	private JTextField textConfirmyourAddress;
	private JCheckBox chckbxImNotRobot;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup frame = new Signup();
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
	public Signup() {
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 910, 773);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setForeground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCreateYourAccount = new JLabel("CREATE YOUR ACCOUNT");
		lblCreateYourAccount.setForeground(Color.WHITE);
		lblCreateYourAccount.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 43));
		lblCreateYourAccount.setBounds(70, 47, 563, 89);
		contentPane.add(lblCreateYourAccount);
		
		JLabel lblEmailAddress = new JLabel("Email Address");
		lblEmailAddress.setForeground(Color.WHITE);
		lblEmailAddress.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		lblEmailAddress.setBounds(70, 167, 105, 34);
		contentPane.add(lblEmailAddress);
		
		textEmailAddress = new JTextField();
		textEmailAddress.setBackground(Color.LIGHT_GRAY);
		textEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textEmailAddress.setBounds(70, 196, 351, 34);
		contentPane.add(textEmailAddress);
		textEmailAddress.setColumns(10);
		
		JLabel lblConfirmYourAddress = new JLabel("Confirm your Address");
		lblConfirmYourAddress.setForeground(Color.WHITE);
		lblConfirmYourAddress.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		lblConfirmYourAddress.setBounds(70, 260, 149, 34);
		contentPane.add(lblConfirmYourAddress);
		
		textConfirmyourAddress = new JTextField();
		textConfirmyourAddress.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textConfirmyourAddress.setBackground(Color.LIGHT_GRAY);
		textConfirmyourAddress.setBounds(70, 289, 351, 34);
		contentPane.add(textConfirmyourAddress);
		textConfirmyourAddress.setColumns(10);
		
		JLabel lblCountryOfResidence = new JLabel("Country of Residence");
		lblCountryOfResidence.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		lblCountryOfResidence.setForeground(Color.WHITE);
		lblCountryOfResidence.setBounds(70, 359, 149, 34);
		contentPane.add(lblCountryOfResidence);
		
		JComboBox BoxCountryofResidence = new JComboBox();
		BoxCountryofResidence.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		BoxCountryofResidence.setBackground(Color.LIGHT_GRAY);
		BoxCountryofResidence.setForeground(Color.BLACK);
		BoxCountryofResidence.setToolTipText("");
		BoxCountryofResidence.setModel(new DefaultComboBoxModel(new String[] {"Ap-ga-ni-xtan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cabo Verde", "Cambodia", "Cameroon", "Canada", "Central African Republic", "Chad", "Chile", "China", "Colombia", "Comoros", "Congo", "Costa Rica", "C\u00F4te d'Ivoire", "Croatia", "Cuba", "Cyprus", "Czechia", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "DR Congo", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Eswatini", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Holy See", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Myanmar", "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "North Korea", "North Macedonia", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Romania", "Russia", "Rwanda", "Saint Kitts & Nevis", "Saint Lucia", "Samoa", "San Marino", "Sao Tome & Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Korea", "South Sudan", "Spain", "Sri Lanka", "St. Vincent & Grenadines", "State of Palestine", "Sudan", "Suriname", "Sweden", "Switzerland", "Syria", "Tajikistan", "Tanzania", "Thailand", "Timor-Leste", "Togo", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates\t", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Venezuela", "Viet Nam", "Yemen\t", "Zambia\t\t\t", "Zimbabwe\t\t\t"}));
		BoxCountryofResidence.setSelectedIndex(3);
		BoxCountryofResidence.setBounds(70, 388, 351, 34);
		contentPane.add(BoxCountryofResidence);
		
		chckbxImNotRobot = new JCheckBox("I'm not a robot");
		chckbxImNotRobot.setBounds(83, 473, 168, 65);
		contentPane.add(chckbxImNotRobot);
		chckbxImNotRobot.setForeground(Color.WHITE);
		chckbxImNotRobot.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		chckbxImNotRobot.setBackground(Color.GRAY);
		
		JCheckBox chckbxIm13yearsofage = new JCheckBox("I am 13 years of age or older and agree to the terms of the Stonk Subscriber Agreement");
		chckbxIm13yearsofage.setForeground(Color.WHITE);
		chckbxIm13yearsofage.setBackground(Color.DARK_GRAY);
		chckbxIm13yearsofage.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		chckbxIm13yearsofage.setBounds(70, 566, 653, 34);
		contentPane.add(chckbxIm13yearsofage);
		
		JLabel lbltheValvePrivacyPolicy = new JLabel("and the Valve Privacy Policy.");
		lbltheValvePrivacyPolicy.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lbltheValvePrivacyPolicy.setForeground(Color.WHITE);
		lbltheValvePrivacyPolicy.setBounds(70, 587, 241, 34);
		contentPane.add(lbltheValvePrivacyPolicy);
		
		JButton btnContinue = new JButton("Continue");
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnContinue.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnContinue.setBackground(Color.CYAN);
		btnContinue.setForeground(Color.DARK_GRAY);
		btnContinue.setBounds(70, 655, 202, 46);
		contentPane.add(btnContinue);
		
		JLabel lblCapcha_logo = new JLabel("New label");
		lblCapcha_logo.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\capcha_logo_78.png"));
		lblCapcha_logo.setBounds(343, 468, 78, 78);
		contentPane.add(lblCapcha_logo);
		
		JPanel panel_capcha = new JPanel();
		panel_capcha.setBackground(Color.GRAY);
		panel_capcha.setBounds(70, 456, 351, 96);
		contentPane.add(panel_capcha);
	}
}
