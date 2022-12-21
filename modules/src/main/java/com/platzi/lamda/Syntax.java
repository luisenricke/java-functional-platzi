package com.platzi.lamda;

import com.platzi.reference_operator.NameUtils;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Syntax {

    @FunctionalInterface
    interface ZeroArguments {
        Integer get();
    }

    static void useZero(ZeroArguments zeroArguments) {
    }

    static void usePredicate(Predicate<String> predicate) {
    }

    static void useBiFuntion(BiFunction<Integer, Integer, Integer> operation) {
    }

    @FunctionalInterface
    interface None {
        void none();
    }

    static void useNone(None none) {
    }

    public static void main(String[] args) {

        List<String> courses = NameUtils.getList("Java", "Ruby");
        System.out.println(" - - courses - -");
        courses.forEach(course -> System.out.println("\t" + course));
        System.out.println();

        System.out.println(" - - zeroArguments - -");
        useZero(() -> 2);
        System.out.println();

        System.out.println(" - - predicate in lambda - -");
        usePredicate(text -> text.isEmpty());
        System.out.println();

        System.out.println(" - - biFunction in lambda - -");
        useBiFuntion((x, y) -> x * y);
        useBiFuntion((x, y) -> {
            System.out.println("in biFunction, x + y  = " + (x + y) + ":: x:" + x + ", y: " + y);
            return x + y;
        });
        System.out.println();

        System.out.println(" - - none in lambda - -");
        useNone(() -> {
            System.out.println("None execution");
        });
        System.out.println();

    }
}
