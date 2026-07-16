package edu.pdx.cs.joy.pair3;

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
    int fromA = (int)'C' - (int)'A';

    for (int i = 65; i <= fromA + 65; i++) {
      for (int j = fromA +1 ; j <= 0; j-- ) {
        System.out.print(" ");
      }
      char letter = (char)i;
      System.out.println(letter);
    }
  }
}

// +++A
//   B B
//  C   C
// D     D