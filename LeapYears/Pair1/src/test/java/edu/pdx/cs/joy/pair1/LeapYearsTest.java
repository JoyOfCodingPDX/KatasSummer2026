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
    int year = 2000;
    assertThat(LeapYears.isDivisibleBy400(year), equalTo(true));
  }

 @Test
 void isDivisibleBy100Not400(){
    int year=1700;
    assertThat(LeapYears.isDivisibleBy100Not400(year),equalTo(true));
 }
 @Test
  void  isLeap(){
    int year =2026;
    assertThat(LeapYears.isLeap(year),equalTo(false));
 }
}