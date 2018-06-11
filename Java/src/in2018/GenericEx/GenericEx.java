package in2018.GenericEx;

class Box<T> {
    private T object;

    void set(T object) {
        this.object = object;
    }

    T get() {
        return object;
    }
}

public class GenericEx {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.set("hello");
        String str = box1.get();

        Box<Integer> box2 = new Box<>();
        box2.set(6);
        int value = box2.get();

        System.out.println("box1: " + str + " box2: " + value);
    }
}
