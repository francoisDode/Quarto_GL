import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Font;


public class Acceuil extends JFrame {

	private JPanel contentPane;
	private Dialog fenetreDial = new Dialog (this,"Regles"); 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Acceuil frame = new Acceuil();
					
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
	public Acceuil() {
		
		this.setTitle("Quarto");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 592, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout());
		
		JLabel titre = new JLabel("QUARTO ADVANCED");
		contentPane.add(titre, BorderLayout.NORTH);
		
		JPanel choix = new JPanel(new GridLayout(0,3));
		
		
	    Box b4 = Box.createVerticalBox();
	    JButton regle = new JButton("Regles");
	    JButton partC = new JButton("Partie Classique");
		b4.add(partC);
		b4.add(new JButton("Partie Aleatoire"));
		b4.add(regle);
		
		
		
		partC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				dispose();
				Fen tram = new Fen();
				tram.setVisible(true);
			}
		});
		
		regle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Regle rules = new Regle (null,"REGLE",true);
			}
		});
		
		Box b3 = Box.createHorizontalBox();
		b3.add(b4);
		contentPane.add(b4,BorderLayout.CENTER);
	}
}