package in2017;

import java.util.HashMap;
import java.util.Set;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<>();

        map.put("황기태", new Student(1, "010-111-1111"));
        map.put("한원선", new Student(2, "010-222-2222"));
        map.put("이명희", new Student(3, "010-333-3333"));

        System.out.println("HashMap's Size: " + map.size());

        Set<String> names = map.keySet();

        for (String name : names) {
            Student student = map.get(name);
            System.out.println("이름 : " + name + " 번호 : " + student.getId() + " 전화번호 : " + student.getPhoneNumber());
        }
    }
}

class Student {
    private int id;
    private String phoneNumber;

    Student(int id, String phoneNumber) {
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
