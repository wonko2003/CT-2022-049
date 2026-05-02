package Q5;

import java.util.Scanner;

class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celsius = (5.0 / 9.0) * (fahrenheit - 32);

        System.out.println(fahrenheit + "°F = " + celsius + "°C");

        input.close();
    }
}