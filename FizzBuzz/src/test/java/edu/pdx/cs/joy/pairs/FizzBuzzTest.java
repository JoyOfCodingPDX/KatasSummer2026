package edu.pdx.cs.joy.pairs;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizzBuzzTest
{

  @Test
  void canInstantiateKataClass() {
    new FizzBuzz();
  }

  @Test
  void isDivisibleBy5() {
    int number = 5;
    assertThat(FizzBuzz.isDivisibleBy5(number), equalTo(true));
  }

  @Test
  void isNotDivisibleBy5() {
    int number = 13;
    assertThat(FizzBuzz.isDivisibleBy5(number), equalTo(false));
  }

}
