package GUI.oop.konto;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import konto4.Sparkonto;

public class JFrameSparkonto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblOwner;
	private JTextField textFieldOwner;
	private JLabel lblValue;
	private JTextField textFieldValue;
	private JButton buttonPayIn;
	private JButton buttonPayOut;
	private JLabel lblMoney;
	private JTextField textFieldMoney;
	private Sparkonto konto = null;

	public JFrameSparkonto(Sparkonto konto) {
		setTitle("Sparkonto");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 435, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.konto = konto;

		lblOwner = new JLabel("Inhaber:");
		lblOwner.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblOwner.setBounds(10, 11, 90, 20);
		contentPane.add(lblOwner);

		lblMoney = new JLabel("Saldo:");
		lblMoney.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMoney.setBounds(10, 73, 90, 20);
		contentPane.add(lblMoney);

		lblValue = new JLabel("Betrag:");
		lblValue.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblValue.setBounds(10, 42, 90, 20);
		contentPane.add(lblValue);

		buttonPayIn = new JButton("Einzahlen");
		buttonPayIn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (textFieldValue.getText().length() > 0) {
					konto.abheben(Double.parseDouble(String.valueOf(textFieldValue.getText())));
					initFields();
					
				} else {
					
				}

			}

		});
		buttonPayIn.setBounds(187, 42, 105, 23);
		contentPane.add(buttonPayIn);

		buttonPayOut = new JButton("Auszahlen");
		buttonPayOut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (textFieldValue.getText().length() > 0) {
					konto.abheben(Double.parseDouble(String.valueOf(textFieldValue.getText())));
					initFields();
					
				} else {
					
				}

			}

		});
		buttonPayOut.setBounds(299, 42, 111, 23);
		contentPane.add(buttonPayOut);

		textFieldOwner = new JTextField();
		textFieldOwner.setEditable(false);
		textFieldOwner.setText(konto.getName());
		textFieldOwner.setBounds(80, 12, 330, 20);
		contentPane.add(textFieldOwner);
		textFieldOwner.setColumns(10);

		textFieldValue = new JTextField();
		textFieldValue.addKeyListener(new KeyListener() {

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
		textFieldValue.setColumns(10);
		textFieldValue.setBounds(80, 43, 100, 20);
		contentPane.add(textFieldValue);

		textFieldMoney = new JTextField();
		textFieldMoney.setText(konto.getKontostand().toString());
		textFieldMoney.setEditable(false);
		textFieldMoney.setColumns(10);
		textFieldMoney.setBounds(80, 74, 100, 20);
		contentPane.add(textFieldMoney);

	}

	private void initFields() {
		textFieldMoney.setText(konto.getKontostand().toString());

	}
}
