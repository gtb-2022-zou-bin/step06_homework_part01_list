package com.thw.gtb;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public TaskRepository() {
    }

    List<String> loadTasks(List<String> lines) {
        final List<String> tasks = new ArrayList<>();
        tasks.add("# To be done");
        for (int i = 0; i < lines.size(); ++i) {
            final var task = lines.get(i);
            final var id = i + 1;
            tasks.add(String.format("%d %s", id, task));
        }
        return tasks;
    }

    List<String> readLines() {
        try {
            return Files.readAllLines(Path.of(Constant.USER_HOME, Constant.TASK_HOME, Constant.TASK_CONFIG));
        } catch (IOException e) {
            throw new FileReadErrorException(e.getMessage());
        }
    }
}