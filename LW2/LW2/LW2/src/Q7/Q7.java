package Q7;

import java.util.Scanner;

class Question7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in kilograms: ");
        int weight = input.nextInt();

        System.out.print("Enter height in centimeters: ");
        int height = input.nextInt();

        double bmi = weight / Math.pow(height / 100.0, 2);

        System.out.println("BMI: " + bmi);

        input.close();
    }
}