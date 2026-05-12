package Q7;

import java.util.Scanner;

public class Q7 {

    public static int countDigits(int num) {
        int count = 0;

        if (num == 0) {
            return 1;
        }

        while (num != 0) {
            num = num / 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Enter an integer (negative to stop): ");
            int num = scanner.nextInt();

            if (num < 0) {
                break;
            }

            System.out.println("Number of digits: " + countDigits(num));
        }

        scanner.close();
    }
}
