package in2017;

import java.util.Arrays;

class Print {
}

public class SwitchTest {
    public static void main(String[] args) {
        Print myPrint = new Print();

        System.out.println(Arrays.toString(Print.class.getDeclaredFields()));
        System.out.println(myPrint.getClass().getSuperclass());
    }
}
