package com.platzi.funtional;

import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public class StringFunction {

    public static void main(String[] args) {
        UnaryOperator<String> convertQuote = text -> "\"" + text + "\"";
        String quote1 = "Transform to quote text";
        System.out.println(" - - quotes - -");
        System.out.println("\t quote 1");
        System.out.println("\t\t normal: " + quote1);
        System.out.println("\t\t transform: " + convertQuote.apply(quote1));
        System.out.println();

        UnaryOperator<String> addMark = text -> text + "!";
        String mark1 = "Add mark to the end";
        System.out.println(" - - mark - -");
        System.out.println("\t mark 1");
        System.out.println("\t\t normal: " + mark1);
        System.out.println("\t\t transform: " + addMark.apply(mark1));
        System.out.println();

        BiFunction<Integer, Integer, Integer> multiply = (x, y) -> x * y;
        System.out.println(" - - multiply - -");
        System.out.println("\t multiply 1: 5 x 4 = " + multiply.apply(5, 4));
        System.out.println("\t multiply 2: 4 x 5 = " + multiply.apply(4, 5));
        System.out.println();

        BiFunction<String, Integer, String> leftPad = (text, spaces) -> String.format("%" + spaces + "s", text);
        System.out.println(" - - leftPad - -");
        System.out.println("\t leftPad 1: (test, 1) -> " + leftPad.apply("test", 1));
        System.out.println("\t leftPad 2: (test, 10) -> " + leftPad.apply("test", 10));
        System.out.println();
    }
}
