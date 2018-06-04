package in2018.AnnotationEx;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface maker {
    int num();
    String name();
    String id();
    String date() default "2018-01-01";
}

@maker(id = "111", num = 1, name = "Dominica")
public class AnnotationEx3 {
    public static void main(String[] args) {
        for(Annotation a : AnnotationEx3.class.getAnnotations())
            System.out.println(a);

        System.out.println("String 생성자");
        for(Constructor c : String.class.getConstructors())
            System.out.println(c);

        System.out.println("String 메서드");
        for(Method m : String.class.getMethods())
            System.out.println(m);

        System.out.println("String 필드");
        for(Field f : String.class.getFields())
            System.out.println(f);
    }
}
