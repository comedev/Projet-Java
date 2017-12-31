import java.util.List;
import java.util.*;


/**
 * Class Game
 */
public class Game {

  //
  // Fields
  //

  private int oxygen;
  private List<Player> players;
  
  //
  // Constructors
  //
  public Game (List<Player> players) {
    this.oxygen=0;
    this.players=null;
  };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of oxygen
   * @param newVar the new value of oxygen
   */
  private void setOxygen (int newVar) {
    oxygen = newVar;
  }

  /**
   * Get the value of oxygen
   * @return the value of oxygen
   */
  private int getOxygen () {
    return oxygen;
  }

  /**
   * Set the value of playerrs
   * @param newVar the new value of playerrs
   */
  private void setPlayerrs (List<Player> newVar) { players = newVar; }

  /**
   * Get the value of playerrs
   * @return the value of playerrs
   */
  private List<Player> getPlayerrs () {return players;}


  //
  // Other methods
  //

  /**
   */
  public void playTurn()
  {
  }


  /**
   * @param        playerCount_integer
   */
  public void init(int playerCount_integer) { }


  /**
   */
  public void calculateScore()
  {
  }


  /**
   */
  public void launchGame()
  {
  }


}
