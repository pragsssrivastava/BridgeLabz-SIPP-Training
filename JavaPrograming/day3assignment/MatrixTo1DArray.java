package day3assignment;
import java.util.Scanner;

public class MatrixTo1DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take input for rows and columns
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();

        // Create 2D array (matrix)
        int[][] matrix = new int[rows][columns];

        // Input elements for the 2D array
        System.out.println("\nEnter elements for the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Step 2 & 3: Copy elements to 1D array
        int[] array = new int[rows * columns];
        int index = 0;

        System.out.println("\nCopying matrix elements into 1D array...");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        // Step 4: Print the 1D array
        System.out.println("\n1D Array elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index " + i + " = " + array[i]);
        }

        scanner.close();
    }
}
