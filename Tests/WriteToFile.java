import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
    public static void writing() {
        Scanner myObj = new Scanner(System.in);
        try {
            FileWriter myWriter = new FileWriter(".txt");
            System.out.println("Escreva o que você deseja: ");
            myWriter.write(myObj.nextLine());
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error ocurred.");
            e.printStackTrace();
        }
    }
}
