package in2018.ByteToStringEx;

import java.io.IOException;

public class ByteToStringEx {
    public static void main(String[] args) throws IOException {
        byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};

        String str1 = new String(bytes);
        System.out.println(str1);

        String str2 = new String(bytes, 6, 4);
        System.out.println(str2);

        byte[] bytes2 = new byte[100];

        System.out.print("입력: ");
        int readByteNo = System.in.read(bytes2);

        String str = new String(bytes2, 0, readByteNo - 1);
        System.out.println(str);
    }
}
