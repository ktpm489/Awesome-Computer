package in2017_WinterVacation;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class C8060405 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileReader fileReader;

        System.out.print("FIle Name : ");
        try {
            fileReader = new FileReader(scanner.next());

            int c;
            for (int i = 1; (c = fileReader.read()) != -1; i++) {
                System.out.print("\n" + i + " ");
                do System.out.print((char) c);
                while ((c = fileReader.read()) != 10);
            }
        } catch (IOException e) {
            System.out.println("Wrong Input");
        }
        System.out.println("\n");
    }
}
