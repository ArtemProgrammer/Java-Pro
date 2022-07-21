import java.util.Arrays;
import java.util.Scanner;

public class GetNumbers {
    public static void start() {
        Object[][] newMatrix;
        newMatrix = DigitMatrix.space;
        for (String arg : getNumbers()) {
            if (NewDigitMatrix.getDigitMatrix(newMatrix, arg) == null) {
                throw new NullPointerException("Non-digit sequence!");
            } else {
                newMatrix = NewDigitMatrix.getDigitMatrix(newMatrix, arg);
            }
        }
        assert newMatrix != null;
        NewDigitMatrix.print(newMatrix);
    }
    public static void start(String[] args) {
        Object[][] newMatrix;
        newMatrix = DigitMatrix.space;
        for (String arg : getNumbers(args)) {
            if (NewDigitMatrix.getDigitMatrix(newMatrix, arg) == null) {
                throw new NullPointerException("Non-digit sequence!");
            } else {
                newMatrix = NewDigitMatrix.getDigitMatrix(newMatrix, arg);
            }
        }
        assert newMatrix != null;
        NewDigitMatrix.print(newMatrix);
    }

    private static String[] getNumbers(String[] args) {
        String[] nums = {""};
        String[] digitNums = {""};
        String num = String.join("", args);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = num;
        }
        for (String n : nums) {
            if (isDigit(n)) {
                digitNums = n.split("");
            }
            else {
                continue;
            }
        }
        return digitNums;
    }

    private static String[] getNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter nums:");
        String[] nums = {""};
        String[] digitNums = {""};
        String num = scanner.nextLine();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = num;
        }
        for (String n : nums) {
            if (isDigit(n)) {
                digitNums = n.split("");
            }
            else {
                continue;
            }
        }
        return digitNums;
    }

    private static boolean isDigit(String nums) {
        if (nums == null) {
            return false;
        }
        try {
            String num = nums;
            return true;
        } catch (NumberFormatException exception) {
            return false;
        }
    }
}
