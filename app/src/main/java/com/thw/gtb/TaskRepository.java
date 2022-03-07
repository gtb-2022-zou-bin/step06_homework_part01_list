package com.thw.gtb;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    public TaskRepository() {
    }

    List<Task> loadTasks() {
        final List<String> lines = readLines();
        final List<Task> tasks = new ArrayList<>();
        for (int i = 0; i < lines.size(); ++i) {
            tasks.add(TaskFactory.createTask(i + 1, lines.get(i)));
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