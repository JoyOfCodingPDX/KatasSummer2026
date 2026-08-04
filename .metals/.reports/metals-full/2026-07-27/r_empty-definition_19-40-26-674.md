error id: file:///C:/Users/adamm/Desktop/PSU/Summer2026/CS510%20Joys%20of%20Coding%20Class%20Project/KatasSummer2026/Tennis/src/test/java/edu/pdx/cs/joy/mob/TennisTest.java:_empty_/GameScore#getPlayerOneScore#
file:///C:/Users/adamm/Desktop/PSU/Summer2026/CS510%20Joys%20of%20Coding%20Class%20Project/KatasSummer2026/Tennis/src/test/java/edu/pdx/cs/joy/mob/TennisTest.java
empty definition using pc, found symbol in pc: _empty_/GameScore#getPlayerOneScore#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 351
uri: file:///C:/Users/adamm/Desktop/PSU/Summer2026/CS510%20Joys%20of%20Coding%20Class%20Project/KatasSummer2026/Tennis/src/test/java/edu/pdx/cs/joy/mob/TennisTest.java
text:
```scala
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
    assertEquals(PlayerScore.LOVE, gamesState.getPlay@@erOneScore());
  }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/GameScore#getPlayerOneScore#