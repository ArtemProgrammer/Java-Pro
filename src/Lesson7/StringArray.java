public class StringArray {
    private int capacity = 10;
    private int length = 0;
    private String[] array = new String[capacity];

    void print() {
        System.out.println("Elements of the array: ");
        if (length == 0) {
            System.out.println("Array is empty!");
        }
        else {
            for (int i = 0; i < length; i++) {
                System.out.println("Index " + i +" = " + array[i] + "\t");
            }
            System.out.println();
        }
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

    public boolean add(String value) {
        if (length >= capacity) {
            resize();
            array[length] = value;
            length++;
        }
        else if (length < capacity) {
            array[length] = value;
            length++;
        }
        return true;
    }

    public boolean add(int index, String value) {
        if (index > length) {
            return false;
        }
        else {
            if (length >= capacity) {
                resize();
                length++;
                for (int i = length; i > index; i--) {
                    array[i] = array[i - 1];
                }
                array[index] = value;
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

    public boolean delete(String value) {
        if (length <= 0) {
            return false;
        }
        else {
            for (int i = 0; i < length; i++) {
                if (array[i] == value) {
                    length--;
                    array[i] = array[i + 1];
                    for (int j = i + 1; j < length; j++) {
                        array[j] = array[j + 1];
                    }
                }
            }
            return true;
        }
    }

    public boolean delete(int index) {
        if (length <= 0) {
            return false;
        }
        else {
            length--;
            array[index] = array[index + 1];
            for (int i = index + 1; i < length; i++) {
                array[i] = array[i + 1];
            }
            return true;
        }
    }

    public String get(int index) {
        return array[index];
    }

    public int getCapacity() {
        return capacity;
    }

    public int getLength() {
        return length;
    }
}
