package Lesson2;
public class DepositCalculator {

    public static void main(String[] args) {
        depositCalculator(Double.parseDouble(args[0]), Double.parseDouble(args[1]),
                Double.parseDouble(args[2]));
    }

    public static void depositCalculator(double amountOfMoney, double interestRate, double depositTerm) {
        int numberOfInterestRates = 12;
        for (int i = 1; i <= depositTerm; i++) {
            double finalSum = amountOfMoney * Math.pow(1.0 + interestRate * 0.01 / numberOfInterestRates, (numberOfInterestRates));
            System.out.println("Deposit for " + i + " year: " + finalSum);
            System.out.println("Percent for " + i + " year: " + (finalSum - amountOfMoney));
            amountOfMoney = finalSum;
        }
    }
}