package hu.webler.service;

import java.util.Collection;

public class StreamExample10 {

    public static <T extends Number> double calculateProduct(Collection<T> collection) {
        return collection.stream()
                .mapToDouble(Number::doubleValue)
                .reduce(1, (a, b) -> a * b);
    }

    private StreamExample10() {

    }
}
