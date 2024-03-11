package com.revsature.matrix;

public class Matrix {
    private int rows;
    private int columns;
    public int[][] elements;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.elements = new int[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setElement(int i, int j, int value) {
        if (i >= 0 && i < rows && j >= 0 && j < columns) {
            elements[i][j] = value;
        } else {
            System.out.println("Invalid position");
        }
    }

    public int getElement(int i, int j) {
        if (i >= 0 && i < rows && j >= 0 && j < columns) {
            return elements[i][j];
        } else {
            System.out.println("Invalid position");
            return 0; // Return default value or handle it differently as per your requirement
        }
    }

    public static Matrix addMatrices(Matrix matrix1, Matrix matrix2) {
        if (matrix1.rows != matrix2.rows || matrix1.columns != matrix2.columns) {
            System.out.println("Matrices cannot be added");
            return null;
        }

        Matrix result = new Matrix(matrix1.rows, matrix1.columns);
        for (int i = 0; i < matrix1.rows; i++) {
            for (int j = 0; j < matrix1.columns; j++) {
                result.setElement(i, j, matrix1.getElement(i, j) + matrix2.getElement(i, j));
            }
        }
        return result;
    }
}
