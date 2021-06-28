package com.learning;

public class Main {
    public static void main(String[] args) {
        String creatingFile = Generating.GeneratingFile();
        WriteToFile.writing(creatingFile);
        ReadFile.reading(creatingFile);
    }
}
