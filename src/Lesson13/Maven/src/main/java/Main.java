import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(35);
        arrayList.add(67);
        arrayList.add(23);
        arrayList.add(77);
        System.out.println(AverageIntegers.integerWork(arrayList));

        System.out.println("-------------------------");

        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(StringsToUpperCase.stringsToUpperCase(list));

        System.out.println("-------------------------");

        List<String> listStrings = new ArrayList<>();
        listStrings.add("ICON");
        listStrings.add("BUS");
        listStrings.add("roof");
        listStrings.add("COMPUTER");
        listStrings.add("PHONE");
        listStrings.add("lock");
        System.out.println(FilterStringsForLength.filerStrings(listStrings));
    }
}
