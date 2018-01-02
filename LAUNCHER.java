import javax.swing.*;
import java.util.*;
import javax.swing.JFrame;

/**
 * Class LAUNCHER
 */
public class LAUNCHER extends JFrame{

  //
  // Fields
  //

  
  //
  // Constructors
  //

  public LAUNCHER (){
    this.setTitle("Chasse au trésor");
    this.setSize(700, 800);
    this.setLocationRelativeTo(null);           //Nous demandons maintenant à notre objet de se positionner au centre
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setContentPane(new FondJeu());     //Affiche le fond du jeu
    this.setContentPane(new Chest());       //Affiche le coffre

    this.setVisible(true);
  }

  
  //
  // Methods
  //


  //
  // Accessor methods
  //


  //
  // Other methods
  //

  /**
   */
  public void main() {
    LAUNCHER fen = new LAUNCHER();
  }


}
