package hu.webler.service;

import java.util.Collection;
import java.util.stream.Collectors;

public class StreamExample08 {

    public static <T extends Number> Collection<T> filterAndCopyGreaterThan(Collection<T> collection, int threshold) {
        return collection.stream()
                .filter(num -> num.intValue() > threshold)
                .collect(Collectors.toList());
    }

    private StreamExample08() {

    }
}
