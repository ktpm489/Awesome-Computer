package in2017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DataStructure {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        HashSet<Integer> integerHashSet = new HashSet<>();
        HashMap<String, Integer> integerHashMap = new HashMap<>();

        integerHashSet.add(10);
        integerHashSet.add(20);
        System.out.println(integerHashSet);

        integerArrayList.add(10);
        integerArrayList.add(20);
        System.out.println(integerArrayList);
        integerArrayList.remove(0);
        System.out.println(integerArrayList);

        integerHashMap.put("Hello", 1);
        System.out.println(integerHashMap.get("Hello"));
        System.out.println(integerHashMap.keySet());
        System.out.println("key : Hello, code : " + "Hello".hashCode());
        System.out.println();
    }
}