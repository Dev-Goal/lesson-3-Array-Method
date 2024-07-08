package Practice.Practice_14_Convert_Temperature;

import java.util.Scanner;

public class Convert_Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        double celsius, fahrenheit;
        do {
            System.out.println("Convert Temperature");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            switch (number) {
                case 1:
                    System.out.print("Enter fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.print("Enter celsius: ");
                    celsius = scanner.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("You not choice");
            }
        }while (number != 0);
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
}
