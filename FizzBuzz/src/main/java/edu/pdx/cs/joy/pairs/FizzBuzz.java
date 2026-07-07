package edu.pdx.cs.joy.pairs;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class FizzBuzz {

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public static boolean isDivisibleBy5(int number) {
    return number % 5 == 0;
  }

  public static boolean isDivisibleBy3(int number) {
    return number % 3 == 0;
  }

  public static String fizzBuzz(int number) {
    if (isDivisibleBy3(number) && isDivisibleBy5(number)) {
      return "FizzBuzz";

    } else if (isDivisibleBy3(number)) {
      return "Fizz";

    } else if (isDivisibleBy5(number)) {
      return "Buzz";

    } else {
      return String.valueOf(number);
    }
  }
}