package in2017_WinterVacation;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class C8040405 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("FileName : ");
        String text1 = scanner.next();
        System.out.print("FileName : ");
        String text2 = scanner.next();

        try {
            FileWriter fileWriter = new FileWriter("./" + text1, true);
            FileReader fileReader = new FileReader("./" + text2);
            int c;

            while((c = fileReader.read()) != -1)
                fileWriter.write((char) c);

            fileWriter.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

        System.out.println("Success");
    }
}
