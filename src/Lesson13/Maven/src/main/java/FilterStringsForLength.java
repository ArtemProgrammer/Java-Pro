import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class FilterStringsForLength {
    public static List<String> filerStrings(List<String> listStrings) {
        listStrings = listStrings.stream()
                .filter(s -> s.equals(s.toLowerCase(Locale.ROOT)))
                .filter(s -> s.length() == 4)
                .collect(Collectors.toList());
        return listStrings;
    }
}
