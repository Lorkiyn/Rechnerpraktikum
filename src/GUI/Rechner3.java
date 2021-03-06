package GUI;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Rechner3 extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel number1Label;
	private JLabel number2Label;
	private JTextField number1JText;
	private JTextField number2JText;
	private JButton add;
	private JTextArea resultJArea;
	private JButton newJButton;
	private JButton exitJButton;
	private JButton mult;
	private JButton sub;
	private JButton div;
	private JButton sqrt;
	private JButton pow2;
	private JButton ans;
	private JButton powX;
	private double ansResult = 0;
	private JLabel lblNewLabel;
	private JButton percent;
	private JButton button_1;
	private JButton btnMSave;
	private JButton btnMPrint;
	private double m = 0;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rechner3 frame = new Rechner3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Rechner3() {

		setAlwaysOnTop(true);
		setTitle("Taschenrechner");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 217);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		number1Label = new JLabel("Zahl 1");
		number1Label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		number1Label.setHorizontalAlignment(SwingConstants.CENTER);
		number1Label.setBounds(0, 9, 60, 30);
		contentPane.add(number1Label);

		number2Label = new JLabel("Zahl 2");
		number2Label.setHorizontalAlignment(SwingConstants.CENTER);
		number2Label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		number2Label.setBounds(0, 50, 60, 30);
		contentPane.add(number2Label);

		//Zahl 1 ---------------------------------------------------
		number1JText = new JTextField();
		number1JText.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				char caracter = e.getKeyChar();
				if (((caracter < '0') || (caracter > '9')) && (caracter != '\b') && (caracter != '.') && (caracter != ',')) {
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

		number1JText.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == 10) {
					number2JText.requestFocus();
				}
			}
			public void keyReleased(KeyEvent e) {}
			public void keyTyped(KeyEvent e) {}
		});
		number1JText.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {}
			public void mouseEntered(MouseEvent arg0) {
				if(number1JText.getText().equals("0")) {
					number1JText.setText("");
				}
			}
			public void mouseExited(MouseEvent arg0) {}
			public void mousePressed(MouseEvent arg0) {}
			public void mouseReleased(MouseEvent arg0) {}
		});
		number1JText.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		number1JText.setBounds(70, 11, 96, 30);
		contentPane.add(number1JText);
		number1JText.setColumns(10);

		//Zahl2 ----------------------------------------------------
		number2JText = new JTextField();
		number2JText.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				char caracter = e.getKeyChar();
				if (((caracter < '0') || (caracter > '9')) && (caracter != '\b') && (caracter != '.') && (caracter != ',')) {
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

		number2JText.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {}
			public void mouseEntered(MouseEvent arg0) {
				if(number2JText.getText().equals("0")) {
					number2JText.setText("");
				}
			}
			public void mouseExited(MouseEvent arg0) {}
			public void mousePressed(MouseEvent arg0) {}
			public void mouseReleased(MouseEvent arg0) {}
		});
		number2JText.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		number2JText.setColumns(10);
		number2JText.setBounds(70, 52, 96, 30);
		contentPane.add(number2JText);

		//Addieren --------------------------------------------------
		add = new JButton("+");
		add.setToolTipText("Addieren der Zahlen 1 und 2");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setFields();
				if (checkInput()) {
					double result = Double.parseDouble(number1JText.getText().trim().replace(',', '.')) + Double.parseDouble(number2JText.getText().trim().replace(',', '.'));
					setResult(result);
				}
			}
		});
		add.setBounds(176, 11, 50, 30);
		contentPane.add(add);

		//Subtrahieren ----------------------------------------------
		sub = new JButton("-");
		sub.setToolTipText("Subtrahieren der Zahlen 1 und 2");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setFields();
				if (checkInput()) {
					double result = Double.parseDouble(number1JText.getText().trim().replace(',', '.')) - Double.parseDouble(number2JText.getText().trim().replace(',', '.'));
					setResult(result);
				}
			}
		});
		sub.setBounds(236, 11, 50, 30);
		contentPane.add(sub);

		//Multiplizieren --------------------------------------------
		mult = new JButton("*");
		mult.setToolTipText("Multiplizieren der Zahlen 1 und 2");
		mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setFields();
				if (checkInput()) {
					double result = Double.parseDouble(number1JText.getText().trim().replace(',', '.')) * Double.parseDouble(number2JText.getText().trim().replace(',', '.'));
					setResult(result);
				}
			}
		});
		mult.setBounds(176, 52, 50, 30);
		contentPane.add(mult);

		//Dividieren ------------------------------------------------
		div = new JButton("/");
		div.setToolTipText("Dividieren der Zahlen 1 und 2");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setFields();
				if (checkInput()) {
					double result = Double.parseDouble(number1JText.getText().trim().replace(',', '.'))
							/ Double.parseDouble(number2JText.getText().trim().replace(',', '.'));
					setResult(result);
				}
			}
		});
		div.setBounds(236, 52, 50, 30);
		contentPane.add(div);

		//Wurzel ---------------------------------------------------
		sqrt = new JButton("\u221A");
		sqrt.setToolTipText("Wurzel aus Zahl1");
		sqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setFields();
				if (checkInput()) {
					double result = Math.sqrt(Double.parseDouble(number1JText.getText().trim().replace(',', '.')));
					number2JText.setText("0");
					setResult(result);
				}
			}
		});
		sqrt.setBounds(176, 93, 50, 30);
		contentPane.add(sqrt);

		//Potenzieren ----------------------------------------------
		pow2 = new JButton("x\u00B2");
		pow2.setToolTipText("Zahl1 quadrieren");
		pow2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setFields();
				if (checkInput()) {
					double result = Math.pow(Double.parseDouble(number1JText.getText().trim().replace(',', '.')),
							2);
					setResult(result);
				}
			}
		});
		pow2.setBounds(236, 93, 50, 30);
		contentPane.add(pow2);

		powX = new JButton("x*");
		powX.setToolTipText("Quadriert Zahl1 mit dem Wert von Zahl2");
		powX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setFields();
				if (checkInput()) {
					double result = Math.pow(Double.parseDouble(number1JText.getText().trim().replace(',', '.')), Double.parseDouble(number2JText.getText().trim().replace(',', '.')));
					setResult(result);
				}
			}
		});
		powX.setBounds(236, 135, 50, 30);
		contentPane.add(powX);

		ans = new JButton("Ans");
		ans.setFont(new Font("Tahoma", Font.PLAIN, 9));
		ans.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ansResult > 0) {
					if(ansResult - (int) ansResult == 0) {
						number1JText.setText(String.valueOf((int)ansResult));
						number2JText.setText("");
					} else {
						number1JText.setText(String.valueOf(ansResult));
						number2JText.setText("");
					}
				}
			}
		});
		ans.setToolTipText("Enth\u00E4lt das Ergebnis der letzen Rechnung");
		ans.setBounds(296, 11, 50, 30);
		contentPane.add(ans);

		//Prozent
		percent = new JButton("%");
		percent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setFields();
				if (checkInput()) {
					double result = (Double.parseDouble(number2JText.getText().trim().replace(',', '.')) / 100) * Double.parseDouble(number1JText.getText().trim().replace(',', '.'));
					setResult(result);
				}
			}
		});
		percent.setToolTipText("(Zahl1)% von Zahl2");
		percent.setBounds(176, 134, 50, 30);
		contentPane.add(percent);

		//Unused
		button_1 = new JButton("");
		button_1.setEnabled(false);
		button_1.setBounds(296, 52, 50, 30);
		contentPane.add(button_1);

		btnMSave = new JButton("M=");
		btnMSave.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnMSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setFields();
				try {
					m = Double.parseDouble(resultJArea.getText());
				} catch (NumberFormatException e) {
					m = 0;
				}

			}
		});
		btnMSave.setToolTipText("Speichert einen Wert in M");
		btnMSave.setBounds(356, 52, 50, 30);
		contentPane.add(btnMSave);

		btnMPrint = new JButton("M");
		btnMPrint.setToolTipText("Gibt den gespeicherten Wert in Zahl 1 ein");
		btnMPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setFields();

				if(m - (int)m == 0) {
					number1JText.setText(String.valueOf((int)m));

				} else {
					number1JText.setText(String.valueOf(m));
				}

			}
		});
		btnMPrint.setBounds(356, 11, 50, 30);
		contentPane.add(btnMPrint);

		//Ergebnis --------------------------------------------------
		resultJArea = new JTextArea();
		resultJArea.setText("0");
		resultJArea.setToolTipText("Ergebnisfeld");
		resultJArea.setWrapStyleWord(true);
		resultJArea.setLineWrap(true);
		resultJArea.setFont(new Font("Tahoma", Font.PLAIN, 16));
		resultJArea.setEditable(false);
		resultJArea.setBounds(10, 91, 156, 72);
		contentPane.add(resultJArea);
		resultJArea.setColumns(10);

		//Neu
		newJButton = new JButton("CE");
		newJButton.setToolTipText("Neue Rechnung beginnen");
		newJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				number1JText.requestFocus();
				number1JText.setText(null);
				number2JText.setText(null);
				resultJArea.setText(null);
			}
		});
		newJButton.setBounds(296, 93, 110, 30);
		contentPane.add(newJButton);

		//Beenden
		exitJButton = new JButton("X");
		exitJButton.setToolTipText("Beendet das Program");
		exitJButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		exitJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		exitJButton.setBounds(296, 135, 110, 30);
		contentPane.add(exitJButton);

		lblNewLabel = new JLabel(" Taschenrechner v1.2 by Darian");
		lblNewLabel.setEnabled(false);
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 9));
		lblNewLabel.setBounds(268, 167, 138, 11);
		contentPane.add(lblNewLabel);
	}

	public void setFields() {
		if(number1JText.getText().equals("")) {
			number1JText.setText("0");
		}

		if(number2JText.getText().equals("")) {
			number2JText.setText("0");
		}
	}

	public void setResult(double number) {
		int numberInt = (int) number;
		String resultInt = String.valueOf(numberInt);
		String resultDouble = String.valueOf(number);
		ansResult = number;

		if(number - (int)number == 0) {
			resultJArea.setText(resultInt);
		} else {
			resultJArea.setText(resultDouble);
		}
	}

	public boolean checkInput() {
		try {
			Double.parseDouble(number1JText.getText());
			Double.parseDouble(number2JText.getText());
			return true;

		} catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Es sind nur nummerische Werte erlaubt!", "Eingabefehler", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}
