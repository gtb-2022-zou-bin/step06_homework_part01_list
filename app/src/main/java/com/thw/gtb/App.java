package com.thw.gtb;

import java.util.List;

public class App {
    private final ListCommand listCommand = new ListCommand();

    public static void main(String[] args) {
        new App().run().forEach(System.out::println);
    }

    public List<String> run() {
        return listCommand.listCommand();
    }

}
