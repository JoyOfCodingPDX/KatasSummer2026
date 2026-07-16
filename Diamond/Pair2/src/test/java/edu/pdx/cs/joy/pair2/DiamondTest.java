package edu.pdx.cs.joy.pair2;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DiamondTest
{

  @Test
  void canInstantiateDiamondClass() {
    new Diamond();
  }




  @Test
  void isLetterA(){
    String letter = "A";

    assertThat(letter,equalTo("A"));

  }

  @Test
  void isLetterB(){
    String letter = "B";
    String diamond = "";
    assertThat(letter,equalTo("B"));

  }





}
