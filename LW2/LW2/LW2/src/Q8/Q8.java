package Q8;

import java.util.Scanner;

class Question8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the sphere: ");
        double radius = input.nextDouble();

        double pi = 3.14;
        double volume = (4.0 / 3.0) * pi * Math.pow(radius, 3);

        System.out.println("Volume of the sphere: " + volume);

        input.close();
    }
}