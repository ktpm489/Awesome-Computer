package in2017_WinterVacation;

import java.io.IOException;
import java.io.InputStreamReader;

public class C6070405 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        try {
            while (true) {
                int c = inputStreamReader.read();
                if (c == -1)
                    break;
                stringBuffer.append((char)c);
            }
        } catch (IOException e) {
            System.out.println("Error");
        }

        System.out.println(stringBuffer.toString().split(" ").length);
    }
}
