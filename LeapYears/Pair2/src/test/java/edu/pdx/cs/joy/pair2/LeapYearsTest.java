package edu.pdx.cs.joy.pair2;

import org.junit.jupiter.api.Test;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void isInputANumber() {
    String input = "2";
    Integer intInput = Integer.valueOf(input);
    assert(intInput.equals(2));
  }


  @Test
  void is400aLeapYear()
  {


  }
}
