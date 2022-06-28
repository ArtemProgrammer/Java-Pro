package Lesson7;
public class Main {
    public static void main(String[] args) {
        StringArray stringArray = new StringArray();
        stringArray.print();
        stringArray.add("Я 1");
        stringArray.add("Я 2");
        stringArray.add("Я 3");
        stringArray.add("Я 4");
        stringArray.add("Я 5");
        stringArray.add("Я 6");
        stringArray.add("Я 7");
        stringArray.add("Я 8");
        stringArray.add("Я 9");
        stringArray.add("Я 10");
        stringArray.add(5, "Я новый пятый");
        stringArray.add(5, "I'm new fifth");
        stringArray.delete(5);
        stringArray.delete("Я новый пятый");

        stringArray.print();

        System.out.println(stringArray.get(5));
        System.out.println("Length: " + stringArray.getLength());
        System.out.println("Capacity: " + stringArray.getCapacity());
    }
}
