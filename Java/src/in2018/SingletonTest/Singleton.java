package in2018.SingletonTest;

class SingletonTest {
    private static SingletonTest sgt = new SingletonTest();
    private int cnt = 0;
    private SingletonTest() {}

    static SingletonTest getInstance() {
        return sgt;
    }

    int getNextInt() {
        return cnt += 1;
    }
}

public class Singleton {
    public static void main(String[] args) {

        Singleton s = new Singleton();
        s.methodX();
        s.methodY();
    }

    private void methodX() {
        SingletonTest st = SingletonTest.getInstance();
        int count = st.getNextInt();
        System.out.println("메소드 X : " + count);
    }

    private void methodY() {
        SingletonTest st = SingletonTest.getInstance();
        int count = st.getNextInt();
        System.out.println("메소드 Y : " + count);
    }
}
