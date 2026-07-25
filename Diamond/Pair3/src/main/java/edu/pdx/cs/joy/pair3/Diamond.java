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
    int outerSpace = fromA;
    int innerSpace = 1;


    for (int a = 0; a <= fromA ; a++) {
      System.out.print(' ');
    }
    outerSpace -= 1;
    System.out.println('A');

    for (int i = 66; i <= fromA + 65; i++) {

      char letter = (char)i;
      for (int j = 0; j <= outerSpace; j++){
        System.out.print(' ');
      }
      outerSpace -= 1;
      System.out.print(letter);
      for (int k = 0; k < innerSpace; k++){
        System.out.print(' ');
      }
      innerSpace += 2;
      System.out.println(letter);


    }
  }
}

// +++A
//   B B
//  C   C
// D     D