package in2018.InnerClass_Interface;

class A {
    private static int field2;
    private int field1;

    private static void method2(final int arg) {
        final int localVariable = 1;

        class Inner {
            void method() {
                int result = arg + localVariable;
            }
        }
    }

    private void method1(final int arg) {
        final int localVariable = 1;

        class Inner {
            void method() {
                int result = arg + localVariable;
            }
        }
    }

    class B {
        void method() {
            field1 = 10;
            method1(10);

            field2 =10;
            method2(10);
        }
    }

    static class C {
        void method() {

            //field1 = 10; => X
            //method1();  => X

            field2 = 10;
            method2(10);
        }
    }
}

public class LocalClass {
    public static void main(String[] args) {

    }
}
