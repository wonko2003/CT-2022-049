package Q9;

import java.util.Scanner;

class Question9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principal amount P: ");
        double P = input.nextDouble();

        System.out.print("Enter annual interest rate R (%): ");
        double R = input.nextDouble();

        System.out.print("Enter number of years N: ");
        int N = input.nextInt();

        double amount = P * Math.pow(1 + (R / 100), N);

        System.out.println("Amount after " + N + " years: " + amount);

        input.close();
    }
}