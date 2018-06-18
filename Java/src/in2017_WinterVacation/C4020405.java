package in2017_WinterVacation;

public class C4020405 {

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Rectangle s = new Rectangle(1, 1, 2, 3);

        r.show();
        s.show();
        System.out.println(s.square());
        r.set(-2, 2, -1, 4);
        r.show();
        System.out.println(r.square());
        if (r.equals(s))
            System.out.println("두 사각형은 같습니다.");
    }
}

class Rectangle {
    private int x1, y1, x2, y2;

    Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    Rectangle() {

    }

    void set(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    int square(){
        return (x2 - x1) * (y2 - y1);
    }

    void show() {
        System.out.println("Area : " + square() + ", Coordinate : (" + x1 + "," + y1 + "), ("+ x2 + "," + y2 + ")");
    }

    public boolean equals(Rectangle obj) {
        return obj.x1 == x1 && obj.y1 == y1 && obj.x2 == x2 && obj.y2 == y2;
    }
}
