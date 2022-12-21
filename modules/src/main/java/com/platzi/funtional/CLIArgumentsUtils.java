package com.platzi.funtional;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class CLIArgumentsUtils {

    static void showHelp(CLIArguments cli) {
        Consumer<CLIArguments> consumer = cliArguments -> {
            if (cliArguments.isHelp()) {
                System.out.println("Manual requested");
            }
        };

        consumer.accept(cli);
    }

    static CLIArguments generate() {
        Supplier<CLIArguments> generator = CLIArguments::new;
        return generator.get();
    }
}
