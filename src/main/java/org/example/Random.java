package org.example;

import java.util.stream.Stream;

public class Random {
    public static Stream<Long> randomNumbers(long seed ,long a , long c , long m)
    {
        return Stream.iterate(seed,x->(a * x+c)%m);
    }
    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11;
        long m = (long) Math.pow(2,48);
        long seed = System.currentTimeMillis() % m;
        Stream<Long> randomStream = randomNumbers(seed, a, c, m);
        randomStream.limit(10)
                .forEach(System.out::println);
    }
}
