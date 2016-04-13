package GUI;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

public class Rechner3 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel zahl1Label;
	private JLabel zahl2Label;
	private JTextField zahl1;
	private JTextField zahl2;
	private JButton add;
	private JTextField ergebnis;
	private JButton neu;
	private JButton exit;
	private JButton mult;
	private JButton sub;
	private JButton div;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public Rechner3() {
		setAlwaysOnTop(true);
		setTitle("Taschenrechner");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 210);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		zahl1Label = new JLabel("Zahl 1");
		zahl1Label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		zahl1Label.setHorizontalAlignment(SwingConstants.CENTER);
		zahl1Label.setBounds(10, 11, 70, 30);
		contentPane.add(zahl1Label);

		zahl2Label = new JLabel("Zahl 2");
		zahl2Label.setHorizontalAlignment(SwingConstants.CENTER);
		zahl2Label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		zahl2Label.setBounds(10, 52, 70, 30);
		contentPane.add(zahl2Label);

		//Zahl 1 ---------------------------------------------------
		zahl1 = new JTextField();
        addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (!Character.isDigit(e.getKeyChar()))
                    e.consume();
            }
        });
		zahl1.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(zahl1.getText().equals("0")) {
					zahl1.setText("");
				}
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				if(zahl1.getText().equals("")) {
					zahl1.setText("0");
				}
			}

			@Override
			public void mousePressed(MouseEvent arg0) {}

			@Override
			public void mouseReleased(MouseEvent arg0) {}
		});
		zahl1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		zahl1.setBounds(90, 11, 86, 30);
		contentPane.add(zahl1);
		zahl1.setColumns(10);

		//Zahl2 ----------------------------------------------------
		zahl2 = new JTextField();
		zahl2.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(zahl2.getText().equals("0")) {
					zahl2.setText("");
				}
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				if(zahl2.getText().equals("")) {
					zahl2.setText("0");
				}
			}

			@Override
			public void mousePressed(MouseEvent arg0) {}

			@Override
			public void mouseReleased(MouseEvent arg0) {}
		});
		zahl2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		zahl2.setColumns(10);
		zahl2.setBounds(90, 52, 86, 30);
		contentPane.add(zahl2);

		//Addieren --------------------------------------------------
		add = new JButton("+");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setFields();
				double dErgebnis = Double.parseDouble(zahl1.getText().trim().replace(',', '.')) + Double.parseDouble(zahl2.getText().trim().replace(',', '.'));
				setErgebnis(dErgebnis);
			}
		});
		add.setBounds(186, 11, 50, 30);
		contentPane.add(add);

		//Subtrahieren ----------------------------------------------
		sub = new JButton("-");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setFields();
				double dErgebnis = Double.parseDouble(zahl1.getText().trim().replace(',', '.')) - Double.parseDouble(zahl2.getText().trim().replace(',', '.'));
				setErgebnis(dErgebnis);
			}
		});
		sub.setBounds(246, 11, 50, 30);
		contentPane.add(sub);

		//Multiplizieren --------------------------------------------
		mult = new JButton("*");
		mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setFields();
				double dErgebnis = Double.parseDouble(zahl1.getText().trim().replace(',', '.')) * Double.parseDouble(zahl2.getText().trim().replace(',', '.'));
				setErgebnis(dErgebnis);
			}
		});
		mult.setBounds(186, 52, 50, 30);
		contentPane.add(mult);

		//Dividieren ------------------------------------------------
		div = new JButton("/");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setFields();
				double dErgebnis = Double.parseDouble(zahl1.getText().trim().replace(',', '.')) / Double.parseDouble(zahl2.getText().trim().replace(',', '.'));
				setErgebnis(dErgebnis);
			}
		});
		div.setBounds(246, 52, 50, 30);
		contentPane.add(div);

		//Ergebnis --------------------------------------------------
		ergebnis = new JTextField();
		ergebnis.setHorizontalAlignment(SwingConstants.CENTER);
		ergebnis.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ergebnis.setEditable(false);
		ergebnis.setBounds(20, 93, 156, 72);
		contentPane.add(ergebnis);
		ergebnis.setColumns(10);

		//Neu
		neu = new JButton("Neu");
		neu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				zahl1.setText(null);
				zahl2.setText(null);
				ergebnis.setText(null);
			}
		});
		neu.setBounds(186, 93, 110, 30);
		contentPane.add(neu);

		//Beenden
		exit = new JButton("Beenden");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		exit.setBounds(186, 135, 110, 30);
		contentPane.add(exit);
	}

	public void setFields() {
		if(zahl1.getText().equals("")) {
			zahl1.setText("0");
		}
		
		if(zahl2.getText().equals("")) {
			zahl2.setText("0");
		}
	}

	public void setErgebnis(double number) {
		String str = zahl1.getText(), str2 = zahl2.getText();
		double zahl1 = Double.parseDouble(str.trim().replace(',', '.')), zahl2 = Double.parseDouble(str2.trim().replace(',', '.'));
		int numberInt = (int) number;
		String ergebnisInt = String.valueOf(numberInt);
		String ergebnisDouble = String.valueOf(number);

		if(zahl1 - (int)zahl1 == 0 && zahl2 - (int)zahl2 == 0) {
			ergebnis.setText(ergebnisInt);
		} else {
			ergebnis.setText(ergebnisDouble);
		}
	}

	public void enableOperators() {
		add.setEnabled(true);
		mult.setEnabled(true);
		sub.setEnabled(true);
		div.setEnabled(true);
	}

	public void disableOperators() {
		add.setEnabled(false);
		mult.setEnabled(false);
		sub.setEnabled(false);
		div.setEnabled(false);
	}
}
