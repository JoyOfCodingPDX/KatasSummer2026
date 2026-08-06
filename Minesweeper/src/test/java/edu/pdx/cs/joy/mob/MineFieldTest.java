package edu.pdx.cs.joy.mob;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MineFieldTest {

    @Test
    void sweepTest() {
        MineField field = new MineField(4, 4);
        assertEquals(field.size(), 16);
    }

    @Test
    void initializeTest() {
        MineField field = new MineField(2, 2);
        assertThat(new int[2][2], equalTo(field.getMineField()));
    }

}
