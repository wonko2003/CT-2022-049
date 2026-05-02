package Q2;

import javax.swing.JFrame;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String first = scanner.next();
        System.out.print("Enter last name: ");
        String last = scanner.next();

        JFrame frame = new JFrame();
        frame.setTitle(first + " " + last); // Set title to full name [cite: 12]
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}