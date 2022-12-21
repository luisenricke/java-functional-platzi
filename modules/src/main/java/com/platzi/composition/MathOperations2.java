package com.platzi.composition;

import java.util.function.Function;

public class MathOperations2 {

    public static void main(String[] args) {
        Function<Integer, Integer> multiplyByThree = x -> {
            System.out.println("Multiply by 3 of: " + x);
            return x * 3;
        };

        Function<Integer, Integer> addOneMultiplyByThree = multiplyByThree.compose(y -> {
            System.out.println("Add one to the result of: " + y);
            return y + 1;
        });

        Function<Integer, Integer> square = addOneMultiplyByThree.andThen(z -> {
            System.out.println("Then square: " + z);
            return z * z;
        });

        System.out.println(square.apply(10));
    }
}
