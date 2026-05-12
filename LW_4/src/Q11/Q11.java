package Q11;

import java.util.Random;
import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1;
        int guess = 0;

        System.out.println("Guess a number between 1 and 100");

        while (guess != number) {

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess > number) {
                System.out.println("Lower");
            } else if (guess < number) {
                System.out.println("Higher");
            } else {
                System.out.println("Correct! You guessed the number.");
            }
        }

        scanner.close();
    }
}