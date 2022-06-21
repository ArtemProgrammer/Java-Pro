package Lesson10;

public interface Iterator<String> {
    String next();
    void remove();
    boolean hasNext();
    //void forEachRemaining(CollectionImpl collection);
}
