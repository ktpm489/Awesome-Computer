package in2017;

class Point {
    private int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "in2017.Point(" + x + ", " + y + ")";
    }

    boolean equals(Point obj) {
        return x == obj.x && y == obj.y;
    }
}