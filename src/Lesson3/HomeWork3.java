import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        String op = "";
        do {
            System.out.println("Select a method from the list using numbers from 1 to 12!");
            System.out.println("If you want watch list of methods write 'list'.");
            System.out.println("If you want close the program write 'exit'.");
            op = scanner.nextLine();
            if (op.equals("list")) {
                System.out.println("'1' - При помощи цикла for вывести на экран нечетные числа от 1 до 99.");
                System.out.println("'2' - Дано число n при помощи цикла for посчитать факториал n!.");
                System.out.println("'3' - Перепишите программы (1 и 2) с использованием цикла while.");
                System.out.println("'4' - Перепишите программы (1 и 2) с использованием цикла do - while.");
                System.out.println("'5' - Даны переменные x и n вычислить x^n.");
                System.out.println("'6' - Вывести 10 первых чисел последовательности 0, -5,-10,-15.");
                System.out.println("'7' - Необходимо вывести на экран таблицу умножения на Х (х любое число в диапазоне 0 .. 10).");
                System.out.println("'8' - Создайте массив, содержащий 10 первых нечетных чисел. Выведете элементы массива на консоль в одну строку, разделяя запятой.");
                System.out.println("'9' - Дан массив размерности N, найти наименьший элемент массива и вывести на консоль (массив заполнить случайными числами из диапазона 0 .. 100).");
                System.out.println("'10' - В массиве из задания 9. найти наибольший элемент.");
                System.out.println("'11' - Поменять наибольший и наименьший элементы массива местами. Пример: дан массив {4, -5, 0, 6, 8}. После замены будет выглядеть {4, 8, 0, 6, -5}.");
                System.out.println("'12' - Вывести на экран шахматную доску 8х8 в виде 2 мерного массива (W - белые клетки , B - черные клети).");
                System.out.println();
            }
            switch (op) {
                case "1":
                    printNum();
                    break;
                case "2":
                    printFactorial(7);
                    break;
                case "3":
                    printNumWhile();
                    printFactorialWhile(7);
                    break;
                case "4":
                    printNumDoWhile();
                    printFactorialDoWhile(7);
                    break;
                case "5":
                    printDegree(3,5);
                    break;
                case "6":
                    reversePrintStepFive();
                    break;
                case "7":
                    printMultiplicationTable(5);
                    break;
                case "8":
                    printArrOddNumbers();
                    break;
                case "9":
                    minValueArr(10);
                    break;
                case "10":
                    maxValueArr(10);
                    break;
                case "11":
                    reverseArray();
                    break;
                case "12":
                    printChessBoard();
                    break;
            }
        } while (!op.equals("exit"));
        System.out.println("Have a nice day! :)");
    }

    public static void printNum() {
        //1. При помощи цикла for вывести на экран нечетные числа от 1 до 99:
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void printFactorial(int value) {
        //2. Дано число n при помощи цикла for посчитать факториал n!:
        int result = 1;
        for (int i = 2; i <= value; i++) {
            result *= i;
        }
        System.out.println(result);
    }

    public static void printNumWhile() {
        //3. Перепишите программы (1 и 2) с использованием цикла while:
        int i = 0;
        while (i < 100) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void printFactorialWhile(int value) {
        //3. Перепишите программы (1 и 2) с использованием цикла while:
        int result = 1;
        int i = 2;
        while (i <= value) {
            result *= i;
            i++;
        }
        System.out.println(result);
    }

    public static void printNumDoWhile() {
        //4. Перепишите программы (1 и 2) с использованием цикла do - while:
        int i = 0;
        do {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        } while (i < 100);

    }

    public static void printFactorialDoWhile(int value) {
        //4. Перепишите программы (1 и 2) с использованием цикла do - while:
        int result = 1;
        int i = 2;
        do {
            result *= i;
            i++;
        } while (i <= value);
        System.out.println(result);
    }

    public static void printDegree(int x, int n) {
        //5. Даны переменные x и n вычислить x^n:
        int res = 1;
        for (int i = 0; i < n; i++) {
            res *= x;
        }
        System.out.println(res);
    }

    public static void reversePrintStepFive() {
        //6. Вывести 10 первых чисел последовательности 0, -5,-10,-15..:
        for (int i = 0; i > -50; i--) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void printMultiplicationTable(int value) {
        //7. Необходимо вывести на экран таблицу умножения на Х (х любое число в диапазоне 0 .. 10):
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + " * " + value + " = " + i * value);
        }
    }

    public static void printArrOddNumbers() {
        //8. Создайте массив, содержащий 10 первых нечетных чисел. Выведете элементы массива на консоль в одну строку, разделяя запятой:
        int[] arrOddNumbers = new int[10];
        for (int i = 1, j = 0; j < arrOddNumbers.length; i++) {
            if (i % 2 != 0) {
                arrOddNumbers[j] = i;
                j++;
            }
        }

        for (int i = 0; i < arrOddNumbers.length; i++) {
            System.out.print(arrOddNumbers[i] + ", ");
        }
        System.out.println();
    }

    public static void minValueArr(int value) {
        //9. Дан массив размерности N, найти наименьший элемент массива и вывести на консоль (массив заполнить случайными числами из диапазона 0 .. 100)
        Random random = new Random();
        int[] arrRandValue = new int[value];
        for (int i = 0; i < arrRandValue.length; i++) {
            arrRandValue[i] = random.nextInt(0, 100);
        }
        int minValue = arrRandValue[0];
        for (int i = 0; i < arrRandValue.length; i++) {
            if (arrRandValue[i] < minValue) {
                minValue = arrRandValue[i];
            }
        }
        for (int i = 0; i < arrRandValue.length; i++) {
            System.out.print(arrRandValue[i] + ", ");
        }
        System.out.println();
        System.out.println("Min value in arr: " + minValue);
    }

    public static void maxValueArr(int value) {
        //10. В массиве из задания 9. найти наибольший элемент
        Random random = new Random();
        int[] arrRandValue = new int[value];
        for (int i = 0; i < arrRandValue.length; i++) {
            arrRandValue[i] = random.nextInt(0, 100);
        }
        int maxValue = arrRandValue[0];
        for (int i = 0; i < arrRandValue.length; i++) {
            if (arrRandValue[i] > maxValue) {
                maxValue = arrRandValue[i];
            }
        }
        for (int i = 0; i < arrRandValue.length; i++) {
            System.out.print(arrRandValue[i] + ", ");
        }
        System.out.println();
        System.out.println("Max value in arr: " + maxValue);
    }

    public static void reverseArray() {
        //11. Поменять наибольший и наименьший элементы массива местами. Пример: дан массив {4, -5, 0, 6, 8}. После замены будет выглядеть {4, 8, 0, 6, -5}.
        int[] arr = {4, -5, 0, 6, 8};
        int tmpForMin = 0;
        int tmpForMax = 0;
        int maxValue = arr[0];
        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                tmpForMin = i;
            }
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                tmpForMax = i;
            }
        }
        int temp;
        temp = arr[tmpForMax];
        arr[tmpForMax] = arr[tmpForMin];
        arr[tmpForMin] = temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static void printChessBoard() {
        //12. Вывести на экран шахматную доску 8х8 в виде 2 мерного массива (W - белые клетки , B - черные клети):
        char[][] field = new char[8][8];
        char blackCage = 'B';
        char whiteCage = 'W';

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    field[i][j] = whiteCage;
                }
                if ((i + j) % 2 != 0) {
                    field[i][j] = blackCage;
                }
            }
        }

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }
}
