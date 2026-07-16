package edu.pdx.cs.joy.pair1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiamondPrinterTest {

    @Test
    void printsTheLetterADiamond() {
        DiamondPrinter testSetup = new DiamondPrinter("A");
        assertEquals(testSetup.toString() , "A");
    }
    @Test
    void printsTheLetterBDiamond() {
        DiamondPrinter testSetup = new DiamondPrinter("B");


    }

}
