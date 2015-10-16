import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


public class Test extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test frame = new Test();
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
	public Test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 450, 300);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		dim.height -= 30;
		setPreferredSize(dim);
		pack();
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		JLabel label = new JLabel(new ImageIcon("drone.jpg"));
		contentPane.add(label, BorderLayout.CENTER);
		
		JLabel label_1 = new JLabel("Bienvenue :)");
		label_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		label_1.setForeground(Color.BLUE);
		label_1.setToolTipText("");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label_1, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("LET'S GO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				dispose();
				Fen tram = new Fen();
				tram.setVisible(true);
			}
		});
		btnNewButton.setBounds(261, 363, 110, 36);
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
		
	}

}