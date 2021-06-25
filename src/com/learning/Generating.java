package com.learning;

import java.util.Scanner;

public class Generating {
    public static String GeneratingFile() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Digite o nome do arquivo: ");
        String archive = myObj.nextLine();
        return archive;
    }
}