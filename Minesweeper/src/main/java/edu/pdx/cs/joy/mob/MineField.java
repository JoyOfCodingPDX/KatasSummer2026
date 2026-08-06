package edu.pdx.cs.joy.mob;

public class MineField {
    private int rows;
    private int columns;

    public MineField(int n, int m) {
        this.rows = n;
        this.columns = m;
    }

    public int size() {
        return this.rows * this.columns;
    }

}
