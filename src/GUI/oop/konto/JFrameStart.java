package GUI.oop.konto;

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

public class JFrameStart extends JFrame {

	private JPanel contentPane;
	private JLabel lblTitle;
	private JButton buttonGiro;
	private JButton buttonSpar;

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
		setBounds(100, 100, 251, 120);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTitle = new JLabel("Bitte w\u00E4hlen Sie gew\u00FCnschte Kontoart:");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTitle.setBounds(10, 11, 264, 20);
		contentPane.add(lblTitle);
		
		buttonGiro = new JButton("Girokonto");
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
		buttonGiro.setBounds(125, 42, 100, 23);
		contentPane.add(buttonGiro);
		
		buttonSpar = new JButton("Sparkonto");
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
		buttonSpar.setBounds(10, 42, 100, 23);
		contentPane.add(buttonSpar);
	}
}
