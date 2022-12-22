package com.platzi.streams;

import com.platzi.reference_operator.NameUtils;

import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Streams {

    static <T> Stream<T> addOperator(Stream<T> stream) {
        return stream.peek(data -> System.out.println("data: " + data));
    }

    public static void main(String[] args) {
        List<String> courses = NameUtils.getList("Java", "Angular", "Backend", "Laravel");
        System.out.println(" - - simple iteration - -");
        for (String course : courses) {
            UnaryOperator<String> newCourse = text -> text.toLowerCase() + "!";
            System.out.println(newCourse.apply(course));
        }
        System.out.println();

        Stream<String> cousesStream = Stream.of("Java", "Angular", "Backend", "Laravel");
        // Stream<Integer> cousesLenghtStream = cousesStream.map(String::length);
        // Optional<Integer> longest = cousesLenghtStream.max((x, y) -> y - x);
        Stream<String> markCourses = cousesStream.map(course -> course + "!");
        System.out.println(" - - stream - -");
        System.out.println("\t forEach");
        // markCourses.forEach(System.out::println);
        System.out.println();

        System.out.println("\t filter");
        Stream<String> javaCourses = markCourses.filter(course -> course.toLowerCase().contains("java"));
        javaCourses.forEach(System.out::println);
        System.out.println();

        System.out.println(" - - chaining stream - -");
        Stream<String> chainingStream = courses.stream();
        addOperator(
                chainingStream.map(course -> course + "!!")
                        //.filter(course -> course.toLowerCase().contains("java"))
        ).forEach(System.out::println);
    }
}
