package in2017;

import java.util.Vector;

public class PointVectorEx {
    public static void main(String[] args) {
        Vector<Point> vector = new Vector<>();

        vector.add(new Point(2, 3));
        vector.add(new Point(-5, 20));
        vector.add(new Point(30, 28));

        for (Point aVector : vector)
            System.out.println(aVector);
    }
}
