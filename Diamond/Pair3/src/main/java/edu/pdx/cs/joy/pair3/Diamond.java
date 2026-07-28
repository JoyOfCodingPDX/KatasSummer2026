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
    int outerSpace= fromA+1;
    //int innerSpace=
    for (int i = 65; i <= fromA + 65; i++) {
      char letter = (char)i;
      System.out.println(letter);
    }
  }
  //for loop from A to arg[0]  => a, b c
}

// +++A
//   B\B
//  C\\\C
// D\\\\\D
//  c\\\c
//   B\B
//    A
//for loop from arg[o]-1 to A => b A