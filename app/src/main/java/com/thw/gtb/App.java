package com.thw.gtb;

import java.util.ArrayList;
import java.util.List;

public class App {
    private final TaskRepository taskRepository = new TaskRepository();

    public static void main(String[] args) {
    }

    public List<String> run() {
        final var tasks = taskRepository.loadTasks();
        final List<String> result = new ArrayList<>();
        result.addAll(Section.tdb().format(tasks));
        result.addAll(Section.completed().format(tasks));
        return result;
    }

}
