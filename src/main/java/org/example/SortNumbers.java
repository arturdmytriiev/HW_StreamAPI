package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {
    public static String sortNumbers(String [] numbers)
    {
        return Arrays.stream(numbers)
                .flatMap(number -> Arrays.stream(number.split(", ")))
                .map(Integer::parseInt)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }
    public static void main(String[] args) {
        String [] numbers = {"1, 2, 0", "4, 5"};
        String sortedNumbers = sortNumbers(numbers);
        System.out.println(sortedNumbers);
    }
}
