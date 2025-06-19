package JavaProgramming;

import java.util.Scanner;

public class ChocolateDivider {

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int eachChild = number / divisor;
        int remaining = number % divisor;
        return new int[]{eachChild, remaining};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = sc.nextInt();
        System.out.print("Enter number of children: ");
        int numberOfChildren = sc.nextInt();

        if (numberOfChildren > 0) {
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
            System.out.println("Each child gets: " + result[0] + " chocolates");
            System.out.println("Remaining chocolates: " + result[1]);
        } else {
            System.out.println("Number of children must be greater than 0.");
        }
    }
}
