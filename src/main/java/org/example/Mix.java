package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Mix {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second)
    {
        List<T> firstList = first.collect(Collectors.toList());
        List<T> secondList = second.collect(Collectors.toList());

        return IntStream.range(0,Math.min(firstList.size(),secondList.size()))
                .mapToObj(i->Stream.of(firstList.get(i),secondList.get(i)))
                .flatMap(x->x);
    }
    public static void main(String[] args) {
        Stream<String> firstStream = Stream.of("Apple", "Orange", "Banana");
        Stream<String> secondStream = Stream.of("Carrot", "Beet", "Potato", "Cucumber");
        Stream<String> zippedStream = Mix.zip(firstStream, secondStream);
        zippedStream.forEach(System.out::println);
    }
}
