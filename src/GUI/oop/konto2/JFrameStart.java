package GUI.oop.konto2;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import konto4.Adresse;
import konto4.Girokonto;
import konto4.Person;
import konto4.Sparkonto;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;

public class JFrameStart extends JFrame {

	private JPanel contentPane;
	private JButton buttonGiro;
	private JButton buttonSpar;
	private JButton buttonNewGiro;
	private JButton btnNewSpar;
	private JPanel panel;
	private JPanel panel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameStart frame = new JFrameStart();
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
	public JFrameStart() {
		setTitle("Kontoverwaltung");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 258, 227);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Beispiele", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(6, 11, 228, 80);
		contentPane.add(panel);
		panel.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Neues Konto Erstellen", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(6, 102, 228, 80);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		buttonGiro = new JButton("Girokonto");
		buttonGiro.setBounds(6, 16, 214, 23);
		panel.add(buttonGiro);
		
		buttonSpar = new JButton("Sparkonto");
		buttonSpar.setBounds(6, 50, 214, 23);
		panel.add(buttonSpar);
		buttonSpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Adresse adresse = new Adresse("Sysokoplomatoniker Straﬂe", "14a", "28325", "Sysokoplonien");
				Person person = new Person("Parunokitometarohodikero", "Sysokoplomatoniker", adresse);
				Sparkonto konto = new Sparkonto(person);
				konto.einzahlen(1000);
				JFrameSparkonto spar = new JFrameSparkonto(konto);
				spar.setVisible(true);
				
			}
			
		});
		buttonGiro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Adresse adresse = new Adresse("Sysokoplomatoniker Straﬂe", "14a", "28325", "Sysokoplonien");
				Person person = new Person("Parunokitometarohodikero", "Sysokoplomatoniker", adresse);
				Girokonto konto = new Girokonto(person, 500);
				konto.einzahlen(1000);
				JFrameGirokonto giro = new JFrameGirokonto(konto);
				giro.setVisible(true);
				
			}
			
		});
		
		buttonNewGiro = new JButton("Neues  Girokonto");
		buttonNewGiro.setBounds(6, 16, 214, 23);
		panel_1.add(buttonNewGiro);
		
		btnNewSpar = new JButton("Neues  Sparkonto");
		btnNewSpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewSpar.setBounds(6, 46, 214, 23);
		panel_1.add(btnNewSpar);
		buttonNewGiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}
}
