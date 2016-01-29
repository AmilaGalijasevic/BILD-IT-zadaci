package MiniProjekat_2;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class CrapsGame {

	private JFrame frame;
	private JTextField rolled1;
	private JTextField rolled2;
	private JTextField result;
	private JTextField point;
	private final Action action = new SwingAction();
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private final Action action_1 = new SwingAction_1();
	private final Action action_2 = new SwingAction_2();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrapsGame window = new CrapsGame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CrapsGame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(0, 0, 0));
		frame.getContentPane().setBackground(new Color(0, 102, 0));
		frame.setBounds(100, 100, 656, 506);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		// start button adjustments
		JButton startButton = new JButton("START");
		startButton.setAction(action);
		startButton.setBackground(new Color(255, 0, 0));
		startButton.setFont(new Font("Mongolian Baiti", Font.BOLD, 23));
		startButton.setBounds(258, 83, 124, 34);
		frame.getContentPane().add(startButton);
		// continue button adjustments
		JButton continueButton = new JButton("CONTINUE");
		continueButton.setAction(action_1);
		continueButton.setFont(new Font("Mongolian Baiti", Font.BOLD, 16));
		continueButton.setBackground(new Color(255, 0, 0));
		continueButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			}
		});
		continueButton.setBounds(237, 242, 169, 34);
		frame.getContentPane().add(continueButton);
		// end button adjustments
		JButton endButton = new JButton("END");
		endButton.setAction(action_2);
		endButton.setFont(new Font("Mongolian Baiti", Font.BOLD, 23));
		endButton.setBackground(new Color(255, 0, 0));
		endButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// exits the game when the button is pressed
				System.exit(1);
			}
		});
		endButton.setBounds(258, 422, 124, 34);
		frame.getContentPane().add(endButton);
		// adjustments for first text field
		rolled1 = new JTextField();
		rolled1.setEditable(false);
		rolled1.setFont(new Font("Times New Roman", Font.BOLD, 23));
		rolled1.setHorizontalAlignment(SwingConstants.CENTER);
		rolled1.setBounds(187, 155, 271, 34);
		frame.getContentPane().add(rolled1);
		rolled1.setColumns(10);
		// adjustments for second text field
		rolled2 = new JTextField();
		rolled2.setEditable(false);
		rolled2.setFont(new Font("Times New Roman", Font.BOLD, 23));
		rolled2.setHorizontalAlignment(SwingConstants.CENTER);
		rolled2.setBounds(187, 309, 271, 34);
		frame.getContentPane().add(rolled2);
		rolled2.setColumns(10);
		// adjustments for result text field
		result = new JTextField();
		result.setEditable(false);
		result.setFont(new Font("Times New Roman", Font.BOLD, 30));
		result.setHorizontalAlignment(SwingConstants.CENTER);
		result.setBounds(242, 354, 157, 57);
		frame.getContentPane().add(result);
		result.setColumns(10);
		// adjustments for headline
		JLabel lblCraps = new JLabel("Craps");
		lblCraps.setForeground(new Color(255, 0, 0));
		lblCraps.setFont(new Font("Segoe Script", Font.BOLD, 45));
		lblCraps.setHorizontalAlignment(SwingConstants.CENTER);
		lblCraps.setBounds(187, 11, 244, 74);
		frame.getContentPane().add(lblCraps);
		// adjustments for point text field
		point = new JTextField();
		point.setEditable(false);
		point.setHorizontalAlignment(SwingConstants.CENTER);
		point.setFont(new Font("Times New Roman", Font.BOLD, 15));
		point.setBounds(258, 200, 124, 31);
		frame.getContentPane().add(point);
		point.setColumns(10);
		// adjustments for first label
		lblNewLabel = new JLabel("You rolled:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Gabriola", Font.BOLD, 19));
		lblNewLabel.setBounds(258, 128, 124, 31);
		frame.getContentPane().add(lblNewLabel);
		// adjustments for second label
		lblNewLabel_1 = new JLabel("You rolled:");
		lblNewLabel_1.setFont(new Font("Gabriola", Font.BOLD, 19));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(258, 287, 124, 14);
		frame.getContentPane().add(lblNewLabel_1);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "START");
			putValue(SHORT_DESCRIPTION, "Starts game");
		}

		public void actionPerformed(ActionEvent e) {
			// initializes the variables;
			int k1, k2, sum;
			// random numbers representing dice numbers
			k1 = (1 + (int) (Math.random() * 6));
			k2 = (1 + (int) (Math.random() * 6));
			// calculating sum
			sum = k1 + k2;
			// point numbers
			int[] points = { 4, 5, 6, 8, 9, 10 };

			for (int i = 0; i < points.length; i++) {
				// sets text for first text field
				rolled1.setText(" " + k1 + "     &    " + k2);
				// empties the other fields
				rolled2.setText(null);
				result.setText(null);
				// if the sum of numbers is 7 or 11 game is won
				if (sum == 7 || sum == 11) {
					// sets result text field
					result.setText("You win!");
					// gives the value of sum to point field
					point.setText(String.valueOf(sum));
					// disables the continue button
					action_1.setEnabled(false);
					// if sum is equal to these numbers
				} else if (sum == 2 || sum == 3 || sum == 12) {
					// sets result field
					result.setText("You lose!");
					// disables continue button
					action_1.setEnabled(false);
					// other numbers are point
				} else {
					// sets result field
					result.setText("Point");
					// enables the continue button
					action_1.setEnabled(true);
					// disables the start button
					action.setEnabled(false);//

				}
			}
			// sets point value to sum so i can use it for comparison
			point.setText(String.valueOf(sum));
		}
	}

	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "CONTINUE");
			putValue(SHORT_DESCRIPTION, "Rolles the dice again");
		}

		public void actionPerformed(ActionEvent ey) {
			// new numbers for second roll
			int k1, k2, sum;
			k1 = (1 + (int) (Math.random() * 6));
			k2 = (1 + (int) (Math.random() * 6));
			rolled2.setText(" " + k1 + "     &    " + k2);
			sum = k1 + k2;
			int[] points = { 4, 5, 6, 8, 9, 10 };
			// enables the start button so the game can continue
			action.setEnabled(true);

			for (int i = 0; i < points.length; i++) {
				// if sum is equal to the sum of first roll the game is won
				if (sum == Integer.parseInt(point.getText())) {
					// disables the second button so it couldn't roll the dices
					// again
					action_1.setEnabled(false);
					result.setText("You win!");
				}else if(sum == 7){
					result.setText("You lose!");
					action_1.setEnabled(false);
				}
				else {
					// disable the second button
					action_1.setEnabled(true);
					result.setText(null);
					
				}
			}
		}
	}

	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "END");
			putValue(SHORT_DESCRIPTION, "Ends game");
		}

		public void actionPerformed(ActionEvent e) {

		}
	}
}
