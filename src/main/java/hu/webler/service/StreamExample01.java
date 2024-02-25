package hu.webler.service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample01 {

    public static <T> Stream<T> createStreamFromCollection(Collection<T> collection) {
        return collection.stream();
    }

    private StreamExample01() {

    }
}
