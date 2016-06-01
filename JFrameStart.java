import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Font;


public class JFrameStart extends JFrame {

	private JPanel contentPane;
	private static JButton button1;
	private static JButton button2;
	private static JButton button3;
	private static JButton button4;
	private static JButton button5;
	private static JButton button6;
	private static JButton button7;
	private static JButton button8;
	private static JButton button9;
	private static JButton buttonReset;
	private static JLabel labelPlayer;
	private static JTextField textFieldPlayer;

	private static boolean player = false;

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
		setTitle("Tic Tac Toe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 208, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		button1 = new JButton("");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doTurn(button1);

			}
		});
		button1.setBounds(10, 11, 50, 50);
		contentPane.add(button1);

		button2 = new JButton("");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doTurn(button2);

			}
		});
		button2.setBounds(70, 11, 50, 50);
		contentPane.add(button2);

		button3 = new JButton("");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doTurn(button3);

			}
		});
		button3.setBounds(130, 11, 50, 50);
		contentPane.add(button3);

		button4 = new JButton("");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doTurn(button4);

			}
		});
		button4.setBounds(10, 72, 50, 50);
		contentPane.add(button4);

		button5 = new JButton("");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doTurn(button5);

			}
		});
		button5.setBounds(70, 72, 50, 50);
		contentPane.add(button5);

		button6 = new JButton("");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doTurn(button6);

			}
		});
		button6.setBounds(130, 72, 50, 50);
		contentPane.add(button6);

		button7 = new JButton("");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doTurn(button7);

			}
		});
		button7.setBounds(10, 133, 50, 50);
		contentPane.add(button7);

		button8 = new JButton("");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doTurn(button8);

			}
		});
		button8.setBounds(70, 133, 50, 50);
		contentPane.add(button8);

		button9 = new JButton("");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doTurn(button9);

			}
		});
		button9.setBounds(130, 133, 50, 50);
		contentPane.add(button9);

		buttonReset = new JButton("Reset");
		buttonReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		buttonReset.setBounds(10, 228, 170, 23);
		contentPane.add(buttonReset);

		labelPlayer = new JLabel("Spieler:");
		labelPlayer.setBounds(14, 194, 46, 23);
		contentPane.add(labelPlayer);

		textFieldPlayer = new JTextField();
		textFieldPlayer.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldPlayer.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPlayer.setText("X");
		textFieldPlayer.setEditable(false);
		textFieldPlayer.setBounds(70, 194, 110, 23);
		contentPane.add(textFieldPlayer);
		textFieldPlayer.setColumns(10);
	}

	private static void reset() {
		button1.setEnabled(true);
		button2.setEnabled(true);
		button3.setEnabled(true);
		button4.setEnabled(true);
		button5.setEnabled(true);
		button6.setEnabled(true);
		button7.setEnabled(true);
		button8.setEnabled(true);
		button9.setEnabled(true);

		player = false;

		button1.setText("");
		button2.setText("");
		button3.setText("");
		button4.setText("");
		button5.setText("");
		button6.setText("");
		button7.setText("");
		button8.setText("");
		button9.setText("");

		textFieldPlayer.setText("X");

		button1.setBackground(null);
		button2.setBackground(null);
		button3.setBackground(null);
		button4.setBackground(null);
		button5.setBackground(null);
		button6.setBackground(null);
		button7.setBackground(null);
		button8.setBackground(null);
		button9.setBackground(null);
	}

	private static void disableButtons() {
		button1.setEnabled(false);
		button2.setEnabled(false);
		button3.setEnabled(false);
		button4.setEnabled(false);
		button5.setEnabled(false);
		button6.setEnabled(false);
		button7.setEnabled(false);
		button8.setEnabled(false);
		button9.setEnabled(false);

	}

	private static void check() {
		/* Horizontal */
		if (!button1.isEnabled() && !button2.isEnabled() && !button3.isEnabled()) {
			String type = button1.getText();

			if (button2.getText().equals(type) && button3.getText().equals(type) && !type.equalsIgnoreCase("")) {
				button1.setBackground(Color.green);
				button2.setBackground(Color.green);
				button3.setBackground(Color.green);
				
				disableButtons();
			}

		}

		if (!button4.isEnabled() && !button5.isEnabled() && !button6.isEnabled()) {
			String type = button4.getText();

			if (button5.getText().equals(type) && button6.getText().equals(type) && !type.equalsIgnoreCase("")) {
				button4.setBackground(Color.green);
				button5.setBackground(Color.green);
				button6.setBackground(Color.green);

				disableButtons();
			}
		}

		if (!button7.isEnabled() && !button8.isEnabled() && !button9.isEnabled()) {
			String type = button7.getText();

			if (button8.getText().equals(type) && button9.getText().equals(type) && !type.equalsIgnoreCase("")) {
				button7.setBackground(Color.green);
				button8.setBackground(Color.green);
				button9.setBackground(Color.green);

				disableButtons();
			}
		}

		/* Vertical */
		if (!button1.isEnabled() && !button4.isEnabled() && !button7.isEnabled()) {
			String type = button1.getText();

			if (button4.getText().equals(type) && button7.getText().equals(type) && !type.equalsIgnoreCase("")) {
				button1.setBackground(Color.green);
				button4.setBackground(Color.green);
				button7.setBackground(Color.green);

				disableButtons();
			}
		}

		if (!button2.isEnabled() && !button5.isEnabled() && !button8.isEnabled()) {
			String type = button2.getText();

			if (button5.getText().equals(type) && button8.getText().equals(type) && !type.equalsIgnoreCase("")) {
				button2.setBackground(Color.green);
				button5.setBackground(Color.green);
				button8.setBackground(Color.green);

				disableButtons();
			}
		}

		if (!button3.isEnabled() && !button6.isEnabled() && !button9.isEnabled()) {
			String type = button3.getText();

			if (button6.getText().equals(type) && button9.getText().equals(type) && !type.equalsIgnoreCase("")) {
				button3.setBackground(Color.green);
				button6.setBackground(Color.green);
				button9.setBackground(Color.green);

				disableButtons();
			}
		}

		/* Diagonal */
		if (!button1.isEnabled() && !button5.isEnabled() && !button9.isEnabled()) {
			String type = button1.getText();

			if (button5.getText().equals(type) && button9.getText().equals(type) && !type.equalsIgnoreCase("")) {
				button1.setBackground(Color.green);
				button5.setBackground(Color.green);
				button9.setBackground(Color.green);

				disableButtons();
			}
		}

		if (!button3.isEnabled() && !button5.isEnabled() && !button7.isEnabled()) {
			String type = button3.getText();

			if (button5.getText().equals(type) && button7.getText().equals(type) && !type.equalsIgnoreCase("")) {
				button3.setBackground(Color.green);
				button5.setBackground(Color.green);
				button7.setBackground(Color.green);

				disableButtons();
			}
		}
	}

	private static void doTurn(JButton button) {		
		if (player) {
			button.setText("O");
			button.setEnabled(false);

			player = false;
			textFieldPlayer.setText("X");

		} else {
			button.setText("X");
			button.setEnabled(false);

			player = true;
			textFieldPlayer.setText("O");
		}

		check();

	}
}
