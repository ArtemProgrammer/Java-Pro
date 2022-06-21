package Lesson8;

import Lesson10.Iterator;
import java.util.Objects;

public class CollectionImpl implements Collection {
    private int capacity = 10;
    private int length = 0;
    private int index = 0;
    private String[] array = new String[capacity];

    @Override
    public boolean add(String value) {
        if (length >= capacity) {
            resize();
        }
        array[length++] = value;
        return true;
    }

    @Override
    public boolean add(int index, String value) {
        if (index > length) {
            return false;
        }
        else {
            if (length >= capacity) {
                resize();
            }
            else {
                length++;
                for (int i = length - 1; i > index; i--) {
                    array[i] = array[i - 1];
                }
                array[index] = value;
                return true;
            }
            return true;
        }
    }

    @Override
    public boolean delete(String value) {
        for (int i = 0; i < length; i++) {
            if (Objects.equals(array[i], value)) {
                moving(i);
            }
        }
        length--;
        return true;
    }

    @Override
    public String get(int index) {
        if (index > length || index < 0) {
            System.out.println("Ошибка, index " + index + " больше чем размер массива " + length);
        }
        return array[index];
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public boolean clear() {
        array = new String[10];
        length = 0;
        return true;

    }

    @Override
    public boolean equals (Collection str) {
        if (this.size() != str.size()) {
            return false;
        }
        else {
            for (int i = 0; i < length; i++) {
                if (!this.contain(str.get(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean contain(String o) {
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                assert array[i] != null;
                if (array[i] == null && o == null || array[i].equals(o)) {
                    return true;
                }
                if (array[i] == null || o == null) {
                    continue;
                }
                if (array[i] == null && o != null) {
                    return false;
                }
            }
        }
        return false;
    }

    //iterator
    public Iterator<String> iterator() {

        return new Iterator<>() {
            @Override
            public String next() {
                return array[index++];
            }

            @Override
            public void remove() {
                final String[] newArray = new String[array.length - 1];
                int indexNext = index + 1;

                for (int i = 0; i < indexNext; i++) {
                    newArray[i] = array[i];
                }

                for (int i = 0; i < (newArray.length - indexNext); i++) {
                    newArray[indexNext] = array[indexNext + 1];
                }
                array = newArray;
            }

            @Override
            public boolean hasNext() {
                return index < size();
            }

            @Override
            public void forEachRemaining(CollectionImpl collection) {
                while (collection.iterator().hasNext()) {
                    System.out.println(iterator().next());
                }
            }
        };
    }

    private void resize() {
        capacity += 10;
        String[] newArray = new String[capacity];
        for (int i = 0; i < length; i++)
        {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    private void moving(int index) {
        for (int j = index; j < length - 1; j ++) {
            array[j] = array[j + 1];
        }
    }
}
