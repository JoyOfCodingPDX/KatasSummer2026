package edu.pdx.cs.joy.pair2;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class LeapYears {

  Integer inputLeapYear = 0;

  public static Integer transformInput(String input)
  {
    return Integer.valueOf(input);
  }

  public static boolean isLeapYear(String input)
  {
    Integer year;
    try {
      year = transformInput(input);
    }
    catch (Exception e) {
      return false;
    }
    if(year % 400 == 0) return true;
    else if (year % 100 == 0) return false;
    else if (year % 4 == 0) return true;
    else return false;
  }

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }







}