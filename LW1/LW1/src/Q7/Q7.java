package Q7;

import javax.swing.JFrame;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Q7 {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String timeString = now.format(formatter);

        JFrame frame = new JFrame();
        frame.setTitle(timeString);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}