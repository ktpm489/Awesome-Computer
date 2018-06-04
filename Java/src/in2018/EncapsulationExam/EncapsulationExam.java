package in2018.EncapsulationExam;

class FuncA {
    public void calDegree() {
        System.out.println("진입각도를 계산합니다");
    }
}

class FuncB {
    public void speedDown() {
        System.out.println("속도를 줄입니다");
    }
}

class FuncC{
    public void revAnLanding() {
        System.out.println("역추진 및 착륙성공!!");
    }
}

class Control {
    FuncA fa;
    FuncB fb;
    FuncC fc;

    Control() {
        fa = new FuncA();
        fb = new FuncB();
        fc = new FuncC();
    }

    public void controlSpaceShip() {
        fa.calDegree();
        fb.speedDown();
        fc.revAnLanding();
    }
}

class Astronaut {
    public void controlShip(Control con) {
        con.controlSpaceShip();
    }
}

public class EncapsulationExam {
    public static void main(String[] args) {
        Astronaut pilot = new Astronaut();
        pilot.controlShip(new Control());
    }
}
