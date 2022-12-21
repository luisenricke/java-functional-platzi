package com.platzi.funtional;

import java.util.function.Function;
import java.util.function.Predicate;

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
        System.out.println();

        Function<Integer, Boolean> isOdd = x -> x % 2 == 1;
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println("Is even 4? " + isEven.test(4));
        System.out.println();

        Predicate<Student> isApproved = student -> student.score >= 6;
        System.out.println("Is approved the student 1? " + isApproved.test(new Student(5d)));
        System.out.println("Is approved the student 2? " + isApproved.test(new Student(8.6d)));
        System.out.println();
    }

    static class Student {
        Double score;

        public Student(Double score) {
            this.score = score;
        }

        public Double getScore() {
            return score;
        }
    }

    static Integer square(int x) {
        return x * x;
    }
}
