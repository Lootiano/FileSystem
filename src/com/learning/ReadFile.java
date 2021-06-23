package com.learning;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void reading() {
        try {
            String archive = Generating.GeneratingFile();
            File myObj = new File( archive + ".txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println("Palavras adicionadas: (" + data + "), no arquivo: [" + myObj.getName() + "].");
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error ocurred.");
            e.printStackTrace();
        }
    }
}
