import java.util.List;
import java.util.*;


/**
 * Class Level
 */
public class Level {

  //
  // Fields
  //

  private List<Chest> chests;
  private List<Player> players;
  
  //
  // Constructors
  //
  public Level (List<Chest> chests, List<Player> players) {
    this.chests=null;
    this.players=null;
  };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of chests
   * @param newVar the new value of chests
   */
  private void setChests (List<Chest> newVar) {chests = newVar;}

  /**
   * Get the value of chests
   * @return the value of chests
   */
  private List<Chest> getChests () {return chests;}

  /**
   * Set the value of players
   * @param newVar the new value of players
   */
  private void setPlayers (List<Player> newVar) {players = newVar;}

  /**
   * Get the value of players
   * @return the value of players
   */
  private List<Player> getPlayers () { return players;}

  //
  // Other methods
  //

}
