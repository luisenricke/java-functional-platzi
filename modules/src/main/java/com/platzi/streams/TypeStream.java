package com.platzi.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TypeStream {

    public static void main(String[] args) {
        IntStream infiniteStream = IntStream.iterate(0, x -> x + 1);
        infiniteStream.limit(100)
                .parallel()
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);
        System.out.println();

        List<Integer> numbers = IntStream.iterate(0, x -> x + 2)
                .limit(200)
                .boxed()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        numbers.forEach(System.out::println);
        System.out.println();
    }
}
