package edu.pdx.cs.joy.mob;

import com.google.common.annotations.VisibleForTesting;
import com.sun.jdi.connect.Connector;

import java.util.Stack;

/**
 * A class for getting started with a code kata
 * <p>
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class RPNCalculator {

    @VisibleForTesting
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.print("Missing command line arguments");
            return;
        }
        Stack<Integer> stack = new Stack<>();
        String[] tokens = args[0].split(" ");
        for (String token : tokens) {

            if (token.matches("[+*/-]")) {
                stack.push(calculateResult(stack.pop(), stack.pop(), token));
            } else {
                int number;
               try {
                   number = Integer.parseInt(token);
               }catch (NumberFormatException e){
                   System.err.println("Invalid character: " + token);
                   return;
               }
                stack.push(number);
            }

        }

        System.out.print(stack.pop());
    }

    private static int calculateResult(int a, int b, String operator) {
        switch (operator) {
            case "/":
                return b / a;

            case "*":
                return b*a;
            case "+":
                return b+a;
        }

        throw new IllegalStateException("Incorrect argument types.");
    }

}