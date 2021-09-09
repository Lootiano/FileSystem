package com.learning;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static String Generating() {
        Scanner MyObj = new Scanner(System.in);
        System.out.print("Digite o nome do Arquivo: ");
        String NameFile = MyObj.nextLine();
        try {
            File MyFile = new File(NameFile + ".txt");
            MyFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Um erro ocorreu!");
            e.printStackTrace();
        }
        return NameFile;
    }

    public static void WriteFile(String NameFile) {
        try {
            FileWriter WriteMyFile = new FileWriter(NameFile + ".txt");
            Scanner MyWriter = new Scanner(System.in);
            System.out.print("Escreva o que quizer no arquivo: ");
            String Writing = MyWriter.nextLine();
            WriteMyFile.write( "" + Writing);
        } catch (IOException e) {
            System.out.println("Um erro ocorreu!");
            e.printStackTrace();
        }
    }

    public static void ReadFile(String NameFile) {
        try {
            File ReadFile = new File(NameFile + ".txt");
            Scanner myReadFile = new Scanner(ReadFile);
            while (myReadFile.hasNextLine()) {
                String data = myReadFile.nextLine();
                System.out.println(data);
            }
            myReadFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ocorreu um erro.");
            e.printStackTrace();
        }
        return myReadFile;
    }

    public static void main(String[] args) {
        String NameFile = Generating();
        WriteFile(NameFile);
        ReadFile(NameFile);
    }
}