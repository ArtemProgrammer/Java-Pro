import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StringsToUpperCase {
    public static List<Pair> stringsToUpperCase(List<String> list) {
        return list.stream().map(Pair::new).collect(Collectors.toList());
    }
}
