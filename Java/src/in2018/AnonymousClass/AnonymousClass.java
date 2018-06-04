package in2018.AnonymousClass;

class Person {
    void wake() {
        System.out.println("7시에 일어납니다");
    }
}

class Anonymous {
    Person field = new Person() {
        void work() {
            System.out.println("출근합니다");
        }

        @Override
        void wake() {
            System.out.println("6시에 일어납니다");
            work();
        }
    };

    void method() {
        Person localvar = new Person() {
            void walk() {
                System.out.println("산책합니다.");
            }

            @Override
            void wake() {
                super.wake();
                walk();
            }
        };
        localvar.wake();
    }

    void method2(Person person) {
        person.wake();
    }
}

public class AnonymousClass {
    public static void main(String[] args) {
        Anonymous anony = new Anonymous();

        anony.field.wake();
        anony.method();
        anony.method2(new Person() {
            @Override
            void wake() {
                System.out.println("8시에 일어납니다");
                study();
            }
            void study() {
                System.out.println("공부합니다.");
            }
        });
    }
}
