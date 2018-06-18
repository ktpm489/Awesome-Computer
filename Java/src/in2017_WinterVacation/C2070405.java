package in2017_WinterVacation;

import java.util.Scanner;

public class C2070405 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;

        System.out.print("x y : ");
        x = scanner.nextInt();
        y = scanner.nextInt();

        if(50 < x && x < 100 && 50 < y && y < 100)
            System.out.println(true);
        else
            System.out.println(false);
    }
}