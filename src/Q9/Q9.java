package Q9;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int length = input.length();
        char firstChar = input.charAt(0);
        char lastChar = input.charAt(length - 1);

        System.out.println(length);
        System.out.println(firstChar);
        System.out.println(lastChar);

        scanner.close();
    }
}