package com.stackroute.pe3;

/*
Write a program to create a ChessBoard pattern with the help of multidimensional array, where WWrepresents white color and BB represents Black color.
 */

import java.util.Scanner;

public class ChessBoard {
    public static void main(String args[])
    {
        int row,column;
        System.out.println("enter the row and column");
        Scanner input =new Scanner(System.in);
        row = input.nextInt();
        column = input.nextInt();
        for(int i = 0 ;i < column;i++) {
            for (int j = 0;j < row;j++)
            {
                   if((i+j) == 0 || (i+j)%2 == 0)
                       System.out.print("WW|");
                   else
                       System.out.print("BB|");
            }
            System.out.print("\n");
        }
    }
}
