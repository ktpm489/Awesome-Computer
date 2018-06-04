package in2018.AnnotationEx;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface PrintToString {
}

class ToStringHelper {
    static String toString(Object obj) {
        StringBuilder sb = new StringBuilder();
        Class clazz = obj.getClass();
        for (Field field : clazz.getDeclaredFields()) {
            System.out.println(field);

            if (field.isAnnotationPresent(PrintToString.class)) {
                String fieldName = field.getName();
                fieldName = "get" +
                        fieldName.substring(0, 1).toUpperCase() +
                        fieldName.substring(1);

                Method method = null;
                try {
                    method = clazz.getMethod(fieldName);
                } catch (NoSuchMethodException | SecurityException e) {
                    e.printStackTrace();
                }
                Object value = null;
                try {
                    if (method != null)
                        value = method.invoke(obj);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
                sb.append(field.getName()).append("=").append(value);
            }
        }
        return sb.toString();
    }
}

class Person {
    @PrintToString
    private String name;

    private int age;

    @PrintToString
    private String remark;

    public String toString() {
        return ToStringHelper.toString(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}

public class AnnotationEx1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("길동씨");
        person.setAge(26);
        person.setRemark("오늘은 수요일이에요 장미한송이? ^.^");
        System.out.println(person);
    }
}
