package com.learning;

public class Main {
    public static void main(String[] args) {
        String pathName = Generating.GeneratingFile();
        WriteToFile.writing(pathName);
        ReadFile.reading(pathName);
    }
}
