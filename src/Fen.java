
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import javax.swing.JButton;

public class Fen extends JFrame {
	/**
	 * 
	 */
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					Fen frame = new Fen();
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
	public Fen() {
		
		
		setResizable(false);
		
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Utilisateur1\\workspace\\Interface\\procaly.gif"));
		setTitle("NOLAS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1232, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel cam = new JPanel();
		cam.setBounds(10, 11, 800, 600);
		contentPane.add(cam);
		
		JLabel lblHeure = new JLabel("10 : 54");
		lblHeure.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHeure.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeure.setBounds(10, 670, 200, 50);
		contentPane.add(lblHeure);
		
		JLabel lblProfondeur = new JLabel("200 mètres");
		lblProfondeur.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblProfondeur.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfondeur.setBounds(216, 670, 200, 50);
		contentPane.add(lblProfondeur);
		
		JPanel vitesse = new JPanel();
		vitesse.setBounds(426, 622, 294, 97);
		contentPane.add(vitesse);
		
		JPanel bousole = new JPanel();
		bousole.setBounds(866, 592, 176, 128);
		contentPane.add(bousole);
		
		JLabel lblChrono = new JLabel("CHRONO");
		lblChrono.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblChrono.setHorizontalAlignment(SwingConstants.CENTER);
		lblChrono.setBounds(1048, 670, 158, 50);
		contentPane.add(lblChrono);
		
		JLabel lblNewLabel = new JLabel("LISTE DES OPTIONS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(866, 11, 340, 50);
		contentPane.add(lblNewLabel);
		
		JToggleButton tglbtnEnregistrement = new JToggleButton("Enregistrement");
		tglbtnEnregistrement.setBounds(960, 72, 137, 41);
		contentPane.add(tglbtnEnregistrement);
		
		JToggleButton tglbtnSonar = new JToggleButton("SONAR");
		tglbtnSonar.setBounds(960, 150, 137, 41);
		contentPane.add(tglbtnSonar);
		
		
		
		JToggleButton tglbtnPleinEcran = new JToggleButton("PLEIN ECRAN");
		tglbtnPleinEcran.setBounds(960, 316, 137, 41);
		contentPane.add(tglbtnPleinEcran);
		
		JToggleButton tglbtnGps = new JToggleButton("GPS");
		tglbtnGps.setBounds(960, 405, 137, 41);
		contentPane.add(tglbtnGps);
		
		JLabel lblNewLabel_1 = new JLabel(new ImageIcon("batt.gif"));
		lblNewLabel_1.setBounds(1129, 11, 77, 47);
		contentPane.add(lblNewLabel_1);
		
		
		
	}
}