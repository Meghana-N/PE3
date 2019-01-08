package main.java;

import java.util.Scanner;

public class MatrixAddition
{
    public int[][] addMatrix(int row,int column,int[][] first, int[][] second)
    {
        int sum[][] = new int[row][column];

        for (int c = 0; c < row; c++)
            for (int d = 0; d < column; d++)
                sum[c][d] = first[c][d] + second[c][d];

        return sum;
    }
}


