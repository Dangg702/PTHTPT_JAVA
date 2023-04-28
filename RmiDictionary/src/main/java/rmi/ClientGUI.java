package rmi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class ClientGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtWord;
	private JTextArea txtMean;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientGUI frame = new ClientGUI();
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
	public ClientGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 816, 655);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titleLbl = new JLabel("My Dictionary");
		titleLbl.setHorizontalAlignment(SwingConstants.CENTER);
		titleLbl.setForeground(new Color(255, 128, 0));
		titleLbl.setBackground(new Color(255, 128, 0));
		titleLbl.setFont(new Font("Tahoma", Font.PLAIN, 38));
		titleLbl.setBounds(258, 38, 311, 66);
		contentPane.add(titleLbl);
		
		JLabel lblWord = new JLabel("Word");
		lblWord.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblWord.setBounds(92, 134, 102, 66);
		contentPane.add(lblWord);
		
		txtWord = new JTextField();
		txtWord.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtWord.setBounds(243, 147, 472, 53);
		contentPane.add(txtWord);
		txtWord.setColumns(10);
		
		JLabel lblMean = new JLabel("Meaning");
		lblMean.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblMean.setBounds(92, 243, 128, 66);
		contentPane.add(lblMean);
		
		txtMean = new JTextArea();
		txtMean.setRows(10);
		txtMean.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtMean.setBounds(243, 243, 481, 213);
		contentPane.add(txtMean);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Registry registry = LocateRegistry.getRegistry("localhost");
					IDict dict = (IDict) registry.lookup("translate");
					
					String word = txtWord.getText();
					String mean = dict.dictENtoVn(word);
					txtMean.setText(mean);
				} catch (Exception e2) {
					e2.printStackTrace();
				}

			}
		});
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnSearch.setBounds(243, 505, 224, 53);
		contentPane.add(btnSearch);

	}
}
