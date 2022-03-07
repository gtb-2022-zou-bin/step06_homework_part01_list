package com.thw.gtb;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class App {
    public static void main(String[] args) {
    }

    public List<String> run() {
        List<String> lines = null;
        try {
            lines = Files.readAllLines(Path.of("/home/zoubin/.todo/tasks"));
            return lines;
        } catch (IOException e) {
            throw new FileReadErrorException(e.getMessage());
        }
    }
}
