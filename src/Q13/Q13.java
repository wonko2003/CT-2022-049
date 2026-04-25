package Q13;

import javax.swing.JFrame;

public class Q13 {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame();
        frame.setTitle("Blinking Frame");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
        Thread.sleep(500);
        frame.setVisible(false);
        Thread.sleep(500);
        frame.setVisible(true);
    }
}