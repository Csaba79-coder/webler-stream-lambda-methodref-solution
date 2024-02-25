package hu.webler;

import java.util.*;
import java.util.stream.Stream;

import static hu.webler.service.StreamExample01.createStreamFromCollection;
import static hu.webler.service.StreamExample02.squareNumbers;
import static hu.webler.service.StreamExample03.sumElements;
import static hu.webler.service.StreamExample03.sumElementsMoreGeneric;
import static hu.webler.service.StreamExample05.filterEven;
import static hu.webler.service.StreamExample06.squareRootElements;
import static hu.webler.service.StreamExample07.filterAndCopy;
import static hu.webler.service.StreamExample08.filterAndCopyGreaterThan;
import static hu.webler.service.StreamExample09.filterAndCopyOddGreaterThan;
import static hu.webler.service.StreamExample10.calculateProduct;
import static hu.webler.util.Printer.*;

public class App {

    public static void main(String[] args) {

        List<Integer> nums1 = Arrays.asList(1, 2, 3, 4, 5);
        Set<Double> nums4 = new HashSet<>(Arrays.asList(1.1, 1.1, 1.1, 2.2, 3.3, 4.4, 5.5));
        List<String> words = Arrays.asList("Péter", "Roland");
        // List<Object> objects = Arrays.asList(1, 3);
        List<Number> nums2 = Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5);
        List<Integer> nums3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> nums5 = Arrays.asList(1, 0, 2, 100);

        Stream<Integer> numbers = createStreamFromCollection(nums1);
        Stream<String> names = createStreamFromCollection(words);
        Stream<Double> numbersFromSet = createStreamFromCollection(nums4);
        System.out.println("--------Task01---------");

        printElements(numbers);
        printSeparator();
        printElements(names);
        printSeparator();
        printElements(numbersFromSet);
        printSeparator();
        // Stream<Object> objs = createStreamFromCollection(objects);

        Collection<? extends Number> squaredNums1 = squareNumbers(nums1);
        Collection<? extends Number> squaredNums2 = squareNumbers(nums2);
        System.out.println("--------Task02---------");
        printElements(squaredNums1);
        printSeparator();
        printElements(squaredNums2);
        printSeparator();

        int sum1 = (int) sumElements(nums1);
        double sum2 = sumElements(nums2);
        System.out.println("--------Task03---------");
        printElement(sum1);
        printSeparator();
        printElement(sum2);
        printSeparator();
        Double sum3 = Double.valueOf(String.valueOf(sumElementsMoreGeneric(nums2)));
        printElement(sum3);
        Integer sum4 = Integer.valueOf(String.valueOf(sumElementsMoreGeneric(nums1)));
        printSeparator();
        printElement(sum4);
        printSeparator();

        System.out.println("--------Task05---------");
        Collection<Integer> evenFilteredIntegerNums = filterEven(nums1);
        Collection<Number> evenFilteredDoubleNums = filterEven(nums2);
        printElements(evenFilteredIntegerNums);
        printSeparator();
        printElements(evenFilteredDoubleNums);
        printSeparator();

        System.out.println("--------Task06---------");
        Collection<String> sqrtIntNums = squareRootElements(nums1);
        Collection<String> sqrtDoubleNums = squareRootElements(nums2);
        printElements(sqrtIntNums);
        printSeparator();
        printElements(sqrtDoubleNums);
        printSeparator();

        System.out.println("--------Task07---------");
        Collection<Integer> divisibleByThree = filterAndCopy(nums3);
        printElements(divisibleByThree);
        printSeparator();

        System.out.println("--------Task08---------");
        int givenNum = 5;
        Collection<Integer> filterGreaterThanGivenNUm = filterAndCopyGreaterThan(nums3, givenNum);
        printElements(filterGreaterThanGivenNUm);
        printSeparator();

        System.out.println("--------Task09---------");
        int givenNumber = 2;
        Collection<Integer> oddGreaterThan = filterAndCopyOddGreaterThan(nums3, givenNumber);
        printElements(oddGreaterThan);
        printSeparator();

        System.out.println("--------Task10---------");
        double product = calculateProduct(nums1);
        printElement(product);
        printSeparator();
        double productInclZero = calculateProduct(nums5);
        printElement(productInclZero);
        printSeparator();
    }
}
