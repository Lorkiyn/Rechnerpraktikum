package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Taxi1 extends JFrame {

	/* Values */
	private static final double NIGHTTAX = 1.1;		//Preiserhoehung bei Nachtfahrt
	private static final double TAXITAX = 7;		//Taxisteuern (in %)
	private static final double NORMALTAXI = 0.5;	//Km Preis fuer normales Taxi
	private static final double BIGTAXI = 1.0;		//Km Preis fuer grosses Taxi
	private static final double STRECHLIMO = 2.0;	//Km Preis fuer Strechlimo
	private static final double BARPRICE = 15;		//Barpreis pro Person
	private static final double CHILDSEAT = 1;		//Aufpreis fuer Kindersitz
	private static final double STARTPARRA = 3.90;		//Aufpreis fuer Kindersitz
	private static final String MONEY = "�";		//Waehrung
	private static final String TYPE = "km";		//Waehrung
	private static double priceKm = 0.0;	//Normales Taxi preis pro km
	private static String date = new SimpleDateFormat("dd.MM.yyyy HH:mm").format(Calendar.getInstance().getTime()); //Datum

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox<Object> comboBoxType;
	private JPanel panelInput;
	private JLabel lblType;
	private JLabel lblDistance;
	private JTextField textFieldDistance;
	private JCheckBox radioNight;
	private JCheckBox radioChild;
	private JCheckBox radioBar;
	private JLabel lblPeople;
	private JPanel panelCalculation;
	private JLabel lblNetto;
	private JLabel lblTax;
	private JTextField textFieldOutNetto;
	private JTextField textFieldOutTax;
	private JSeparator separator;
	private JLabel lblBrutto;
	private JTextField textFieldOutBrutto;
	private JButton btnPrint;
	private JButton btnNew;
	private JSpinner spinnerPeoples;
	private JLabel lblNewLabel;
	private JLabel lblMoney1;
	private JLabel lblMoney2;
	private JLabel lblMoney3;
	private JCheckBox checkBoxInFont;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Taxi frame = new Taxi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Taxi1() {
		setAlwaysOnTop(false);
		setResizable(false);
		setTitle("Taxi");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 346);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		/* Input */
		panelInput = new JPanel();
		panelInput.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Eingaben", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelInput.setBounds(10, 11, 364, 160);
		contentPane.add(panelInput);
		panelInput.setLayout(null);

		lblType = new JLabel("Auswahl des Fahrzeugtyps");
		lblType.setBounds(10, 20, 190, 20);
		panelInput.add(lblType);

		lblDistance = new JLabel("Entfernung");
		lblDistance.setBounds(10, 45, 190, 20);
		panelInput.add(lblDistance);

		lblPeople = new JLabel("Fahrg\u00E4ste");
		lblPeople.setBounds(260, 122, 64, 20);
		panelInput.add(lblPeople);

		textFieldDistance = new JTextField();
		textFieldDistance.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void insertUpdate(DocumentEvent e) {
				calc();				
			
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				
				calc();
				
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				calc();
				
			}
			
		});
		
		textFieldDistance.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				char caracter = e.getKeyChar();
				if (((caracter < '0') || (caracter > '9')) && (caracter != '\b') && (caracter != ',')) {
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
		textFieldDistance.setBounds(219, 45, 117, 20);
		panelInput.add(textFieldDistance);
		textFieldDistance.setColumns(10);

		String comboBoxList[] = {"Normales Taxi", "Grossraum Taxi", "Strechlimousine"};
		comboBoxType = new JComboBox<Object>(comboBoxList);
		comboBoxType.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				calc();
				
			}
			
		});
		comboBoxType.setBounds(219, 20, 135, 20);
		panelInput.add(comboBoxType);

		radioNight = new JCheckBox("Nachtfahrt (Zuschlag " +(NIGHTTAX) +" %)");
		radioNight.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				calc();
				
			}
			
		});
		radioNight.setBounds(20, 70, 210, 23);
		panelInput.add(radioNight);

		radioChild = new JCheckBox("Kindersitz (Zuschlag " +CHILDSEAT +" " +MONEY +")");
		radioChild.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				calc();
				
			}
			
		});
		radioChild.setBounds(20, 96, 180, 23);
		panelInput.add(radioChild);

		radioBar = new JCheckBox("Bar (Zuschlag " +BARPRICE +" " +MONEY +")");
		radioBar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				calc();
				
			}
			
		});
		radioBar.setBounds(20, 122, 156, 23);
		panelInput.add(radioBar);

		spinnerPeoples = new JSpinner();
		spinnerPeoples.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		spinnerPeoples.setEditor(new JSpinner.DefaultEditor(spinnerPeoples));
		spinnerPeoples.setBounds(320, 122, 34, 20);
		spinnerPeoples.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				calc();
				
			}
		});
		panelInput.add(spinnerPeoples);

		lblNewLabel = new JLabel(TYPE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel.setBounds(338, 45, 16, 20);
		panelInput.add(lblNewLabel);


		/* Output */
		panelCalculation = new JPanel();
		panelCalculation.setLayout(null);
		panelCalculation.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Rechnungs\u00FCbersicht", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelCalculation.setBounds(10, 182, 215, 125);
		contentPane.add(panelCalculation);

		lblMoney1 = new JLabel(MONEY);
		lblMoney1.setBounds(195, 20, 20, 20);
		panelCalculation.add(lblMoney1);

		lblMoney2 = new JLabel(MONEY);
		lblMoney2.setBounds(195, 45, 20, 20);
		panelCalculation.add(lblMoney2);

		lblMoney3 = new JLabel(MONEY);
		lblMoney3.setBounds(195, 89, 20, 20);
		panelCalculation.add(lblMoney3);

		lblNetto = new JLabel("Nettobetrag");
		lblNetto.setBounds(10, 20, 105, 20);
		panelCalculation.add(lblNetto);

		lblTax = new JLabel("Mehrwertssteuer");
		lblTax.setBounds(10, 45, 105, 20);
		panelCalculation.add(lblTax);

		lblBrutto = new JLabel("Bruttobetrag");
		lblBrutto.setBounds(10, 89, 105, 20);
		panelCalculation.add(lblBrutto);

		textFieldOutNetto = new JTextField();
		textFieldOutNetto.setText("0");
		textFieldOutNetto.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldOutNetto.setEditable(false);
		textFieldOutNetto.setColumns(10);
		textFieldOutNetto.setBounds(116, 20, 75, 20);
		panelCalculation.add(textFieldOutNetto);

		textFieldOutTax = new JTextField();
		textFieldOutTax.setText("0");
		textFieldOutTax.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldOutTax.setEditable(false);
		textFieldOutTax.setColumns(10);
		textFieldOutTax.setBounds(116, 45, 75, 20);
		panelCalculation.add(textFieldOutTax);

		textFieldOutBrutto = new JTextField();
		textFieldOutBrutto.setText("0");
		textFieldOutBrutto.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldOutBrutto.setEditable(false);
		textFieldOutBrutto.setColumns(10);
		textFieldOutBrutto.setBounds(116, 89, 75, 20);
		panelCalculation.add(textFieldOutBrutto);

		separator = new JSeparator();
		separator.setBounds(10, 76, 196, 2);
		panelCalculation.add(separator);

		btnPrint = new JButton("Drucken");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcPrint();

			}

		});
		btnPrint.setBounds(235, 201, 135, 23);
		contentPane.add(btnPrint);

		btnNew = new JButton("Neu");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcReset();

			}

		});
		btnNew.setBounds(235, 235, 135, 23);
		contentPane.add(btnNew);

		setAlwaysOnTop(false);
		checkBoxInFont = new JCheckBox("Im Vordergrund");
		checkBoxInFont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (checkBoxInFont.isSelected()) setAlwaysOnTop(true);
				if (!checkBoxInFont.isSelected()) setAlwaysOnTop(false);

			}

		});
		checkBoxInFont.setBounds(231, 265, 139, 16);
		contentPane.add(checkBoxInFont);

	}

	private void calc() {
		if (textFieldDistance.getText().length() < 1) {
			textFieldOutBrutto.setText("0");
			textFieldOutTax.setText("0");
			textFieldOutNetto.setText("0");
			return;
		}
		
		double km = 0;
		double bar = 0;
		double taxiPay = 0;
		double netto = 0;
		double brutto = STARTPARRA;
		double tax = 0;
		try {
			km = Double.parseDouble(textFieldDistance.getText().trim().replace(',', '.'));
			if (radioChild.isSelected()) {
				brutto += 1;
			
			}
			
			if (radioBar.isSelected()) {
				bar = (int)spinnerPeoples.getValue() * BARPRICE;
			
			}

			switch (comboBoxType.getSelectedIndex())  {
				case 1:
					priceKm = BIGTAXI;
					break;
				
				case 2:
					priceKm = STRECHLIMO;
					break;
				
				default:
					priceKm = NORMALTAXI;
					break;
					
			}

			if (radioNight.isSelected()) {
				priceKm *= NIGHTTAX;
			
			}

			taxiPay = km * priceKm;

			brutto += taxiPay + bar;
			tax = (brutto / 100) * TAXITAX;
			netto = brutto - tax;

			brutto = Math.round(brutto*100)/100.0;
			tax = Math.round(tax*100)/100.0;
			netto = Math.round(netto*100)/100.0;

			textFieldOutTax.setText(String.valueOf(tax));
			textFieldOutNetto.setText(String.valueOf(netto));
			textFieldOutBrutto.setText(String.valueOf(brutto));

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Bitte geben Sie eine Entfernung an.   ", "Eingabefehler", JOptionPane.ERROR_MESSAGE);
		}

	}

	private void calcReset() {
		comboBoxType.setSelectedIndex(0);
		radioNight.setSelected(false);
		radioChild.setSelected(false);
		radioBar.setSelected(false);
		textFieldDistance.setText("");
		spinnerPeoples.setValue(1);
		textFieldOutNetto.setText("0");
		textFieldOutTax.setText("0");
		textFieldOutBrutto.setText("0");

	}

	protected void calcPrint() {
		System.out.println("\n\n"
				+ "Rechnung Taxi GmbH"
				+ "\t\t\t\t\t\t\t\t\tDatum: " +date
				+ "\n\nDienstleistungen:"
				+ "\n  Anfahrtspauschale: " +STARTPARRA +MONEY
				+ "\n  Entfernung: " +textFieldDistance.getText() +TYPE
				+ "\n  Nachtzuschlag: " +NIGHTTAX
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ "");


	}

}