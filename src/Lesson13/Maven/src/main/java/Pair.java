import java.util.Locale;

public class Pair {
    private final String value;


    public Pair(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                value + ":" +
                value.toUpperCase() +
                '}';
    }
}
