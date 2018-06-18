package in2017_WinterVacation;

import java.util.Scanner;

public class C5020405 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.print("두 정수와 연산자를 입력하시오 >> ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        switch (scanner.nextLine()) {
            case " +":
                Add add = new Add();
                add.setValue(a, b);
                System.out.println(add.calculate() + "");
                break;
            case " -":
                Sub sub = new Sub();
                sub.setValue(a, b);
                System.out.println(sub.calculate() + "");
                break;
            case " *":
                Mul mul = new Mul();
                mul.setValue(a, b);
                System.out.println(mul.calculate() + "");
                break;
            case " /":
                Div div = new Div();
                div.setValue(a, b);
                System.out.println(div.calculate() + "");
                break;
        }
    }
}

abstract class Calc {
    int a, b;

    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    abstract int calculate();
}

class Add extends Calc {
    @Override
    int calculate() {
        return a + b;
    }
}

class Sub extends Calc {
    @Override
    int calculate() {
        return a - b;
    }
}

class Mul extends Calc {
    @Override
    int calculate() {
        return a * b;
    }
}

class Div extends Calc {
    @Override
    int calculate() {
        return a / b;
    }
}