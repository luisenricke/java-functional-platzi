package com.platzi.reference_operator;

import java.util.Arrays;
import java.util.List;

public class NameUtils {

    @SafeVarargs
    public static <T> List<T> getList(T... elements) {
        return Arrays.asList(elements);
    }

    public static void main(String[] args) {
        List<String> teachers = getList("Luis", "Pedro", "Neon");
        teachers.forEach(System.out::println);
    }
}
