package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ToUpperCase {
    public static String toUpperCase(List<String> names) {
        return names.stream()
                .map(name -> name.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(", "));
    }
    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "Olga", "Peter", "Maria", "John");
        String sortedNames = toUpperCase(names);
        System.out.println(sortedNames);
    }
}
