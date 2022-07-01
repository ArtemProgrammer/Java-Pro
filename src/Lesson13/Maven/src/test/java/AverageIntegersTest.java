import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.*;

class AverageIntegersTest {
    public static final double EXPECTED_VALUE = 25;
    @Test
    void integerWork() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        OptionalDouble result = AverageIntegers.integerWork(arrayList);
        assertEquals(EXPECTED_VALUE, result.getAsDouble());
    }
}