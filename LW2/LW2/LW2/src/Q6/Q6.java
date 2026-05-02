package Q6;

import java.util.Scanner;
import java.time.Year;

class Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year you were born: ");
        int birthYear = input.nextInt();

        int currentYear = Year.now().getValue();
        int age = currentYear - birthYear;

        System.out.println("Born: " + birthYear);
        System.out.println("Current year: " + currentYear);
        System.out.println("Your age: " + age + " years");

        input.close();
    }
}