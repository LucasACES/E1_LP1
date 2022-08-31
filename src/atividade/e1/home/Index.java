package atividade.e1.home;

import atividade.e1.home.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.DropMode;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Index {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index window = new Index();
					window.frame.setVisible(true);
					window.frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Index() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 393, 282);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnVehicle = new JTextPane();
		txtpnVehicle.setFont(new Font("Georgia", Font.BOLD, 18));
		txtpnVehicle.setEditable(false);
		txtpnVehicle.setText("Vehicle");
		txtpnVehicle.setBounds(145, 16, 76, 35);
		frame.getContentPane().add(txtpnVehicle);
		
		JTextPane txtpnModel = new JTextPane();
		txtpnModel.setText("Model:");
		txtpnModel.setBounds(33, 70, 36, 20);
		frame.getContentPane().add(txtpnModel);
		
		JTextPane txtpnType = new JTextPane();
		txtpnType.setText("Type:");
		txtpnType.setBounds(33, 94, 36, 20);
		frame.getContentPane().add(txtpnType);
		
		JTextPane txtpnColor = new JTextPane();
		txtpnColor.setText("Color:");
		txtpnColor.setBounds(33, 119, 36, 20);
		frame.getContentPane().add(txtpnColor);
		
		JTextPane txtpnLicensePlate = new JTextPane();
		txtpnLicensePlate.setText("License Plate:");
		txtpnLicensePlate.setBounds(33, 144, 76, 20);
		frame.getContentPane().add(txtpnLicensePlate);
		
		JFormattedTextField EnterModel = new JFormattedTextField();
		EnterModel.setBounds(79, 70, 241, 20);
		frame.getContentPane().add(EnterModel);
		
		JFormattedTextField EnterType = new JFormattedTextField();
		EnterType.setBounds(79, 94, 241, 20);
		frame.getContentPane().add(EnterType);
		
		JFormattedTextField EnterColor = new JFormattedTextField();
		EnterColor.setBounds(79, 119, 241, 20);
		frame.getContentPane().add(EnterColor);
		
		JFormattedTextField EnterLicensePlate = new JFormattedTextField();
		EnterLicensePlate.setBounds(119, 144, 201, 20);
		frame.getContentPane().add(EnterLicensePlate);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(152, 251, 152));
		btnNewButton.setBounds(139, 191, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
