package oops.login_form;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Panel;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Window.Type;


public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField account_name_Field;
	private JPasswordField password_Field;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setType(Type.UTILITY);
		setAutoRequestFocus(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(Color.DARK_GRAY);
		setBounds(100, 100, 793, 463);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_account_name = new JLabel("Account name");
		lbl_account_name.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		lbl_account_name.setForeground(Color.WHITE);
		lbl_account_name.setBackground(Color.WHITE);
		lbl_account_name.setBounds(90, 85, 115, 54);
		contentPane.add(lbl_account_name);
		
		JLabel lbl_password = new JLabel("Password");
		lbl_password.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		lbl_password.setForeground(Color.WHITE);
		lbl_password.setBackground(Color.WHITE);
		lbl_password.setBounds(90, 131, 115, 54);
		contentPane.add(lbl_password);
		
		account_name_Field = new JTextField();
		account_name_Field.setFont(new Font("Tahoma", Font.PLAIN, 15));
		account_name_Field.setForeground(Color.WHITE);
		account_name_Field.setBackground(Color.DARK_GRAY);
		account_name_Field.setBounds(265, 95, 469, 36);
		contentPane.add(account_name_Field);
		account_name_Field.setColumns(10);
		
		password_Field = new JPasswordField();
		password_Field.setFont(new Font("Tahoma", Font.PLAIN, 15));
		password_Field.setForeground(Color.WHITE);
		password_Field.setBackground(Color.DARK_GRAY);
		password_Field.setBounds(265, 141, 469, 36);
		contentPane.add(password_Field);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		btnLogin.setBackground(Color.GRAY);
		btnLogin.setBounds(265, 234, 227, 45);
		contentPane.add(btnLogin);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setBounds(502, 234, 232, 45);
		contentPane.add(btnCancel);
		
		JCheckBox chckbxRememberMyPassword = new JCheckBox("Remember my password");
		chckbxRememberMyPassword.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		chckbxRememberMyPassword.setForeground(Color.WHITE);
		chckbxRememberMyPassword.setBackground(Color.DARK_GRAY);
		chckbxRememberMyPassword.setBounds(265, 183, 170, 45);
		contentPane.add(chckbxRememberMyPassword);
		
		JButton btnCreateANewAccount = new JButton("CREATE A NEW ACCOUNT...");
		btnCreateANewAccount.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		btnCreateANewAccount.setHorizontalAlignment(SwingConstants.LEFT);
		btnCreateANewAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCreateANewAccount.setBounds(402, 333, 332, 36);
		contentPane.add(btnCreateANewAccount);
		
		JButton btnRetreiveALostAccount = new JButton("RETREIVE A LOST ACCOUNT...");
		btnRetreiveALostAccount.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		btnRetreiveALostAccount.setHorizontalAlignment(SwingConstants.LEFT);
		btnRetreiveALostAccount.setBounds(402, 379, 332, 36);
		contentPane.add(btnRetreiveALostAccount);
		
		JLabel lblDontHaveAStonkAccount = new JLabel("Don't have a Stonk account ? ");
		lblDontHaveAStonkAccount.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblDontHaveAStonkAccount.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDontHaveAStonkAccount.setForeground(Color.WHITE);
		lblDontHaveAStonkAccount.setBounds(151, 333, 227, 36);
		contentPane.add(lblDontHaveAStonkAccount);
		
		JLabel lblForgotYourLoginInfo = new JLabel("Forgot your login info ? ");
		lblForgotYourLoginInfo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblForgotYourLoginInfo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblForgotYourLoginInfo.setForeground(Color.WHITE);
		lblForgotYourLoginInfo.setBounds(151, 379, 227, 36);
		contentPane.add(lblForgotYourLoginInfo);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(53, 306, 681, 2);
		contentPane.add(separator);
		
		JLabel lblStonk_Logo = new JLabel("New label");
		lblStonk_Logo.setIcon(new ImageIcon("E:\\L\u1EACP TR\u00CCNH H\u01AF\u1EDANG \u0110\u1ED0I T\u01AF\u1EE2NG\\\u00DD T\u01AF\u1EDENG THI\u1EBET K\u1EBE\\logo_image.png"));
		lblStonk_Logo.setBounds(10, 10, 241, 87);
		contentPane.add(lblStonk_Logo);
	}
}
