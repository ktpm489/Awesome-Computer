package in2018.GenericEx;

import java.util.Arrays;

class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }
}

class Course<T> {
    private String name;
    private T[] students;

    Course(String name, int capacity) {
        this.name = name;
        students = (T[]) (new Object[capacity]);
    }

    public String getName() {
        return name;
    }

    T[] getStudents() {
        return students;
    }

    public void add(T t) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = t;
                break;
            }
        }
    }
}

class Student extends Person {
    Student(String name) {
        super(name);
    }
}

class Worker extends Person {
    Worker(String name) {
        super(name);
    }
}

class HighStudent extends Student {
    HighStudent(String name) {
        super(name);
    }
}

public class WildCardEx {
    private static void registerCourse (Course<?> course) {
        System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
    }

    private static void registerCourseStudent(Course<? extends Student> course) {
        System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
    }

    private static void registerCourseWorker(Course<? super Worker> course) {
        System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
    }

    public static void main(String[] args) {
        Course<Person> personCourse = new Course<>("일반인과정", 5);
        personCourse.add(new Person("일반인"));
        personCourse.add(new Worker("직장인"));
        personCourse.add(new Student("학생"));
        personCourse.add(new HighStudent("고등학생"));

        Course<Worker> workerCourse = new Course<>("직장인", 5);
        workerCourse.add(new Worker("직장인"));

        Course<Student> studentCourse = new Course<>("학생과정", 5);
        studentCourse.add(new Student("학생"));
        studentCourse.add(new HighStudent("고등학생"));

        Course<HighStudent> highStudentCourse = new Course<>("학생과정", 5);
        highStudentCourse.add(new HighStudent("고등학생"));

        registerCourse(personCourse);
        registerCourse(workerCourse);
        registerCourse(studentCourse);
        registerCourse(highStudentCourse);
        System.out.println();

        registerCourseStudent(studentCourse);
        registerCourseStudent(highStudentCourse);
        System.out.println();

        registerCourseWorker(personCourse);
        registerCourseWorker(workerCourse);
    }
}
