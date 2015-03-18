import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class View extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean X = true;
	private boolean b1 = false;
	private boolean b2 = false;
	private boolean b3 = false;
	private boolean b4 = false;
	private boolean b5 = false;
	private boolean b6 = false;
	private boolean b7 = false;
	private boolean b8 = false;
	private boolean b9 = false;
	private JLabel text;
	private JButton[] button = new JButton [9];
	public View(){
		GridLayout layout = new GridLayout(3,3);
		JPanel panel = new JPanel();
		panel.setLayout(layout);
		for(int i = 0; i < 9; i++) {
			button[i] = new JButton();
			button[i].setFont(new Font("Verdana", Font.BOLD, 32));
			panel.add(button[i]);
		}
		button[0].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(X == true && b1 == false) {
					text.setText("Player O");
					b1 = true;
					X = false;
					button[0].setText("X");
				}
				else if(X == false && b1 == false) {
					text.setText("Player X");
					X = true;
					b1 = true;
					button[0].setText("O");
				}
				CheckWinner();
				
			}
		});
		button[1].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(X == true && b2 == false) {
					text.setText("Player O");
					b2 = true;
					X = false;
					button[1].setText("X");
				}
				else if(X == false && b2 == false) {
					text.setText("Player X");
					X = true;
					b2 = true;
					button[1].setText("O");
				}
				CheckWinner();
				
			}
		});
		button[2].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(X == true && b3 == false) {
					text.setText("Player O");
					b3 = true;
					X = false;
					button[2].setText("X");
				}
				else if(X == false && b3 == false) {
					text.setText("Player X");
					X = true;
					b3 = true;
					button[2].setText("O");
				}
				CheckWinner();
			}
		});
		button[3].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(X == true && b4 == false) {
					text.setText("Player O");
					b4 = true;
					X = false;
					button[3].setText("X");
				}
				else if(X == false && b4 == false) {
					text.setText("Player X");
					X = true;
					b4 = true;
					button[3].setText("O");
				}
				CheckWinner();
			}
		});
		button[4].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(X == true && b5 == false) {
					text.setText("Player O");
					b5 = true;
					X = false;
					button[4].setText("X");
				}
				else if(X == false && b5 == false) {
					text.setText("Player X");
					X = true;
					b5 = true;
					button[4].setText("O");
				}
				CheckWinner();
			}
		});
		button[5].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(X == true && b6 == false) {
					text.setText("Player O");
					b6 = true;
					X = false;
					button[5].setText("X");
				}
				else if(X == false && b6 == false) {
					text.setText("Player X");
					X = true;
					b6 = true;
					button[5].setText("O");
				}
				CheckWinner();
			}
		});
		button[6].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(X == true && b7 == false) {
					text.setText("Player O");
					b7 = true;
					X = false;
					button[6].setText("X");
				}
				else if(X == false && b7 == false) {
					text.setText("Player X");
					X = true;
					b7 = true;
					button[6].setText("O");
				}
				CheckWinner();
			}
		});
		button[7].addActionListener(new ActionListener(
				) {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(X == true && b8 == false) {
					text.setText("Player O");
					X = false;
					b8 = true;
					button[7].setText("X");
				}
				else if(X == false && b8 == false) {
					text.setText("Player X");
					X = true;
					b8 = true;
					button[7].setText("O");
				}
				CheckWinner();
			}
		});
		button[8].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(X == true && b9 == false) {
					text.setText("Player O");
					X = false;
					b9 = true;
					button[8].setText("X");
				}
				else if(X == false && b9 == false) {
					text.setText("Player X");
					X = true;
					b9 = true;
					button[8].setText("O");
				}
				CheckWinner();
			}
		});
		panel.setSize(new Dimension(550, 500));
		button[0].setPreferredSize(new Dimension(150, 150));
		FlowLayout lay = new FlowLayout();
		JPanel panel1 = new JPanel();
		panel1.setLayout(lay);
		text = new JLabel();
		text.setText("Player X");
		text.setFont(new Font("Verdana", Font.BOLD, 18));
		text.setForeground(Color.RED);
		text.setPreferredSize(new Dimension(100, 100));
		panel1.add(text);
		add(panel, BorderLayout.NORTH);
		add(panel1, BorderLayout.SOUTH);
		setTitle("Noughts and Crosses");
		setSize(500, 600);
		setResizable(false);
		setVisible(true);
	}
	
	private void CheckWinner() {
		if(button[0].getText() == button[1].getText() && button[1].getText() == button[2].getText() && b1 == true && b2 == true && b3 == true ||
				button[3].getText() == button[4].getText() && button[4].getText() == button[5].getText() && b4 == true && b5 == true && b6 == true ||
				button[6].getText() == button[7].getText() && button[7].getText() == button[8].getText() && b7 == true && b8 == true && b9 == true ||
				button[0].getText() == button[3].getText() && button[3].getText() == button[6].getText() && b1 == true && b4 == true && b7 == true ||
				button[1].getText() == button[4].getText() && button[4].getText() == button[7].getText() && b2 == true && b5 == true && b8 == true ||
				button[2].getText() == button[5].getText() && button[5].getText() == button[8].getText() && b3 == true && b6 == true && b9 == true ||
				button[0].getText() == button[4].getText() && button[4].getText() == button[8].getText() && b1 == true && b5 == true && b9 == true ||
				button[2].getText() == button[4].getText() && button[4].getText() == button[6].getText() && b3 == true && b5 == true && b7 == true
				) {
			if(!X) {
				JOptionPane.showMessageDialog(null, "Winner X");
			}
			else {
				JOptionPane.showMessageDialog(null, "Winner 0");
			}
			for (JButton buttons : button) {
				buttons.setText("");
			}
			X = true;
			b1 = false;
			b2 = false;
			b3 = false;
			b4 = false;
			b5 = false;
			b6 = false;
			b7 = false;
			b8 = false;
			b9 = false;
			text.setText("Player X");

		}
		else if(b1 && b2 && b3 && b4 && b5 && b6 && b7 && b8 && b9) {
			X = true;
			b1 = false;
			b2 = false;
			b3 = false;
			b4 = false;
			b5 = false;
			b6 = false;
			b7 = false;
			b8 = false;
			b9 = false;
			text.setText("Player X");
			JOptionPane.showMessageDialog(null, "There is no winner");
			for (JButton buttons : button) {
				buttons.setText("");
			}
		}
	}
}
