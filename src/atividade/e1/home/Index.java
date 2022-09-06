package atividade.e1.home;

import atividade.e1.home.Vehicle;
import atividade.e1.home.CSVFile;

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
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Label;
import java.awt.Button;


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
	@SuppressWarnings("deprecation")
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
		
		Label Sucess = new Label("Sucess !!!");
		Sucess.setForeground(new Color(255, 255, 255));	
		Sucess.setBounds(159, 219, 62, 22);
		frame.getContentPane().add(Sucess);
		
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Vehicle v1 = new Vehicle();
				v1.setCarColor(EnterColor.getText());
				v1.setCarModel(EnterModel.getText());
				v1.setCarType(EnterType.getText());
				v1.setLicensePlate(EnterLicensePlate.getText());
				
				EnterColor.enable(false);
				EnterModel.enable(false);
				EnterType.enable(false);
				EnterLicensePlate.enable(false);
				EnterColor.setForeground(new Color(80, 80, 80));
				EnterModel.setForeground(new Color(80, 80, 80));
				EnterType.setForeground(new Color(80, 80, 80));
				EnterLicensePlate.setForeground(new Color(80, 80, 80));
				Sucess.setForeground(new Color(0, 128, 0));
				
				CSVFile cria = new CSVFile();
				try {
					cria.criar(v1.getCarColor(), v1.getCarModel(), v1.getCarType(), v1.getLicensePlate());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(152, 251, 152));
		btnNewButton.setBounds(111, 190, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnLeave = new JButton("Clear");
		btnLeave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				EnterModel.setText("");
				EnterColor.setText("");
				EnterType.setText("");
				EnterLicensePlate.setText("");
				EnterColor.enable(true);
				EnterModel.enable(true);
				EnterType.enable(true);
				EnterLicensePlate.enable(true);
				EnterColor.setForeground(new Color(0, 0, 0));
				EnterModel.setForeground(new Color(0, 0, 0));
				EnterType.setForeground(new Color(0, 0, 0));
				EnterLicensePlate.setForeground(new Color(0, 0, 0));
				
				Sucess.setForeground(new Color(255, 255, 255));
				
				
				
			}
		});
		btnLeave.setForeground(Color.BLACK);
		btnLeave.setBackground(Color.RED);
		btnLeave.setBounds(210, 190, 66, 23);
		frame.getContentPane().add(btnLeave);
		
		
		
		
		
		
		
		
	}
}
