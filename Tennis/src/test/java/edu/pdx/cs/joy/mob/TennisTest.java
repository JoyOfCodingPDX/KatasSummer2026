package edu.pdx.cs.joy.mob;

import org.junit.jupiter.api.Test;

public class TennisTest
{

  @Test
  void canInstantiateKataClass() {
    new Tennis();
  }

  @Test
  void initiallyScoreIsLoveLove() {
    Tennis tennis = new Tennis();
    GameScore gamesState = tennis.getScore();
    assertEquals(PlayerScore.LOVE, gamesState.getPlayerOneScore());
    assertEquals(PlayerScore.LOVE, gamesState.getPlayerTwoScore());
  }
}
