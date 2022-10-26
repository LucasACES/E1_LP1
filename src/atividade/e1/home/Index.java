package atividade.e1.home;

import atividade.e1.home.Vehicle;
import atividade.e1.home.CSVFile;
import atividade.e1.home.DataModeler;

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
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Dictionary;

import javax.swing.JLabel;
import java.awt.Label;
import java.awt.Button;
import java.awt.SystemColor;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Index {

	private JFrame frame;
	ArrayList<String> vehicleList = new ArrayList();
	HashSet<String> vehicleHash	= new HashSet();
	HashMap<String,String>vehicleDict = new HashMap();
	

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
		frame.setBounds(100, 100, 1000, 282);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JTextPane txtpnVehicle = new JTextPane();
		txtpnVehicle.setFont(new Font("Georgia", Font.BOLD, 18));
		txtpnVehicle.setEditable(false);
		txtpnVehicle.setText("Vehicle");
		txtpnVehicle.setBounds(145, 16, 76, 35);
		frame.getContentPane().add(txtpnVehicle);

		Label licensePlate = new Label("License Plate: ");
		licensePlate.setFont(new Font("Tahoma", Font.PLAIN, 11));
		licensePlate.setBounds(34, 143, 76, 22);
		frame.getContentPane().add(licensePlate);

		Label color = new Label("Color:");
		color.setFont(new Font("Tahoma", Font.PLAIN, 11));
		color.setBounds(34, 118, 42, 22);
		frame.getContentPane().add(color);

		Label type = new Label("Type: ");
		type.setFont(new Font("Tahoma", Font.PLAIN, 11));
		type.setBounds(34, 93, 39, 22);
		frame.getContentPane().add(type);

		Label model = new Label("Model: ");
		model.setFont(new Font("Tahoma", Font.PLAIN, 11));
		model.setBounds(34, 69, 42, 22);
		frame.getContentPane().add(model);

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
		EnterLicensePlate.setBounds(116, 144, 204, 20);
		frame.getContentPane().add(EnterLicensePlate);
		
		JTextArea textPane = new JTextArea();
		textPane.setEditable(false);
		textPane.setBackground(SystemColor.info);
		textPane.setBounds(346, 69, 628, 144);
		frame.getContentPane().add(textPane);
		
		
		JTextPane txtpnOutput = new JTextPane();
		txtpnOutput.setText("Output:");
		txtpnOutput.setFont(new Font("Georgia", Font.BOLD, 18));
		txtpnOutput.setEditable(false);
		txtpnOutput.setBounds(623, 16, 76, 35);
		frame.getContentPane().add(txtpnOutput);

		Label Sucess = new Label("Sucess !!!");
		Sucess.setForeground(new Color(255, 255, 255));
		Sucess.setBounds(159, 219, 62, 22);
		frame.getContentPane().add(Sucess);

		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				/*
				 * Vehicle v1 = new Vehicle(); v1.setCarColor(EnterColor.getText());
				 * v1.setCarModel(EnterModel.getText()); v1.setCarType(EnterType.getText());
				 * v1.setLicensePlate(EnterLicensePlate.getText());
				 * 
				 * 
				 * String objectVehicle = "Model: " + v1.getCarModel() + " Type: " +
				 * v1.getCarType() + " Color: " + v1.getCarColor() + " License Plate: " +
				 * v1.getLicensePlate();
				 */
				
				// ArrayList
				vehicleList.add(EnterModel.getText());
				vehicleList.add(EnterType.getText());
				vehicleList.add(EnterColor.getText());
				vehicleList.add(EnterLicensePlate.getText());
				
				// HashSet
				vehicleHash.add(EnterModel.getText());
				vehicleHash.add(EnterType.getText());
				vehicleHash.add(EnterColor.getText());
				vehicleHash.add(EnterLicensePlate.getText());
				
				// Dicionario
				vehicleDict.put("Model", EnterModel.getText());
				vehicleDict.put("Type", EnterType.getText());
				vehicleDict.put("Color", EnterColor.getText());
				vehicleDict.put("License Plate", EnterLicensePlate.getText());
				
				//System.out.println(vehicleDict.get("License Plate"));
				
				textPane.setText("ArrayList: " + vehicleList + "\r\n" +  "" + "\r\n" + "Hash: " + vehicleHash + "\r\n" +  "" + "\r\n" + "Dicionario: " + vehicleDict);
				
				
				EnterModel.setText("");
				EnterColor.setText("");
				EnterType.setText("");
				EnterLicensePlate.setText("");
				
				
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(152, 251, 152));
		btnNewButton.setBounds(111, 190, 89, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnLeave = new JButton("Exit");
		btnLeave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();

			}
		});
		btnLeave.setForeground(Color.BLACK);
		btnLeave.setBackground(Color.RED);
		btnLeave.setBounds(210, 190, 66, 23);
		frame.getContentPane().add(btnLeave);
		

		
		

	}
}
