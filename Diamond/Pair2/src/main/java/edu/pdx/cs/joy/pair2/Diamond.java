package edu.pdx.cs.joy.pair2;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Diamond {

  @VisibleForTesting
  public static void main(String[] args) {
    // System.err.println("Missing command line arguments");
    String letterA = "A";
    String letterB = "B";
    String letter = "C";

    String letters = "A B C D E";

    String [] alphabet = letters.split(" ");

    if (alphabet.equals("A")) {
      System.out.println("    A");
    }
    else if (alphabet.equals("B")) {
      System.out.println("A");
      System.out.println("B B");
      System.out.println("A");
    }
    else {
      for(int i = 0; i < alphabet.length; i++) {
        if(i == 0 )
        {
        System.out.println(" " + alphabet[i]);

          //System.out.println(alphabet[i]);
      }else if(i == 1)
        {
          System.out.println(alphabet[i] + " " + alphabet[i]+ '\n');
        }
      }
      
    }

  }




}