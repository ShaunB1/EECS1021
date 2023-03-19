package Lab_B;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class LabB {
    private static final int DIMENSION = 3;

    /**
     * Parses a matrix from a string.
     * @param s The string to parse. It must consist only of numbers separated by spaces.
     * The amount of numbers should be equal to {@code rowCount * columnCount}.
     * @param rowCount the number of rows in the matrix.
     * @param colCount the number of columns in the matrix.
     * @return The matrix represented by the string.
     */
    public static int[][] parseMatrix(String s, int rowCount, int colCount){
        String[] splitString = s.split(" ");
        if(splitString.length != 9){
            throw new IllegalArgumentException("Error: DIMENSION = 3, therefore each array needs to contain 9 elements");
        }

        int[][] resultMatrix = new int[rowCount][colCount];
        for(int i=0; i<rowCount; i++){
            for(int j=0; j<colCount; j++){
                resultMatrix[i][j] = Integer.parseInt(splitString[i*colCount+j]);
            }
        }
        return resultMatrix;
    }

    /**
     * Returns the matrix which is the result of the operation {@code op} on the
     * matrices {@code a} and {@code b}.
     * @param a The first matrix.
     * @param b The second matrix.
     * @param op The operation to perform. Must be one of {@code +}, {@code -}, {@code *}.
     * @return The matrix which is the result of the operation.
     */
    private static int[][] computeMatrixExpression(int[][] a, int[][] b, String op){
        int[][] newMatrix = new int[DIMENSION][DIMENSION];
        for(int i=0; i<DIMENSION; i++){
            for(int j=0; j<DIMENSION; j++){
                newMatrix[i][j] = switch(op){
                    case "+" -> a[i][j] + b[i][j];
                    case "-" -> a[i][j] - b[i][j];
                    case "*" -> a[i][j] * b[i][j];
                    default -> throw new IllegalArgumentException("not a valid operation");
                };
            }
        }
        return newMatrix;
    }

    /**
     * Converts a matrix to a string. For a given matrix
     * {@code [[1, 2, 3], [4, 5, 6], [7, 8, 9]]}, the string representation will be
     * {@code "[1 2 3]\n[4 5 6]\n[7 8 9]"}.
     *
     * @param mat The matrix to convert.
     * @return The string representation of the matrix.
     */
    private static String matrixToString(int[][] mat){
        StringJoiner name = new StringJoiner("\n");

        for(int i=0; i<DIMENSION; i++){
            name = name.add(Arrays.toString(mat[i]));
        }

        String outputString = name.toString();
        return outputString;
    }

    public static void main(String[] args){
        // create input object type Scanner
        Scanner input = new Scanner(System.in);

        // receive user inputs
        System.out.println("Enter the first matrix values: ");
        String firstMatrix = input.nextLine();

        System.out.println("Enter the second matrix values");
        String secondMatrix = input.nextLine();

        System.out.println("Enter the desired operation: ");
        String operation = input.nextLine();

        var resultMatrix1 = parseMatrix(firstMatrix, DIMENSION, DIMENSION);
        var resultMatrix2 = parseMatrix(secondMatrix, DIMENSION, DIMENSION);

        var computedMatrix = computeMatrixExpression(resultMatrix1, resultMatrix2, operation);

        var finalString = matrixToString(computedMatrix);
        System.out.println(finalString);
    }
}