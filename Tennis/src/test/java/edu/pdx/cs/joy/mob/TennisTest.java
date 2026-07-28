package edu.pdx.cs.joy.mob;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TennisTest
{

  @Test
  void canInstantiateKataClass() {
    new Tennis();
  }

  @Test
  void initiallyScoreIsLoveLove() {
    Tennis tennis = new Tennis();
    Tennis.GameScore gamesState = tennis.getScore();
    assertEquals(Tennis.GameScore.PlayerScore.LOVE, gamesState.getPlayerOneScore());
    assertEquals(Tennis.GameScore.PlayerScore.LOVE, gamesState.getPlayerTwoScore());
  }


}
