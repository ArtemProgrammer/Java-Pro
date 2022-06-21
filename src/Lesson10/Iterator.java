package Lesson10;

import Lesson8.CollectionImpl;

public interface Iterator<String> {
    String next();
    void remove();
    boolean hasNext();
    void forEachRemaining(CollectionImpl collection);
}
