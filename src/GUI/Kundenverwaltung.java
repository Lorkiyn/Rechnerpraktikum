package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.SwingConstants;

public class Kundenverwaltung extends JFrame {

	private static final long serialVersionUID = 1L;
	private static JPanel contentPane;
	private static JLabel labelName;
	private static JLabel labelFirstName;
	private static JRadioButton radioBronze;
	private static JRadioButton radioSilver;
	private static JRadioButton radioGold;
	private static JPanel panelStatus;
	private static JTextField textFieldName;
	private static JTextField textFieldFirstName;
	private static JLabel labelPercent;
	private static JSlider slider;
	private static JButton buttonPrint;
	private static JButton buttonExit;
	private static JCheckBox checkBoxSend;
	private static JLabel labelPic;
	private static final ButtonGroup buttonGroup = new ButtonGroup();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kundenverwaltung frame = new Kundenverwaltung();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Kundenverwaltung() {
		setTitle("Kundenverwaltung");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 337, 329);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		labelName = new JLabel("Name:");
		labelName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelName.setBounds(10, 82, 73, 25);
		contentPane.add(labelName);
		
		labelFirstName = new JLabel("Vorname:");
		labelFirstName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelFirstName.setBounds(10, 118, 73, 25);
		contentPane.add(labelFirstName);
		
		panelStatus = new JPanel();
		panelStatus.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Kundenstatus", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelStatus.setBounds(189, 81, 120, 105);
		contentPane.add(panelStatus);
		panelStatus.setLayout(null);
		
		radioBronze = new JRadioButton("Bronzekunde");
		radioBronze.setSelected(true);
		buttonGroup.add(radioBronze);
		radioBronze.setBounds(6, 19, 109, 23);
		panelStatus.add(radioBronze);
		
		radioSilver = new JRadioButton("Silberkunde");
		buttonGroup.add(radioSilver);
		radioSilver.setBounds(6, 45, 109, 23);
		panelStatus.add(radioSilver);
		
		radioGold = new JRadioButton("Goldkunde");
		buttonGroup.add(radioGold);
		radioGold.setBounds(6, 71, 109, 23);
		panelStatus.add(radioGold);
		
		textFieldName = new JTextField();
		textFieldName.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(Character.isLetter(c) || Character.isWhitespace(c)) {

				} else {
					e.consume();
				}

			}

			@Override
			public void keyReleased(KeyEvent e) {

			}

			@Override
			public void keyPressed(KeyEvent e) {

			}
		});
		textFieldName.setBounds(93, 83, 86, 25);
		contentPane.add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldFirstName = new JTextField();
		textFieldFirstName.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(Character.isLetter(c) || Character.isWhitespace(c)) {

				} else {
					e.consume();
				}

			}

			@Override
			public void keyReleased(KeyEvent e) {

			}

			@Override
			public void keyPressed(KeyEvent e) {

			}
		});
		textFieldFirstName.setColumns(10);
		textFieldFirstName.setBounds(93, 121, 86, 25);
		contentPane.add(textFieldFirstName);
		
		labelPercent = new JLabel("20 %");
		labelPercent.setHorizontalAlignment(SwingConstants.CENTER);
		labelPercent.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelPercent.setBounds(10, 175, 169, 25);
		contentPane.add(labelPercent);
		
		slider = new JSlider();
		slider.setFont(new Font("Tahoma", Font.PLAIN, 10));
		slider.setMinorTickSpacing(1);
		slider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent arg0) {
				labelPercent.setText(slider.getValue() +" %");
				
			}
			
		});
		slider.setMaximum(20);
		slider.setPaintLabels(true);
		slider.setMajorTickSpacing(2);
		slider.setPaintTicks(true);
		slider.setBounds(10, 198, 169, 52);
		contentPane.add(slider);
			
		buttonPrint = new JButton("Daten drucken");
		buttonPrint.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				print();
				
			}
			
		});
		buttonPrint.setBounds(189, 197, 120, 25);
		contentPane.add(buttonPrint);
		
		buttonExit = new JButton("Tsch\u00FCss");
		buttonExit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
			
		});
		buttonExit.setToolTipText("Ende");
		buttonExit.setBounds(189, 233, 120, 25);
		contentPane.add(buttonExit);
		
		checkBoxSend = new JCheckBox("Katalog schiken?");
		checkBoxSend.setBounds(10, 257, 169, 23);
		contentPane.add(checkBoxSend);
		
		labelPic = new JLabel("");
		labelPic.setBounds(10, 11, 300, 60);
		ImageIcon szut = new ImageIcon("ressources/szut.jpg");
		szut.setImage(szut.getImage().getScaledInstance(labelPic.getWidth(), labelPic.getHeight(), Image.SCALE_SMOOTH));
		labelPic.setIcon(szut);
		contentPane.add(labelPic);
	}
	
	private static void print() {
		System.out.println("Nachname       : " +textFieldName.getText());
		System.out.println("Vorname        : " +textFieldFirstName.getText());
		
		if (radioBronze.isSelected()) {
			System.out.println("Kundenstatus   : Bronze" );
		}
		
		if (radioSilver.isSelected()) {
			System.out.println("Kundenstatus   : Silber");
		}
		
		if (radioGold.isSelected()) {
			System.out.println("Kundenstatus   : Gold");
		}
										   
		System.out.println("Rabatt         : " +slider.getValue() +" %");
		
		if (checkBoxSend.isSelected()) {
			System.out.println("Katalog        : " +"Ja");
		} else  {
			System.out.println("Katalog        : " +"Nein");

		}
		
	}
}
