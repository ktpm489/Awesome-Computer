package in2018.InnerClass_Interface;

class Outter {
    private String field = "Outter-field1";

    private void method() {
        System.out.println("Outter-Method");
    }

    class Nested {
        String field = "Nested-field1";

        void method() {
            System.out.println("Nested-Method");
        }

        void print() {
            System.out.println(this.field);
            this.method();
            System.out.println(Outter.this.field);
            Outter.this.method();
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        Outter.Nested nested = new Outter().new Nested();
        nested.print();
    }
}
