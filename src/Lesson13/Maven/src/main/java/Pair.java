import java.util.Locale;

public class Pair {
    private final String value;
    private String upperValue;

    public Pair(String value, String upperValue) {
        this.value = value;
        this.upperValue = upperValue;
    }


    @Override
    public String toString() {
        return "Pair{" +
                value + ":" +
                upperValue +
                '}';
    }
}
