package edu.pdx.cs.joy.mob;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Tennis {

  private GameScore score = new GameScore();


  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public GameScore getScore() {
   return this.score;
  }

  public class GameScore {
    enum PlayerScore {LOVE}
    PlayerScore player1 = PlayerScore.LOVE;
    PlayerScore player2 = PlayerScore.LOVE;


    public PlayerScore getPlayerOneScore() {
      return this.player1;
    }
    public PlayerScore getPlayerTwoScore() {
      return this.player2;
    }
  }

}