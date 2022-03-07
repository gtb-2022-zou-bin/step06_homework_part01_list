package com.thw.gtb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class AppTest {
    @Test
    void should_print_all_lines_in_file(){      // step02
        final var result = new App().run();
        Assertions.assertEquals(
                List.of("# To be done", "1 task 01", "2 task 02"),
                result
        );
    }
}
