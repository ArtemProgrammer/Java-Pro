import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FilterStringsForLengthTest {

    @Test
    void filerStrings() {
        List<String> list = new ArrayList<>();
        list.add("ICON");
        list.add("BUS");
        list.add("roof");
        list.add("COMPUTER");
        list.add("PHONE");
        list.add("lock");

        assertEquals("[roof, lock]", FilterStringsForLength.filerStrings(list).toString());
    }
}