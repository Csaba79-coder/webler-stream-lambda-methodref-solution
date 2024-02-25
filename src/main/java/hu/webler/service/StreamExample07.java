package hu.webler.service;

import java.util.Collection;
import java.util.stream.Collectors;

public class StreamExample07 {

    public static <T extends Number> Collection<T> filterAndCopy(Collection<T> nums) {
        return nums.stream()
                .filter(num -> num.intValue() % 3 == 0)
                .collect(Collectors.toList());
    }

    private StreamExample07() {

    }
}
