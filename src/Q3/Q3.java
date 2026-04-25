package Q3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String first = scanner.next();

        System.out.print("Enter your middle name: ");
        String middle = scanner.next();

        System.out.print("Enter your last name: ");
        String last = scanner.next();

        char middleInitial = middle.charAt(0);

        System.out.println(first + " " + middleInitial + ". " + last);

        scanner.close();
    }
}