package Q6;

import javax.swing.JFrame;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        int width = scanner.nextInt();

        System.out.print("Enter the height: ");
        int height = scanner.nextInt();

        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter the title: ");
        String title = scanner.nextLine();

        JFrame frame = new JFrame();
        frame.setTitle(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        scanner.close();
    }
}