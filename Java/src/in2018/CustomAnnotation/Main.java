package in2018.CustomAnnotation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(foo());
    }

    @TODO(name = "wonjun", issue = "bug in conditional statement", date = "2018-5-2")
    private static int foo() {
        String operator = new Scanner(System.in).nextLine();
        if(operator == "plus")
            return 10 + 10;
        else
            return 20 - 10;
    }
}
