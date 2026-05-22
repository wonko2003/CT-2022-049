package Q1;

import java.util.Scanner;

class Temperature {
    private double celsius;

    public Temperature() {
        this.celsius = 0.0;
    }

    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    public double toCelsius() {
        return this.celsius;
    }

    public double toFahrenheit() {
        return (this.celsius * 9.0 / 5.0) + 32;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public void setFahrenheit(double fahrenheit) {
        this.celsius = (fahrenheit - 32) * 5.0 / 9.0;
    }
}

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Temperature temp = new Temperature();

        System.out.print("Enter temperature in Celsius: ");
        double inputCelsius = scanner.nextDouble();

        temp.setCelsius(inputCelsius);

        System.out.printf("Equivalent Temperature in Fahrenheit: %.2f\n", temp.toFahrenheit());
        scanner.close();
    }
}