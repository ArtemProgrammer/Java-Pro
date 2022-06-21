package Lesson10;

import java.util.Collection;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        WithoutDuplicate withoutDuplicate = new WithoutDuplicate();
        Collection<String> collection = new LinkedList<>();
        collection.add("a");
        collection.add("d");
        collection.add("c");
        collection.add("b");
        collection.add("a");
        collection.add("b");
        System.out.println(withoutDuplicate.withoutDuplicate(collection));

       /* CollectionImpl collection2 = new CollectionImpl();
        collection2.add(0, "a");
        collection2.add(1, "b");
        collection2.add(2, "c");
        collection2.add(3, "d");
        collection2.iterator().remove();
        System.out.println(collection2.iterator().next());*/

        SquareRoot squareRoot = new SquareRoot();
        squareRoot.calculate(4, 7, 3);
    }
}
