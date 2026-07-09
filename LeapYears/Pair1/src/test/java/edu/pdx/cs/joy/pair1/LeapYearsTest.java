package edu.pdx.cs.joy.pair1;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void isDivisibleBy400() {
    int year = 400;
    assertThat(LeapYears.isDivisibleBy400(year), equalTo(true));
  }

  @Test
  void isNotDivisibleBy400() {
    int year = 320;
     assertThat(LeapYears.isDivisibleBy400(year), equalTo(false));
  }

  @Test
  void isDivisibleBy4Not100() {
    int year = 16; 
    assertThat(LeapYears.isDivisibleBy4Not100(year), equalTo(true));
  }

  @Test
  void isDivisibleBy4And100() {
    int year = 400;
    assertThat(LeapYears.isDivisibleBy4Not100(year), equalTo(false));
  }

}
