import java.util.Arrays;

public class NewDigitMatrix {
    public static Object[][] getDigitMatrix(Object[][] newMatrix, String arg) {
        switch (arg) {
            case "0" -> {
                newMatrix = arrayConcat(newMatrix, DigitMatrix.zero, ARRAY_CONCAT_VERT);
                newMatrix = arrayConcat(newMatrix, DigitMatrix.space, ARRAY_CONCAT_VERT);
            }
            case "1" -> {
                newMatrix = arrayConcat(newMatrix, DigitMatrix.one, ARRAY_CONCAT_VERT);
                newMatrix = arrayConcat(newMatrix, DigitMatrix.space, ARRAY_CONCAT_VERT);
            }
            case "2" -> {
                newMatrix = arrayConcat(newMatrix, DigitMatrix.two, ARRAY_CONCAT_VERT);
                newMatrix = arrayConcat(newMatrix, DigitMatrix.space, ARRAY_CONCAT_VERT);
            }
            case "3" -> {
                newMatrix = arrayConcat(newMatrix, DigitMatrix.three, ARRAY_CONCAT_VERT);
                newMatrix = arrayConcat(newMatrix, DigitMatrix.space, ARRAY_CONCAT_VERT);
            }
            case "4" -> {
                newMatrix = arrayConcat(newMatrix, DigitMatrix.four, ARRAY_CONCAT_VERT);
                newMatrix = arrayConcat(newMatrix, DigitMatrix.space, ARRAY_CONCAT_VERT);
            }
            case "5" -> {
                newMatrix = arrayConcat(newMatrix, DigitMatrix.five, ARRAY_CONCAT_VERT);
                newMatrix = arrayConcat(newMatrix, DigitMatrix.space, ARRAY_CONCAT_VERT);
            }
            case "6" -> {
                newMatrix = arrayConcat(newMatrix, DigitMatrix.six, ARRAY_CONCAT_VERT);
                newMatrix = arrayConcat(newMatrix, DigitMatrix.space, ARRAY_CONCAT_VERT);
            }
            case "7" -> {
                newMatrix = arrayConcat(newMatrix, DigitMatrix.seven, ARRAY_CONCAT_VERT);
                newMatrix = arrayConcat(newMatrix, DigitMatrix.space, ARRAY_CONCAT_VERT);
            }
            case "8" -> {
                newMatrix = arrayConcat(newMatrix, DigitMatrix.eight, ARRAY_CONCAT_VERT);
                newMatrix = arrayConcat(newMatrix, DigitMatrix.space, ARRAY_CONCAT_VERT);
            }
            case "9" -> {
                newMatrix = arrayConcat(newMatrix, DigitMatrix.nine, ARRAY_CONCAT_VERT);
                newMatrix = arrayConcat(newMatrix, DigitMatrix.space, ARRAY_CONCAT_VERT);
            }
            default -> {
                return null;
            }
        }
        return newMatrix;
    }

    public static void print(Object[][] newMatrix) {
        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[i].length; j++) {
                System.out.print(newMatrix[i][j]);
            }
            System.out.println();
        }
    }

    private static final byte ARRAY_CONCAT_HORIZ = 0, ARRAY_CONCAT_VERT = 1;

    private static Object[][] arrayConcat(Object[][] a, Object[][] b, byte concatDirection)
    {
        if(concatDirection == ARRAY_CONCAT_HORIZ && a[0].length == b[0].length)
        {
            return Arrays.stream(arrayConcat(a, b)).map(Object[].class::cast)
                    .toArray(Object[][]::new);
        }
        else if(concatDirection == ARRAY_CONCAT_VERT && a.length == b.length)
        {
            Object[][] arr = new Object[a.length][a[0].length + b[0].length];
            for(int i=0; i<a.length; i++)
            {
                arr[i] = arrayConcat(a[i], b[i]);
            }
            return arr;
        }
        else
            throw new RuntimeException("Attempted to concatenate arrays of incompatible sizes.");
    }

    private static Object[] arrayConcat(Object[] a, Object[] b)
    {
        Object[] arr = new Object[a.length + b.length];
        System.arraycopy(a, 0, arr, 0, a.length);
        System.arraycopy(b, 0, arr, a.length, b.length);
        return arr;
    }
}
