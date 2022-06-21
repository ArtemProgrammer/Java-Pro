package Lesson8;

public interface Collection {
    boolean add(String value);
    boolean add(int index, String value);
    boolean clear();
    boolean delete(String value);
    String get(int index);
    int size();
    boolean equals (Collection str);
    boolean contain(String o);
}
