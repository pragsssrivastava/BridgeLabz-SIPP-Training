package JavaProgramming;

import java.util.Scanner;

public class WindChillCalculator {

    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature
               - 35.75 * Math.pow(windSpeed, 0.16)
               + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double temp = sc.nextDouble();
        System.out.print("Enter wind speed in mph: ");
        double speed = sc.nextDouble();

        if (temp <= 50 && speed >= 3) {
            double windChill = calculateWindChill(temp, speed);
            System.out.println("Wind Chill Temperature: " + windChill);
        } else {
            System.out.println("Wind Chill calculation is only valid for:");
            System.out.println("- Temperature <= 50°F");
            System.out.println("- Wind speed >= 3 mph");
        }
    }
}
