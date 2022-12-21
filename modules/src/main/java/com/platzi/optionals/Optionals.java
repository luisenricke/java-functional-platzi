package com.platzi.optionals;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Optionals {
    // without optionals
    static List<String> getNames() {
        List<String> list = new LinkedList<>();

        return Collections.emptyList();
    }

    static String mostValuablePlayer() {
        // return "";
        return null;
    }

    static int mostExpensiveItem() {
        return -1;
    }

    // with optionals
    static Optional<List<String>> getOptionalNames() {
        List<String> names = new LinkedList<>();
        // request names
        return Optional.of(names);
    }

    static Optional<String> optionalValuablePlayer() {
        //return Optional.ofNullable();
        try {
            return Optional.of("random");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Optional.empty();
    }

    public static void main(String[] args) {
        List<String> names = getNames();
        if (names != null) {
            // some logic
        }

        Optional<List<String>> optionalNames = getOptionalNames();
        if (optionalNames.isPresent()) {
            // some logic
        }

        optionalNames.ifPresent(namesValue -> namesValue.forEach(System.out::println));

        Optional<String> valuablePlayer = optionalValuablePlayer();
        String valuablePlayerName = valuablePlayer.orElseGet(() -> "Not player");
        System.out.println(valuablePlayerName);
    }
}
