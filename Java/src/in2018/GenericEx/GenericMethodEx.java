package in2018.GenericEx;

class Box2<T> {
    private T t;

    T getT() {
        return t;
    }

    void setT(T t) {
        this.t = t;
    }
}

public class GenericMethodEx {
    public static void main(String[] args) {
        Box2<Integer> box1 = Util.boxing(100);
        int intValue = box1.getT();
        System.out.println(intValue);

        Box2<String> box2 = Util.boxing("홍길동");
        String strValue = box2.getT();
        System.out.println(strValue);
    }
}
