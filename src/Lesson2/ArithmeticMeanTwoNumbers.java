import java.util.Scanner;

public class ArithmeticMeanTwoNumbers {
    public static int counter = 0;

    public static void main(String[] args) {
        System.out.println("Arithmetic mean is: " + arithmeticMean(inputValue(), inputValue()));
    }

    public static double inputValue() {
        if (counter < 2) {
            ++counter;
        }
        else {
            counter = 0;
        }
        double value;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + counter + " number:");
        value = scanner.nextDouble();
        return value;
    }

    public static double arithmeticMean(double num_1, double num_2) {
        return (num_1 + num_2) / 2;
    }
}