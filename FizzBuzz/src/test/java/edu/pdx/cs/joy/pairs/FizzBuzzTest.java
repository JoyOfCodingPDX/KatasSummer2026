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

  @Test
  void isDivisibleBy3() {
    int number = 3;
    assertThat(FizzBuzz.isDivisibleBy3(number), equalTo(true));
  }

  @Test
  void isNotDivisibleBy3() {
    int number = 4;
    assertThat(FizzBuzz.isDivisibleBy3(number), equalTo(false));
  }

  @Test
  void fizzBuzzOf3IsFizz() {
    int number = 3;
    assertThat(FizzBuzz.fizzBuzz(number), equalTo("Fizz"));
  }

  @Test
  void fizzBuzzOf5IsBuzz() {
    int number = 5;
    assertThat(FizzBuzz.fizzBuzz(number), equalTo("Buzz"));
  }

  @Test
  void fizzBuzzOf4Is4() {
    int number = 4;
    assertThat(FizzBuzz.fizzBuzz(number), equalTo("4"));
  }

  @Test
  void fizzBuzzOf7Is7() {
    int number = 7;
    assertThat(FizzBuzz.fizzBuzz(number), equalTo("7"));
  }

  @Test
  void fizzBuzzOf6IsFizz() {
    int number = 6;
    assertThat(FizzBuzz.fizzBuzz(number), equalTo("Fizz"));
  }

  @Test
  void fizzBuzzOf10IsBuzz() {
    int number = 10;
    assertThat(FizzBuzz.fizzBuzz(number), equalTo("Buzz"));
  }

  @Test
  void fizzBuzzOf15IsBuzz() {
    int number = 15;
    assertThat(FizzBuzz.fizzBuzz(number), equalTo("FizzBuzz"));
  }

}
