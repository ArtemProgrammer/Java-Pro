import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringsToUpperCaseTest {

    @Test
    void stringsToUpperCase() {
        List<String> list = new ArrayList<>();
        list.add("one");
        assertEquals("[Pair{one:ONE}]", StringsToUpperCase.stringsToUpperCase(list).toString());
    }
}