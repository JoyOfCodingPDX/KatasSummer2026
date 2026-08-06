package edu.pdx.cs.joy.mob;

public class MineField {
    private int rows;
    private int columns;
    private static int[][] grid;

    public MineField(int n, int m) {
        this.rows = n;
        this.columns = m;
        this.grid = new int[n][m];
    }

    public int[][] getMineField() {
        return this.grid;
    }

    public int size() {
        return this.rows * this.columns;
    }

    public void findMines(String [] input) {
        //"*."
        for (int i=0; i<input.length; i++) {
            String input_string = input[i];
            for (int j = 0; j < input[i].length(); j++) {
                if (input[i].charAt(j)=='*') {
                    this.grid[i][j] = 1;
                }
            }
        }
    }

}
