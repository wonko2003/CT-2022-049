package Q10;

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word or phrase:");
        String text = scanner.nextLine();

        String original = text.replaceAll("\\s+", "").toLowerCase();

        String reverse = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }

        if (original.equals(reverse)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }

        scanner.close();
    }
}