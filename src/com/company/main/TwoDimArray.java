package com.company.main;


public class TwoDimArray {
    public static void main(String[] args) {
        int DiagonalSum = 0;

        int[][] matrix = new int[10][10];

        for (int i = 0; i < matrix.length; i++) {

          matrix[i][i] = i;

            DiagonalSum += i;

        }
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix.length; j++) {

                System.out.print(matrix[i][j]);

            }
            System.out.println();

        }
        System.out.println("Total: " + DiagonalSum);
    }
}
