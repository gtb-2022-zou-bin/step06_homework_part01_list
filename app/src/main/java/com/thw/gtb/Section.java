package com.thw.gtb;

import java.util.ArrayList;
import java.util.List;

public record Section(String title, boolean flag) {

    public static Section tbd(){
        return new Section(Constant.TO_BE_DONE, Constant.FLAG_TO_BE_DONE);
    }

    public static Section completed(){
        return new Section(Constant.COMPLETED, Constant.FLAG_COMPLETED);
    }

    public List<String> format(List<Task> tasks) {
        final List<String> result = new ArrayList<>();
        result.add(title());
        tasks.stream().filter(task -> flag() == task.completed())
                .map(Task::format)
                .forEach(result::add);
        if (result.size() == 1) {
            result.add("Empty");
        }
        return result;
    }
}