package edu.pdx.cs.joy.mob;

import com.google.common.annotations.VisibleForTesting;
import com.sun.jdi.connect.Connector;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class RPNCalculator {

  @VisibleForTesting
  public static void main(String[] args) {
    if( args.length == 0 ) {
      System.err.print("Missing command line arguments");
    }

    String[] tokens = args[0].split(" ");
    for (int i = 0; i < tokens.length; i++) {
      String token = tokens[i];
      if (token.matches("[+*-/\\d]")) {

      } else {
        System.err.println("Invalid character: " + token);
      }
    }

    System.out.print("0");
  }



}