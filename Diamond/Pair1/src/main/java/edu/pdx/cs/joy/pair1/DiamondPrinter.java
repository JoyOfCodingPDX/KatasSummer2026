package edu.pdx.cs.joy.pair1;

public class DiamondPrinter {
    String diamond;

    public DiamondPrinter(String Letter) {
        this.diamond = Letter;
    }

    public String toString() {
        String diamondString = "";
        int numSpaces = 0;
        char ch = this.diamond.charAt(0);
        int asciiValue = (int) ch - 64;

        numSpaces = asciiValue - 1;
        for (int i = 0; i < asciiValue; i++) {
            if (i == 0) {
                diamondString = " ".repeat(numSpaces) + ch + " ".repeat(numSpaces);
            }
        }

        return this.diamond;
    }
}
