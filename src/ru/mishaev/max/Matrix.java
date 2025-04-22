package ru.mishaev.max;

import java.util.Random;

public class Matrix {
    private final int SIZE;
    private final int[][] matrix; //= new int[SIZE][SIZE];
    //private final int[][] turnedMatrix; // = new int[SIZE][SIZE];

    public Matrix(int size) {
        if (size >= 3 && size <= 12) {
            SIZE = size;
        } else {
            SIZE = 8;
        }
        matrix = new int[SIZE][SIZE];
        //turnedMatrix = new int[SIZE][SIZE];
    }

    public Matrix() {
        this(8);
    }

    public void FillMatrixRandomNumbers() {
        System.out.println("Заполняем матрицу случайными числами от 0 до 255");
        Random randomizer = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                matrix[i][j] = randomizer.nextInt(256);
            }
        }
    }

//    public void printMatrix(int[][] matrixArray) {
//        for (int i = 0; i < SIZE; i++) {
//            for(int j = 0; j < SIZE; j++) {
//                System.out.printf("%4d ", matrixArray[i][j]);
//            }
//            System.out.print(System.lineSeparator());
//        }
//        System.out.print(System.lineSeparator());
//    }

    public void printMatrix() {
        for (int i = 0; i < SIZE; i++) {
            for(int j = 0; j < SIZE; j++) {
                System.out.printf("%4d ", matrix[i][j]);
            }
            System.out.print(System.lineSeparator());
        }
        System.out.print(System.lineSeparator());
    }

    public Matrix turnMatrixRight(int degrees) {
        System.out.printf("Поворачиваем матрицу на %d градусов\n", degrees);
        Matrix turnedMatrix = new Matrix(SIZE);
        switch (degrees) {
            case 90:
                for (int i = 0; i < SIZE; i++) {
                    for (int j = SIZE - 1; j >= 0; j--) {
                        turnedMatrix.matrix[i][(SIZE - 1) - j] = matrix[j][i];
                    }
                }
                break;
            case 180:
                for (int i = SIZE - 1; i >= 0; i--) {
                    for(int j = SIZE - 1; j >= 0; j--) {
                        turnedMatrix.matrix[(SIZE - 1) - i][(SIZE - 1) - j] = matrix[i][j];
                    }
                }
                break;
            case 270:
                for (int j = SIZE - 1; j >= 0 ; j--) {
                    for (int i = 0; i < SIZE; i++) {
                        turnedMatrix.matrix[(SIZE - 1) - j][i] = matrix[i][j];
                    }
                }
                break;
            default:
                System.out.println("Такой угол поворота не заложен в программу.\nМатрица не изменена.\n");
                for (int i = 0; i < SIZE; i++) {
                    turnedMatrix.matrix[i] = matrix[i].clone();
                }
        }
        return turnedMatrix;
    }

    public int[][] getMatrix() {
        return matrix;
    }

}
