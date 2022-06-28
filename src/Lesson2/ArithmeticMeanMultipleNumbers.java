package Lesson2;

import java.util.Scanner;

public class ArithmeticMeanMultipleNumbers {

    public static void main(String[] args) {
        System.out.println("Arithmetic mean is: " + arithmeticMean(fillNumbers(quantityNumbers())));
    }

    public static double[] fillNumbers(double[] numbers) {
        System.out.println("Enter your numbers:");
        for (int i = 0; i < numbers.length; ++i) {
            Scanner scanner = new Scanner(System.in);
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    public static double[] quantityNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter quantity numbers:");
        return new double[scanner.nextInt()];
    }

    public static double arithmeticMean(double[] numbers) {
        double result = 0;
        for (int i = 0; i < numbers.length; ++i) {
            result += numbers[i];
        }
        return result / numbers.length;
    }
}