package GUI.oop.konto2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import konto4.Adresse;

public class JFrameNewAdress extends JFrame {

	private JPanel contentPane;
	private JLabel lblStreet;
	private JLabel lblNumber;
	private JLabel lblZip;
	private JLabel lblCountry;
	private JPanel panel;
	private JButton buttonNext;
	private JTextField textFieldStreet;
	private JTextField textFieldNumber;
	private JTextField textFieldZip;
	private JTextField textFieldCountry;
	private Adresse adress = null;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameNewAdress frame = new JFrameNewAdress();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JFrameNewAdress() {
		setTitle("Adresse erstellen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 210);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Addresse", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 11, 414, 122);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblStreet = new JLabel("Stra\u00DFe:");
		lblStreet.setBounds(6, 16, 100, 15);
		panel.add(lblStreet);
		lblStreet.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblNumber = new JLabel("Hausnummer:");
		lblNumber.setBounds(6, 42, 100, 15);
		panel.add(lblNumber);
		lblNumber.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblZip = new JLabel("Postleitzahl:");
		lblZip.setBounds(6, 68, 100, 15);
		panel.add(lblZip);
		lblZip.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblCountry = new JLabel("Land:");
		lblCountry.setBounds(6, 94, 100, 15);
		panel.add(lblCountry);
		lblCountry.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		textFieldStreet = new JTextField();
		textFieldStreet.setBounds(116, 14, 288, 20);
		panel.add(textFieldStreet);
		textFieldStreet.setColumns(10);
		
		textFieldNumber = new JTextField();
		textFieldNumber.setColumns(10);
		textFieldNumber.setBounds(116, 40, 288, 20);
		panel.add(textFieldNumber);
		
		textFieldZip = new JTextField();
		textFieldZip.setColumns(10);
		textFieldZip.setBounds(116, 66, 288, 20);
		panel.add(textFieldZip);
		
		textFieldCountry = new JTextField();
		textFieldCountry.setColumns(10);
		textFieldCountry.setBounds(116, 92, 288, 20);
		panel.add(textFieldCountry);
		
		buttonNext = new JButton("Weiter");
		buttonNext.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				createAdress();
				
			}
			
		});
		buttonNext.setBounds(10, 138, 414, 23);
		contentPane.add(buttonNext);
		
	}
	
	private void createAdress() {
		adress = new Adresse(textFieldStreet.getText().toString(), textFieldNumber.getText().toString(), textFieldZip.getText().toString(), textFieldCountry.getText().toString());
		
	}
	
	public Adresse getAdress() {
		return adress;
	}

}
