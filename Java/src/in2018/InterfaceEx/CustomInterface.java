package in2018.InterfaceEx;

interface Human {
    void eat();
    void work();
}

class Student implements Human {
    @Override
    public void eat() {
        System.out.println("급식을 먹어요");
    }

    @Override
    public void work() {
        System.out.println("공부를 합니다");
    }
}

class Worker implements Human {
    @Override
    public void eat() {
        System.out.println("도시락을 먹거나 식당에 가서 밥을 먹어요");
    }

    @Override
    public void work() {
        System.out.println("회사에서 일을 합니다");
    }
}
public class CustomInterface {
    public static void main(String[] args) {
        Student student = new Student();
        Worker worker = new Worker();

        student.eat();
        student.work();

        worker.eat();
        worker.work();
    }
}
