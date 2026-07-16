package edu.pdx.cs.joy.pair1;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class LeapYears {

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public static boolean isDivisibleBy400(int number) {
    return number % 400 == 0;
  }

  public static boolean isDivisibleBy4Not100(int number) {
    return (number % 4 == 0) && (number % 100 != 0); 
  }
}