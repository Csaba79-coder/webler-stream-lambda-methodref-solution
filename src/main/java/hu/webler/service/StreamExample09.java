package hu.webler.service;

import java.util.Collection;
import java.util.stream.Collectors;

public class StreamExample09 {

    public static <T extends Number> Collection<T> filterAndCopyOddGreaterThan(Collection<T> collection, int threshold) {
        return collection.stream()
                .filter(num -> num.intValue() > threshold && num.intValue() % 2 != 0)
                .collect(Collectors.toList());
    }

    private StreamExample09() {

    }
}
