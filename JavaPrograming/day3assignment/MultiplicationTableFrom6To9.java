package day3assignment;

import java.util.Scanner;

public class MultiplicationTableFrom6To9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take integer input
        System.out.print("Enter a number to get its multiplication table from 6 to 9: ");
        int number = scanner.nextInt();

        // Create array to store 4 results (6 to 9 inclusive)
        int[] multiplicationResult = new int[4];

        // Step 2: Use a loop from 6 to 9
        int index = 0;
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[index] = number * i;
            index++;
        }

        // Step 3: Display results
        System.out.println("\nMultiplication Table of " + number + " from 6 to 9:");
        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
            index++;
        }

        scanner.close();
    }
}
