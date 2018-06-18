package in2017_WinterVacation;

import java.util.Scanner;

public class C3050405 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            System.out.print("Number : ");
            arr[i] = scanner.nextInt();
            if(arr[i] % 3 == 0)
                System.out.println(arr[i]);
        }
    }
}
