package Lesson8;

public class Main {
    public static void main(String[] args) {
        CollectionImpl collection = new CollectionImpl();
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");
        collection.add("e");
        collection.delete("c");
    }
}
