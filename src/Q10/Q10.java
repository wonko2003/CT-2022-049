package Q10;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an odd-length word: ");
        String word = scanner.next();

        int length = word.length();
        int middleIndex = length / 2;
        char middleChar = word.charAt(middleIndex);

        System.out.println(middleChar);

        scanner.close();
    }
}