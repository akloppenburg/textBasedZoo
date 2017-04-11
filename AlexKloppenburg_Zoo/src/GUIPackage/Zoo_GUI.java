package GUIPackage;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.Font;

public class Zoo_GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Zoo_GUI window = new Zoo_GUI();
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
	public Zoo_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 750, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Integer[] spinnerNums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		SpinnerListModel menuChoices = new SpinnerListModel(spinnerNums);
		JSpinner spinner = new JSpinner(menuChoices);
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 26));
		spinner.setBounds(365, 79, 37, 54);
		frame.getContentPane().add(spinner);
		
		JLabel lblWalkForward = new JLabel("1. Walk forwards to the next exhibit.");
		lblWalkForward.setBounds(10, 10, 232, 22);
		frame.getContentPane().add(lblWalkForward);
		
		JLabel lblWalkBackwards = new JLabel("2. Walk backwards to the next exhibit.");
		lblWalkBackwards.setBounds(10, 32, 232, 22);
		frame.getContentPane().add(lblWalkBackwards);
		
		JLabel lblWalkLeft = new JLabel("3. Walk left to the next exhibit.");
		lblWalkLeft.setBounds(10, 54, 232, 22);
		frame.getContentPane().add(lblWalkLeft);
		
		JLabel lblWalkRight = new JLabel("4. Walk right to the next exhibit.");
		lblWalkRight.setBounds(10, 76, 232, 22);
		frame.getContentPane().add(lblWalkRight);
		
		JLabel lblObserve = new JLabel("5. Read the plaque describing the exhibit next to you.");
		lblObserve.setBounds(10, 98, 232, 22);
		frame.getContentPane().add(lblObserve);
		
		JLabel lblTaunt = new JLabel("6. Taunt the animal in the exhibit next to you.");
		lblTaunt.setBounds(10, 120, 232, 22);
		frame.getContentPane().add(lblTaunt);
		
		JLabel lblMap = new JLabel("7. View your map of the zoo.");
		lblMap.setBounds(10, 142, 232, 22);
		frame.getContentPane().add(lblMap);
		
		JLabel lblQuotePoem = new JLabel("8. Quote poetry, like an English major.");
		lblQuotePoem.setBounds(10, 164, 232, 22);
		frame.getContentPane().add(lblQuotePoem);
		
		JLabel lblNewLabel = new JLabel("9. Leave the zoo.");
		lblNewLabel.setBounds(10, 186, 232, 22);
		frame.getContentPane().add(lblNewLabel);
	}
}
