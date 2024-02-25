package hu.webler.service;

import java.util.Collection;
import java.util.stream.Collectors;

public class StreamExample05 {

    public static <T extends Number> Collection<T> filterEven(Collection<T> nums) {
        return nums.stream()
                .filter(num -> num.intValue() % 2 == 0)
                .collect(Collectors.toList());
    }

    private StreamExample05() {

    }
}
