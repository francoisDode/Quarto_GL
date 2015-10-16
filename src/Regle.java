import javax.swing.JDialog;
import javax.swing.JFrame;

public class Regle extends JDialog {
  public Regle(JFrame parent, String title, boolean modal){
    //On appelle le construteur de JDialog correspondant
    super(parent, title, modal);
    //On spécifie une taille
    this.setSize(1024, 780);
    //La position
    this.setLocationRelativeTo(null);
    //La boîte ne devra pas être redimensionnable
    this.setResizable(false);
    //Enfin on l'affiche
    this.setVisible(true);
    //Tout ceci ressemble à ce que nous faisons depuis le début avec notre JFrame.
  }
}