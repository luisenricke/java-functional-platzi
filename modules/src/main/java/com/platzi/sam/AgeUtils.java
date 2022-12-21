package com.platzi.sam;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;

public class AgeUtils {

    @FunctionalInterface
    interface TriFunction<T, U, V, R> {
        R apply(T t, U u, V v);
    }

    public static void main(String[] args) {
        Function<Integer, String> addZeros = x -> x < 10 ? "0" + x : String.valueOf(x);

        TriFunction<Integer, Integer, Integer, LocalDate> parseDate = (day, month, year) ->
                LocalDate.parse(year + "-" + addZeros.apply(month) + "-" + addZeros.apply(day));

        TriFunction<Integer, Integer, Integer, Integer> calculate = (day, month, year) ->
                Period.between( parseDate.apply(day, month, year), LocalDate.now())
                        .getYears();

        System.out.println(" - - calculate age - -");
        System.out.println("\t now: " + LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println("\t age 1");
        System.out.println("\t\t normal 1-2-1995: " + calculate.apply(1, 2, 1995));
        System.out.println();
    }

}
