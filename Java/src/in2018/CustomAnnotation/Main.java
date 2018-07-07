package in2018.CustomAnnotation;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(foo());
        bar();
        printTODOs(Main.class);
    }

    @TODO(name = "wonjun", issue = "bug in conditional statement", date = "2018-5-2")
    static int foo() {
        String operator = new Scanner(System.in).nextLine();
        if(operator == "plus")
            return 10 + 10;
        else
            return 20 - 10;
    }

    @TODO(name = "wonjun", issue = "add features", date = "2018-7-4")
    static void bar() {

    }

    static void printTODOs(Class clazz) {
        for(Method method : clazz.getDeclaredMethods()) {
            if(method.isAnnotationPresent(TODO.class)) {
                TODO todo = method.getAnnotation(TODO.class);
                String str = todo.date() + "\n" + method.toString() + ": " + todo.issue() + " by " + todo.name();
                System.out.println(str);
            }
        }
    }
}
