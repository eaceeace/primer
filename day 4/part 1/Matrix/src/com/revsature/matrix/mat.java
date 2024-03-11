package com.revsature.matrix;

public class mat {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(1, 2);
        Matrix m2 = new Matrix(1, 2);
        m1.setElement(0, 0, 10);
        m1.setElement(0, 1, 32);
        m2.setElement(0, 0, 88);
        m2.setElement(0, 1, 42);

        Matrix finalMatrix = Matrix.addMatrices(m1, m2);
        if (finalMatrix != null) {
            System.out.println("final Matrix:");
            for (int i = 0; i < finalMatrix.getRows(); i++) {
                for (int j = 0; j < finalMatrix.getColumns(); j++) {
                    System.out.print(finalMatrix.elements[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
