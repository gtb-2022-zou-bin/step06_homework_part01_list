package com.thw.gtb;

import java.util.ArrayList;
import java.util.List;

public class ListCommand {
    final TaskRepository taskRepository = new TaskRepository();

    public ListCommand() {
    }

    List<String> listCommand() {
        final var tasks = taskRepository.loadTasks();
        final List<String> result = new ArrayList<>();
        result.addAll(Section.tbd().format(tasks));
        result.addAll(Section.completed().format(tasks));
        return result;
    }
}