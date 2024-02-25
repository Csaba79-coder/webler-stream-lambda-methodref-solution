package hu.webler.service;

import java.util.Collection;
import java.util.stream.Collectors;

public class StreamExample06 {

    public static <T extends Number> Collection<String> squareRootElements(Collection<T> collection) {
        return collection.stream()
                .map(Number::doubleValue)
                .map(Math::sqrt)
                .map(num -> String.format("%.2f", num))
                .collect(Collectors.toList());
    }

    private StreamExample06() {

    }
}
