package in2018.InstanceOfEx;

import java.util.ArrayList;

interface Mark {

}

class Data1 implements Mark {
    private String name;
    private int age;

    Data1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Data1 [name=" + name + ", age=" + age + "]";
    }
}

class Data2 {
    private String name;
    private int age;

    Data2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Data2 [name=" + name + ", age=" + age + "]";
    }
}

class InputCheck {
    static void check(ArrayList<Mark> arrayList, Object data) {
        if (data instanceof Mark) {
            var d1 = (Data1) data;
            arrayList.add(d1);
        } else
            System.out.println("Data2 클래스는 입력이 되지 않습니다");
    }
}

public class MarkInterface {
    public static void main(String[] args) {
        var box = new ArrayList<Mark>();

        var d1 = new Data1("Jhon", 27);
        var d2 = new Data2("Jane", 24);

        InputCheck.check(box, d1);
        InputCheck.check(box, d2);

        for (var mark : box) {
            System.out.println(mark);
        }
    }
}
