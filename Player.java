
import java.util.*;


/**
 * Class Player
 */
public class Player {

  //
  // Fields
  //

  private String name;
  private int treasureCount;
  private Level currentLevel;
  private int position;
  
  //
  // Constructors
  //
  public Player (String name, Level currentLevel) {
    this.name = name;
    this.treasureCount = 0;
    this.currentLevel=null;
    this.position = 0;
  }
  
  //
  // Methods
  //
  public int delacementUp(){ return position++; }

  public int deplacementDown(){ return position--; }

  public int points(){



  return 0;
  }

  //
  // Accessor methods
  //

  /**
   * Set the value of name
   * @param newVar the new value of name
   */
  private void setName (String newVar) {
    name = newVar;
  }

  /**
   * Get the value of name
   * @return the value of name
   */
  private String getName () {
    return name;
  }

  /**
   * Set the value of treasureCount
   * @param newVar the new value of treasureCount
   */
  private void setTreasureCount (Integer newVar) {
    treasureCount = newVar;
  }

  /**
   * Get the value of treasureCount
   * @return the value of treasureCount
   */
  private int getTreasureCount () {
    return treasureCount;
  }

  /**
   * Set the value of currentLevel
   * @param newVar the new value of currentLevel
   */
  private void setCurrentLevel (Level newVar) {
    currentLevel = newVar;
  }

  /**
   * Get the value of currentLevel
   * @return the value of currentLevel
   */
  private Level getCurrentLevel () {
    return currentLevel;
  }

  //
  // Other methods
  //

  /**
   * @param        game
   */
  public void getNextMove(Game game)
  {
  }


}
