package in2017_WinterVacation;

import java.util.HashMap;
import java.util.Scanner;

public class C7090405 {
    public static void main(String[] args) {
        HashMap<String, Student> dept = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        String name, major, classNum;
        int score;

        for (int i = 0; i < 5; i++) {
            System.out.print("Name: ");
            name = scanner.nextLine();
            System.out.print("Major: ");
            major = scanner.nextLine();
            System.out.print("Class Number: ");
            classNum = scanner.nextLine();
            System.out.print("Score: ");
            score = scanner.nextInt();
            scanner.nextLine();

            dept.put(classNum, new Student(name, major, classNum, score));
        }

        System.out.println();

        Student tmp;
        for(int i = 0; i < 5; i++) {
            System.out.print("ClassNum: ");
            classNum = scanner.nextLine();

            tmp = dept.get(classNum);

            System.out.println(tmp.getName());
            System.out.println(tmp.getClassNum());
            System.out.println(tmp.getMajor());
            System.out.println(tmp.getScore());
        }
    }
}

class Student {
    private String name;
    private String major;
    private String classNum;
    private int score;

    Student(String name, String major, String classNum, int score) {
        this.name = name;
        this.major = major;
        this.classNum = classNum;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public String getClassNum() {
        return classNum;
    }

    public int getScore() {
        return score;
    }
}