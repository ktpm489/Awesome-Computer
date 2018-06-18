package in2017_WinterVacation;

public class C7080405 {
    public static void main(String[] args) {
        MyClass<String> obj1 = new MyClass<>("Hello");
        System.out.println(obj1.getVar());
        obj1.setVar("Bye");
        System.out.println(obj1.getVar());
    }
}

class MyClass<T> {
    private T var;

    MyClass(T var) {
        this.var = var;
    }

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }
}
