package edu.ntudp.fit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mode = 1;
        List<List<Integer>> matrix = fillMatrix();

        do {
            Scanner s = new Scanner(System.in);
            System.out.println("Select Mode:");
            System.out.println("1. Re-enter matrix");
            System.out.println("2. MIN element");
            System.out.println("3. MAX element");
            System.out.println("4. Average arithmetic value");
            System.out.println("5. Average geometric value");
            System.out.println("6. Exit");
            System.out.println("\nYour choice[1-6]:");
            mode = s.nextInt();
            switch (mode) {
                case 1: {
                    matrix = fillMatrix();
                    break;
                }
                case 2: {
                    System.out.printf("MIN value of matrix: %d \n", findExtreme(matrix, false));
                    break;
                }
                case 3: {
                    System.out.printf("MAX value of matrix: %d \n", findExtreme(matrix, true));
                    break;
                }
                case 4: {
                    System.out.printf("Arithmetic mean of matrix: %f \n", findArithmeticAverage(matrix));
                    break;
                }
                case 5: {
                    System.out.printf("Geometric mean of matrix: %f \n", findGeometricAverage(matrix));
                    break;
                }
                default: {
                    mode = 0;
                }
            }
            System.out.println("\n");
        } while (mode > 0 && mode < 6);
    }

    static double findArithmeticAverage(List<List<Integer>> matrix) {
        double sum = 0;
        double counter = 0;
        for (int i = 0; i < matrix.size(); ++i) {
            List<Integer> row = matrix.get(i);
            for (int j = 0; j < row.size(); ++j) {
                sum += (double) row.get(j);
                counter++;
            }
        }
        return sum/counter;
    }

    static double findGeometricAverage(List<List<Integer>> matrix) {
        double multi = 1;
        double counter = 0;
        for (int i = 0; i < matrix.size(); ++i) {
            List<Integer> row = matrix.get(i);
            for (int j = 0; j < row.size(); ++j) {
                multi *= (double) row.get(j);
                counter++;
            }
        }
        return Math.exp(Math.log(multi)/counter);
    }

    static int findExtreme(List<List<Integer>> matrix, Boolean isMaximum) {
        List<Integer> extremes = new ArrayList<Integer>();
        for (int i = 0; i < matrix.size(); ++i) {
            if (isMaximum) {
                extremes.add(Collections.max(matrix.get(i)));
            } else {
                extremes.add(Collections.min(matrix.get(i)));
            }
        }

        return isMaximum ? Collections.max(extremes) : Collections.min(extremes);
    }

    static int setParam(String name) {
        Scanner scanner = new Scanner(System.in);
        int value;
        do {
            System.out.printf("Input %s of matrix: ", name);
            value = scanner.nextInt();
            if (value > 0 && value <= 20) {
                return value;
            } else {
                System.out.print("Value must be greater than 0 and less than 20, please try again!\n\n");
            }
        } while (true);
    }

    static List<List<Integer>> fillMatrix() {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Scanner scanner = new Scanner(System.in);

        final int MAX_RAND = 20;
        final int MIN_RAND = -20;

        int width = setParam("width");
        int height = setParam("height");

        System.out.print("Keyboard or Random filling of Matrix?[true|false] ");
        Boolean isKeyboard = scanner.nextBoolean();

        for (int i = 0; i < height; ++i) {
            List<Integer> col = new ArrayList<Integer>();
            for (int j = 0; j < width; ++j) {
                if (isKeyboard) {
                    System.out.printf("Matrix [%d][%d] = ", i, j);
                    col.add(scanner.nextInt());
                } else {
                    int random = (int) (Math.random() * (MAX_RAND - MIN_RAND) + MIN_RAND);
                    System.out.printf("Matrix [%d][%d] = %d \n", i, j, random);
                    col.add(random);
                }
            }
            result.add(col);
        }

        return result;
    }
}