import static org.junit.jupiter.api.Assertions.*;

class CollectionImplTest {

    @org.junit.jupiter.api.Test
    void add() {
        CollectionImpl collection = new CollectionImpl();
        assertEquals(0, collection.size());
        collection.add("a");
        assertEquals(1, collection.size());
        assertEquals("a", collection.get(0));
        collection.add("b");
        assertEquals(2, collection.size());
        assertEquals("b", collection.get(1));
    }

    @org.junit.jupiter.api.Test
    void testAdd() {
        CollectionImpl collection = new CollectionImpl();
        collection.add(0, "a");
        assertEquals(1, collection.size());
        assertEquals("a", collection.get(0));
        collection.add(1, "b");
        assertEquals(2, collection.size());
        assertEquals("b", collection.get(1));
    }

    @org.junit.jupiter.api.Test
    void delete() {
        CollectionImpl collection = new CollectionImpl();
        collection.add("a");
        collection.delete("a");
        assertEquals(0, collection.size());
        collection.add("a");
        collection.add("b");
        collection.delete("a");
        assertEquals(1, collection.size());
        assertEquals("b", collection.get(0));
    }

    @org.junit.jupiter.api.Test
    void get() {
        CollectionImpl collection = new CollectionImpl();
        collection.add("a");
        assertEquals("a", collection.get(0));
        collection.add("b");
        collection.add("c");
        assertEquals("b", collection.get(1));
    }

    @org.junit.jupiter.api.Test
    void size() {
        CollectionImpl collection = new CollectionImpl();
        collection.add("a");
        assertEquals(1, collection.size());
        collection.add("b");
        assertEquals(2, collection.size());
        collection.delete("a");
        collection.delete("b");
        assertEquals(0, collection.size());
    }

    @org.junit.jupiter.api.Test
    void clear() {
        CollectionImpl collection = new CollectionImpl();
        collection.add("a");
        collection.add("b");
        assertEquals(2, collection.size());
        collection.clear();
        assertEquals(0, collection.size());
    }

    @org.junit.jupiter.api.Test
    void testEquals() {
        CollectionImpl collection = new CollectionImpl();
        collection.add("a");
        collection.add("b");
        collection.add("a");
        collection.add("b");
        assertEquals(collection.get(0), collection.get(2));
        assertEquals(collection.get(1), collection.get(3));
    }

    @org.junit.jupiter.api.Test
    void contain() {
        CollectionImpl collection = new CollectionImpl();
        collection.add("a");
        assertTrue(collection.contain("a"));
        collection.delete("a");
        assertFalse(collection.contain("a"));
    }
}