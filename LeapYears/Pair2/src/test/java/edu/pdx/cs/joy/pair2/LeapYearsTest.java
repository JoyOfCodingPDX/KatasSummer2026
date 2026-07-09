package edu.pdx.cs.joy.pair2;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void isInputANumber() {
    String input = "2";
    Integer intInput = LeapYears.transformInput(input);
    assertThat(intInput, equalTo(2));
  }


  @Test
  void is400aLeapYear()
  {
    String input = "400";
    assertThat(LeapYears.isLeapYear(input), equalTo(true));
  }
  @Test
  void isDivisibleBy4AndNot100()
  {
    String input = "24";
    assertThat(LeapYears.isLeapYear(input), equalTo(true));
  }

  @Test
  void isDivisibleBy100Not400()
  {
    String input = "300";
    assertThat(LeapYears.isLeapYear(input), equalTo(false));
  }

  @Test
  void isNotDivisibleBy4 ()
  {
    String input = "7";
    assertThat(LeapYears.isLeapYear(input), equalTo(false));
  }

  @Test
  void negativesAreValid ()
  {
    String input = "-400";
    assertThat(LeapYears.isLeapYear(input), equalTo(true));
  }

  @Test
  void stringNotNumberNotValid ()
  {
    String input = "invalid input";
    assertThat(LeapYears.isLeapYear(input), equalTo(false));
  }

}
