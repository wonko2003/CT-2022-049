package Q2;

import java.util.Scanner;

class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length in centimeters: ");
        double cm = input.nextDouble();

        double inches = cm / 2.54;
        double feet = inches / 12;

        System.out.println(cm + " cm = " + feet + " feet or " + inches + " inches");

        input.close();
    }
}