package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortOdd {

    public static String oddNames(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(i -> (i+1)%2 !=0)
                .mapToObj(i->(i+1)+". "+ names.get(i))
                .collect(Collectors.joining(", "));
    }


    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "Olga", "Peter", "Maria", "John");
        String oddnames = oddNames(names);
        System.out.println(oddnames);
    }
}
