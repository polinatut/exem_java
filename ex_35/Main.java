package org.example;

public class Main {
    public static void main(String[] args) {
        double[][] data1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        double[][] data2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        Matrix matrix1 = new Matrix(data1);
        Matrix matrix2 = new Matrix(data2);

        System.out.println("Матрица 1:");
        matrix1.print();

        System.out.println("Матрица 2:");
        matrix2.print();

        System.out.println("Сложение:");
        matrix1.add(matrix2).print();

        System.out.println("Умножение на число:");
        matrix1.multiply(2).print();

        System.out.println("Транспонированная матрица:");
        matrix1.transpose().print();

        System.out.println("Произведение матриц:");
        matrix1.multiply(matrix2).print();

        System.out.println("Матрица 1 в степени 2:");
        matrix1.power(2).print();
    }
}
