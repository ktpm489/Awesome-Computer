package in2017;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> dic = new HashMap<>();

        dic.put(1, "아기");
        dic.put(2, "사랑");
        dic.put(3, "사과");

        Set<Integer> keys = dic.keySet();
        for (Integer key : keys) {
            String value = dic.get(key);

            System.out.println("Key : " + key + " Val " + value);
        }

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("찾고 싶은 다어는 : ");
            int eng = scanner.nextInt();
            System.out.println(dic.get(eng));
        }
    }
}