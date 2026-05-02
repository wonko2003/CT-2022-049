package Q8;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with an exclamation mark: ");
        String input = scanner.nextLine();

        // Find the position of the exclamation mark
        int index = input.indexOf("!");

        // Extract the part before and after the '!'
        String before = input.substring(0, index).trim();
        String after = input.substring(index + 1).trim();

        // Output the results on separate lines
        System.out.println(before);
        System.out.println(after);

        scanner.close();
    }
}