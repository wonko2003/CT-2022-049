package Q1;

class Question1 {
    public static void main(String[] args) {
        double A = 2.0;
        double B = 3.0;
        double C = 4.0;
        double X = 5.0;
        double Y = 2.0;
        double radius = 5.0;

        double resultA = Math.sqrt(Math.pow(B, 2) + 4 * A * C);
        double resultB = Math.sqrt(X + 4 * Math.pow(Y, 3));
        double resultC = Math.cbrt(X * Y);
        double resultD = Math.PI * Math.pow(radius, 2);

        System.out.println("a. " + resultA);
        System.out.println("b. " + resultB);
        System.out.println("c. " + resultC);
        System.out.println("d. " + resultD);
    }
}