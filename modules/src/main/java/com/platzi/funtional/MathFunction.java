package com.platzi.funtional;

import java.util.function.Function;

public class MathFunction {
    public static void main(String[] args) {
        Function<Integer, Integer> squareFn = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };
        System.out.println(squareFn.apply(5));
        System.out.println(squareFn.apply(25));
        System.out.println(square(10));
        System.out.println(square(20));
    }

    static Integer square(int x) {
        return x * x;
    }
}
