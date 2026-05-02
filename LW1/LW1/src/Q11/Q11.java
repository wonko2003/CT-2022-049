package Q11;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name (First Middle Last): ");
        String first = scanner.next();
        String middle = scanner.next();
        String last = scanner.next();

        char middleInitial = middle.charAt(0);

        System.out.println(last + ", " + first + " " + middleInitial + ".");

        scanner.close();
    }
}