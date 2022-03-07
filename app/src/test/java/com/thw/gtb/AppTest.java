package com.thw.gtb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void should_print_all_lines_in_file(){
        final var result = new App().run();
        Assertions.assertEquals(
                List.of("task 01", "task 02"),
                result
        );
    }
}
