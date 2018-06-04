package in2018.AnnotationEx;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface PrintAnnotation{
    String value() default "-";
    int number() default 15;
}

class Service {
    @PrintAnnotation
    void method1() {
        System.out.println("실행내용1");
    }

    @PrintAnnotation("*")
    void method2() {
        System.out.println("실행내용2");
    }

    @PrintAnnotation(value="#", number = 20)
    void method3() {
        System.out.println("실행내용3");
    }
}

public class AnnotationEx2 {
    public static void main(String[] args) {
        Method[] declaredMethods = Service.class.getDeclaredMethods();

        for(Method method : declaredMethods) {
            if(method.isAnnotationPresent(PrintAnnotation.class)) {
                PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

                System.out.println("[" + method.getName() + "] ");
                for(int i = 0; i < printAnnotation.number(); i++)
                    System.out.print(printAnnotation.value());
                System.out.println();

                try {
                    method.invoke(new Service());
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
                System.out.println();
            }
        }
    }
}
