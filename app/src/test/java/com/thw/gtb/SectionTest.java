package com.thw.gtb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SectionTest {
    @Test
    void should_print_Empty_when_task_is_empty(){
        final List<String> tbd = Section.tbd().format(Collections.emptyList());
        Assertions.assertEquals(
                List.of(
                        "# To be done",
                        "Empty"
                ), tbd);
        final List<String> completed = Section.completed().format(Collections.emptyList());
        Assertions.assertEquals(
                List.of(
                        "# Completed",
                        "Empty"
                ), completed);
    }
}