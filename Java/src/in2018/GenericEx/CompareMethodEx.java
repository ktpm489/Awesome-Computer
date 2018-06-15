package in2018.GenericEx;

class Pair<K, V>{
    private K key;
    private V value;

    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    K getKey() {
        return key;
    }

    void setKey(K key) {
        this.key = key;
    }

    V getValue() {
        return value;
    }

    void setValue(V value) {
        this.value = value;
    }
}

public class CompareMethodEx {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1, "사과");
        Pair<Integer, String> p2 = new Pair<>(1, "사과");
        boolean result1 = Util.compare(p1, p2);
        printResult(result1);

        Pair<String, String> p3 = new Pair<>("user1", "홍길동");
        Pair<String, String> p4 = new Pair<>("user2", "홍길동");
        boolean result2 = Util.compare(p3, p4);
        printResult(result2);

        System.out.println();
    }

    private static void printResult(boolean result) {
        if(result)
            System.out.println("논리적으로 동등한 객체입니다");
        else
            System.out.println("논리적으로 동등하지 않은 객체입니다.");
    }
}
