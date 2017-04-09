package com.form2bgames.filesharer.client.screen;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen extends JFrame{
	private ButtonGroup bg=new ButtonGroup();
	private JTextField textField_1;
	private JTextField textField;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	public LoginScreen() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(100, 77, 324, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField = new JPasswordField();
		textField.setBounds(100, 102, 324, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblUsernane = new JLabel("Username");
		lblUsernane.setBounds(10, 80, 48, 14);
		panel.add(lblUsernane);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 105, 46, 14);
		panel.add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(10, 140, 144, 23);
		panel.add(btnLogin);
		
		JButton btnCreateNewAccount = new JButton("Create New Account");
		btnCreateNewAccount.setBounds(280, 140, 144, 23);
		panel.add(btnCreateNewAccount);
		
		JLabel lblFileSgarer = new JLabel("File Sharer");
		lblFileSgarer.setBounds(191, 11, 82, 14);
		panel.add(lblFileSgarer);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 434, 261);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewUser = new JLabel("New User");
		lblNewUser.setBounds(10, 11, 46, 14);
		panel_1.add(lblNewUser);
		
		JLabel lblSavagesAlias = new JLabel("Savages Alias");
		lblSavagesAlias.setBounds(10, 40, 110, 14);
		panel_1.add(lblSavagesAlias);
		
		JLabel lblPreferredUsername = new JLabel("Username");
		lblPreferredUsername.setBounds(10, 65, 110, 14);
		panel_1.add(lblPreferredUsername);
		
		JLabel lblIPlay = new JLabel("I Play...");
		lblIPlay.setBounds(10, 90, 46, 14);
		panel_1.add(lblIPlay);
		
		JRadioButton rdbtnOverwatch = new JRadioButton("Overwatch");
		rdbtnOverwatch.setBounds(62, 86, 79, 23);
		panel_1.add(rdbtnOverwatch);
		
		JRadioButton rdbtnCsgo = new JRadioButton("CS:GO");
		rdbtnCsgo.setBounds(143, 86, 57, 23);
		panel_1.add(rdbtnCsgo);
		
		JRadioButton rdbtnLeague = new JRadioButton("League");
		rdbtnLeague.setBounds(202, 86, 61, 23);
		panel_1.add(rdbtnLeague);
		
		JRadioButton rdbtnOther = new JRadioButton("Other");
		rdbtnOther.setBounds(265, 86, 57, 23);
		panel_1.add(rdbtnOther);
		
		JRadioButton rdbtnContentManager = new JRadioButton("Content Manager");
		rdbtnContentManager.setBounds(319, 86, 109, 23);
		panel_1.add(rdbtnContentManager);
		
		JLabel lblPassword_1 = new JLabel("Password");
		lblPassword_1.setBounds(10, 115, 110, 14);
		panel_1.add(lblPassword_1);
		
		JLabel lblPasswordAgain = new JLabel("Password Again");
		lblPasswordAgain.setBounds(10, 140, 110, 14);
		panel_1.add(lblPasswordAgain);
		
		JLabel lblMyRequestCode = new JLabel("My Request Code Is...");
		lblMyRequestCode.setBounds(10, 200, 110, 14);
		panel_1.add(lblMyRequestCode);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(130, 197, 298, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(130, 137, 298, 20);
		panel_1.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(130, 112, 298, 20);
		panel_1.add(passwordField_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(130, 37, 298, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(130, 62, 298, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblAskSylvyrfyshFor = new JLabel("Give Sylvyrfysh your request code after hitting this button");
		lblAskSylvyrfyshFor.setBounds(10, 175, 298, 14);
		panel_1.add(lblAskSylvyrfyshFor);
		
		JButton btnNewButton = new JButton("Request Account");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(307, 171, 121, 23);
		panel_1.add(btnNewButton);
		
		rdbtnContentManager.setBounds(319, 86, 109, 23);
		panel_1.add(rdbtnContentManager);
		
		bg.add(rdbtnContentManager);
		bg.add(rdbtnOther);
		bg.add(rdbtnLeague);
		bg.add(rdbtnCsgo);
		bg.add(rdbtnOverwatch);
		
		JButton btnLoginScreen = new JButton("Login  Screen");
		btnLoginScreen.setBounds(331, 227, 97, 23);
		panel_1.add(btnLoginScreen);
	}
}
