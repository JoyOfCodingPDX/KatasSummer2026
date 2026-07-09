package edu.pdx.cs.joy.pair1;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.equalTo;


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

}
