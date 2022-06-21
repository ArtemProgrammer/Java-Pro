public class CollectionImpl implements CustomCollection{
    private Link first;
    private Link last;
    private int size = 0;

    public CollectionImpl() {
        first = null;
        last = null;
    }

    @Override
    public boolean add(String str) {
        Link newLink = new Link(str);
        if (first == null) {
            newLink.next = null;
            newLink.last = null;
            first = newLink;
        } else {
            last.next = newLink;
            newLink.last = last;
        }
        last = newLink;
        size++;
        return true;
    }

    @Override
    public boolean addAll(CollectionImpl strColl) {
        if (strColl == null || strColl.size() == 0) {
            return false;
        }
        for (int i = 0; i < strColl.size(); i++) {
            add(strColl.get(i));
        }
        return true;
    }

    @Override
    public boolean delete(int index) {
        if (first == null || index < 0 || index > size()) {
            return false;
        }
        Link firstLink = first;
        Link lastLink = null;
        int i = -1;
        while (firstLink != null) {
            i++;
            if (i == index) {
                if (lastLink == null) {
                    first = first.next;
                } else {
                    lastLink.next = firstLink.next;
                }
            }
            lastLink = firstLink;
            firstLink = firstLink.next;
        }
        size--;
        return true;
    }

    @Override
    public boolean delete(String str) {
        Link value = first;
        int i = 0;
        while (!value.data.equals(str)) {
            i++;
            value = value.next;
        }
        delete(i);
        return true;
    }

    @Override
    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Error, incorrect index " + index);
        }
        Link getRes = first;
        for (int i = 0; i < index; i++) {
            getRes = getRes.next;
        }

        return getRes.data;
    }

    @Override
    public boolean contains(String str) {
        for (int i = 0; i < size; i++) {
            if (get(i).equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean clear() {
        first = null;
        last = null;
        size = 0;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean trim() {
        return true;
    }
}
