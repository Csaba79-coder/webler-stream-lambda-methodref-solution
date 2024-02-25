package hu.webler.service;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Collection;
import java.util.Locale;
import java.util.stream.Collectors;

import static hu.webler.util.DecimalFormatHelper.createDecimalFormat;

public class StreamExample02 {

    public static Collection<? extends Number> squareNumbers(Collection<? extends Number> nums) {
        boolean isFloatingPoint = false;

        // Check if the collection contains floating-point numbers
        for(Number num : nums) {
            if (num instanceof Double || num instanceof Float) {
                isFloatingPoint = true;
                break;
            }
        }

        // Square the numbers accordingly
        if (isFloatingPoint) {
            DecimalFormat df = createDecimalFormat();
            return nums.stream()
                    .map(num -> Double.parseDouble(df.format(Math.pow(num.doubleValue(), 2))))
                    .collect(Collectors.toList());
        } else {
            return nums.stream()
                    .map(num -> num.intValue() * num.intValue())
                    .collect(Collectors.toList());
        }
    }

    private StreamExample02() {

    }
}
