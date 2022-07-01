import java.util.ArrayList;
import java.util.OptionalDouble;

public class AverageIntegers {
    public static OptionalDouble integerWork(ArrayList<Integer> arrayList) {
        return arrayList.stream().mapToInt(e -> e).average();
    }
}
