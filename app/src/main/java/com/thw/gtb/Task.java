package com.thw.gtb;

public record Task(Integer id, String name, boolean completed) {

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public boolean completed() {
        return completed;
    }

    String format() {
        return String.format("%d %s", this.getId(), this.getName());
    }
}