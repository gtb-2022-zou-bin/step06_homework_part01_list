package com.thw.gtb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskFactoryTest {
    @Test
    void should_check_completed(){
        final var compl = TaskFactory.createTask(1, "x a completed task");
        Assertions.assertTrue(compl.completed());
    }

    @Test
    void should_check_tbd(){
        final var pendingTask = TaskFactory.createTask(1, "+ a pending task");
        Assertions.assertFalse(pendingTask.completed());
    }

    @Test
    void should_print_whole_task_name(){
        final var task = TaskFactory.createTask(1, "+    foo  bar   ");
        Assertions.assertEquals("   foo  bar   ", task.getName());
    }
}