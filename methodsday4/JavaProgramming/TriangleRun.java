package JavaProgramming;

import java.util.Scanner;

public class TriangleRun {

    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000 / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1 (in meters): ");
        double a = sc.nextDouble();
        System.out.print("Enter side 2 (in meters): ");
        double b = sc.nextDouble();
        System.out.print("Enter side 3 (in meters): ");
        double c = sc.nextDouble();

        double rounds = calculateRounds(a, b, c);
        System.out.println("The athlete must complete " + Math.ceil(rounds) + " rounds to run 5 km.");
    }
}
