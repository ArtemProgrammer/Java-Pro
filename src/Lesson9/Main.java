package Lesson9;

public class Main {
    public static void main(String[] args) {
        CollectionImpl collection = new CollectionImpl();
        collection.add("Hello");
        collection.add(" my ");
        collection.add("world");
        collection.add("d");
        collection.add("f");
        System.out.println(collection.get(2));
    }
}
