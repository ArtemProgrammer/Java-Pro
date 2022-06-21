package Lesson10;

public class SquareRoot {
    public void calculate(double a, double b, double c) {
        double D = b * b - 4 * a * c;
        if (a == 0) {
            if (b != 0) {
                System.out.println(-c / b);
            }
        }
        else if (D == 0) {
            System.out.println(-b / (2 * a));
        }
        else if (D > 0) {
            double r1 = (-b + Math.pow(D, 2)) / (2 * a);
            double r2 = (-b - Math.pow(D, 2)) / (2 * a);
            System.out.println("Root 1 = " + r1 + ", root 2 = " + r2);
        }
        else {
            System.out.println("No roots.");
        }
    }
}
