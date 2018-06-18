package in2017_WinterVacation;

public class C6040405 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(0, 0, 4);
        Circle circle2 = new Circle(10, 10, 4);
        Circle circle3 = new Circle(-10, -10, 5);

        System.out.println(circle1.equals(circle2));
        System.out.println(circle1.equals(circle3));
    }
}

class Circle {
    private int x;
    private int y;
    private int radius;

    Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public boolean equals(Circle obj) {
        return obj.radius == radius;
    }
}
