
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.util.List;


/**
 * Class Cave
 */
public class Cave {

  //
  // Fields
  //

  private List<Level> levels;
  
  //
  // Constructors
  //
  public Cave (List<Level> levels) {
    this.levels=null;
  };


  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of levels
   * @param newVar the new value of levels
   */
  private void setLevels (List<Level> newVar) {levels = newVar;}

  /**
   * Get the value of levels
   * @return the value of levels
   */
  private List<Level> getLevels () {return levels;}

  //
  // Other methods
  //

}
