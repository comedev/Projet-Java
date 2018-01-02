
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.*;


/**
 * Class Chest
 */
public class Chest extends JPanel {

  //
  // Fields
  //

  private integer treasureCount;

  
  //
  // Constructors
  //
  public Chest (integer treasureCount) {
    this.treasureCount = null;
  }


  
  //
  // Methods
  //

  public int positionChest(){
    Random rand = new Random();
    int coordinateChest = rand.nextInt(800 - 1);

    return coordinateChest;
  }


  public void paintComponent(Graphics g, int coordinateChest) {
    super.paintComponent(g);
    try {
      Image coffre = ImageIO.read(new File("Coffre.png"));

      g.drawImage(coffre, 0, coordinateChest, getWidth(), getHeight(), this);     //Initialisation pour l'affichage du coffre

    } catch (IOException e){
      e.printStackTrace();
    }
    setPreferredSize(new Dimension(100, 100));

  }




  //
  // Accessor methods
  //

  /**
   * Set the value of treasureCount
   * @param newVar the new value of treasureCount
   */
  private void setTreasureCount (integer newVar) {
    treasureCount = newVar;
  }

  /**
   * Get the value of treasureCount
   * @return the value of treasureCount
   */
  private integer getTreasureCount () {
    return treasureCount;
  }

  //
  // Other methods
  //

  /**
   * @param        player
   */
  public void openChestPlayer(Player player)
  {
  }


}
