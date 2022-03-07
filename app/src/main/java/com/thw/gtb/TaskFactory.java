package com.thw.gtb;

public class TaskFactory {
    private TaskFactory() {
    }

    static Task createTask(int id, String line) {
        final var fields = line.split(" ", 2);
        final var isCompleted = fields[0].equals("x");
        final var name = fields[1];
        return new Task(id, name, isCompleted);
    }
}