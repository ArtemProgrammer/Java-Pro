package Lesson10;

import java.util.Collection;
import java.util.HashSet;

public class WithoutDuplicate {
    public <T> Collection<T> withoutDuplicate(Collection<T> list) {
        return new HashSet<>(list);
    }
}
