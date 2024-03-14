package movie;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tickets {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tickets window = new tickets();
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
	public tickets() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tickets Booking");
		lblNewLabel.setBackground(new Color(192, 192, 192));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel.setBounds(23, 23, 172, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Yu Gothic Medium", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1.setBounds(36, 69, 78, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		tb1 = new JTextField();
		tb1.setBounds(173, 64, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Movie");
		lblNewLabel_2.setFont(new Font("Yu Gothic Medium", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_2.setBounds(36, 100, 70, 29);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Num of Tickets");
		lblNewLabel_3.setFont(new Font("Yu Gothic Medium", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_3.setBounds(23, 140, 140, 26);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Gaami", "Premalu", "Panda"}));
		cb1.setBounds(173, 101, 86, 22);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"Select", "1", "2", "3", "8"}));
		cb2.setBounds(173, 140, 86, 22);
		frame.getContentPane().add(cb2);
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int bill=0;
				String name=tb1.getText();
				String movie=(String) cb1.getSelectedItem();
				String tickets=(String) cb2.getSelectedItem();
				int nt=Integer.parseInt(tickets);
				if(movie.equals("Gaami")) {
					bill=bill+150*nt;
				}
				if(movie.equals("Premalu")) {
					bill=bill+150*nt;
				}
				if(movie.equals("Panda")) {
					bill=bill+200*nt;
				}
				int res=0;
				res=JOptionPane.showConfirmDialog(btnNewButton,"Name: "+name+"\nMovie: "+movie+"\nTickets: "+tickets+"\nAmount: "+bill);
				int YES_Option=0;
				if(res==YES_Option)
				{
					JOptionPane.showMessageDialog(btnNewButton, "Booking Confirmed");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "Booking Canceled");
				}
			}
		});
		btnNewButton.setBackground(new Color(255, 128, 192));
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		btnNewButton.setBounds(115, 187, 106, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBackground(new Color(192, 192, 192));
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\online lab\\Pictures\\wall.jpg"));
		lblNewLabel_4.setBounds(0, 0, 434, 271);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
