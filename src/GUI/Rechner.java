package GUI;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Rechner extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel zahl1Label;
	private JLabel zahl2Label;
	private JTextField zahl1;
	private JTextField zahl2;
	private JButton addieren;
	private JButton multiplizieren;
	private JButton subtrahieren;
	private JButton dividieren;
	private JButton neu;
	private JButton ende;
	private JTextField ergebnis;
	private String zahl1True = null;
	private String zahl2True = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rechner frame = new Rechner();
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
	public Rechner() {		
		setTitle("Taschenrechner");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 310, 210);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		zahl1Label = new JLabel("Zahl 1");
		zahl1Label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		zahl1Label.setBounds(10, 11, 64, 20);
		contentPane.add(zahl1Label);

		zahl2Label = new JLabel("Zahl 2");
		zahl2Label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		zahl2Label.setBounds(10, 55, 64, 20);
		contentPane.add(zahl2Label);

		zahl1 = new JTextField();
		zahl1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//zahl2
				zahl1True = zahl1.getText();
				if(zahl1True != null) {
					disableOperators();
				} else {
					enableOperators();
				}
			}
		});
		zahl1.setBounds(84, 13, 86, 29);
		contentPane.add(zahl1);
		zahl1.setColumns(10);

		zahl2 = new JTextField();
		zahl2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zahl2True = zahl2.getText();
				if(zahl1True == null || zahl2True == null) {
					disableOperators();
				} else {
					enableOperators();
				}
			}
		});
		zahl2.setBounds(84, 53, 86, 29);
		contentPane.add(zahl2);
		zahl2.setColumns(10);

		addieren = new JButton("+");
		addieren.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(updateButtons() == true) {
					double dErgebnis = Double.parseDouble(zahl1.getText()) + Double.parseDouble(zahl2.getText());
					String str = String.valueOf(dErgebnis);
					ergebnis.setText(str);
				} else {
					ergebnis.setText("Bitte Zahlen eingeben!");
				}
			}
		});
		addieren.setBounds(180, 8, 50, 31);
		contentPane.add(addieren);

		multiplizieren = new JButton("*");
		multiplizieren.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double dErgebnis = Double.parseDouble(zahl1.getText()) * Double.parseDouble(zahl2.getText());
				String str = String.valueOf(dErgebnis);
				ergebnis.setText(str);
			}
		});
		multiplizieren.setBounds(180, 52, 50, 31);
		contentPane.add(multiplizieren);

		subtrahieren = new JButton("-");
		subtrahieren.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double dErgebnis = Double.parseDouble(zahl1.getText()) - Double.parseDouble(zahl2.getText());
				String str = String.valueOf(dErgebnis);
				ergebnis.setText(str);
			}
		});
		subtrahieren.setBounds(240, 8, 50, 31);
		contentPane.add(subtrahieren);

		dividieren = new JButton("/");
		dividieren.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double dErgebnis = Double.parseDouble(zahl1.getText()) / Double.parseDouble(zahl2.getText());
				String str = String.valueOf(dErgebnis);
				ergebnis.setText(str);
			}
		});
		dividieren.setBounds(240, 53, 50, 31);
		contentPane.add(dividieren);

		neu = new JButton("Neu");
		neu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disableOperators();
				zahl1.setText(null);
				zahl2.setText(null);
				ergebnis.setText(null);
			}
		});
		neu.setBounds(180, 94, 110, 31);
		contentPane.add(neu);

		ende = new JButton("Ende");
		ende.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ende.setBounds(180, 132, 110, 31);
		contentPane.add(ende);

		ergebnis = new JTextField();
		ergebnis.setEditable(false);
		ergebnis.setBounds(10, 95, 160, 68);
		contentPane.add(ergebnis);
		ergebnis.setColumns(10);

		disableOperators();
	}

	public boolean updateButtons() {
		if(zahl1 != null || zahl2 != null) {
			return true;

		} else {
			return false;
		}

	}

	public void enableOperators() {
		addieren.setEnabled(true);
		multiplizieren.setEnabled(true);
		subtrahieren.setEnabled(true);
		dividieren.setEnabled(true);
	}

	public void disableOperators() {
		addieren.setEnabled(false);
		multiplizieren.setEnabled(false);
		subtrahieren.setEnabled(false);
		dividieren.setEnabled(false);
	}
}
