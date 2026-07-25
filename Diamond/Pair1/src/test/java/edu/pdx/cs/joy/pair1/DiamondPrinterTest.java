package edu.pdx.cs.joy.pair1;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiamondPrinterTest {

    @Test
    void printsTheLetterADiamond() {
        DiamondPrinter testSetup = new DiamondPrinter("A");
        assertEquals(testSetup.toString() , "A");
    }

    @Disabled
    @Test
    void printsTheLetterBDiamond() {
        DiamondPrinter testSetup = new DiamondPrinter("B");
        assertEquals(testSetup.toString(), " A \nB B\n A ");
    }

}
