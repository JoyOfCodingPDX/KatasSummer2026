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

    int result = 0
    String[] tokens = args[0].split(" ");
    for (int i = 0; i < tokens.length; i++) {
      String token = tokens[i];
      if (token.matches("[+*-/\\d]")) {
        switch (tokens[i]) {
          case "/":
            result = result + calculateResult(0,0, token);
            break;

          /*case "+":
            break;
          case "-":
            break;
          case */


        }
            
      } else {
        System.err.println("Invalid character: " + token);
      }
    }

    System.out.print("0");
  }

  private static int calculateResult( int a, int b, String operator) {
    switch (operator) {
      case "/":
        return a/b;
    }

    throw new IllegalStateException("Incorrect argument types.");
  }

}