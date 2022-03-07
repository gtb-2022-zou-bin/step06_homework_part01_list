package com.thw.gtb;

public class FileReadErrorException extends RuntimeException {
    private final String message;
    public FileReadErrorException(String message) {
        this.message = message;
    }
}
