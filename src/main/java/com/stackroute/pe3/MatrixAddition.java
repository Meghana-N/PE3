package com.stackroute.pe3;

//Write a program to compute the addition of two matrix, Read the number of rows and columns as input, also the values of each matrix

public class MatrixAddition
{
    public Integer[][] addMatrix(Integer row,Integer column,Integer[][] firstMatrix, Integer[][] secondMatrix)
    {
        Integer sum[][] = new Integer[row][column];
        for (int c = 0; c < row; c++)
            for (int d = 0; d < column; d++)
                sum[c][d] = firstMatrix[c][d] + secondMatrix[c][d];

        return sum;
    }
}


