package com.thw.gtb;

import java.util.List;

public class App {
    private final TaskRepository taskRepository = new TaskRepository();

    public static void main(String[] args) {
    }

    public List<String> run() {
        final List<String> lines = taskRepository.readLines();
        return taskRepository.loadTasks(lines);
    }
}
