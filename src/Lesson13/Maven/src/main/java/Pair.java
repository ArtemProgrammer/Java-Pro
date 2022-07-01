import java.util.Locale;

public class Pair {
    private final String value;

    public Pair(String value) {
        this.value = value;
    }

    private String toUpper() {
        return value.toUpperCase();
    }
    @Override
    public String toString() {
        return "Pair{" +
                value + ":" +
                toUpper() +
                '}';
    }
}
