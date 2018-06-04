package in2017;

public class ClassProperties {
    public static void main(String[] args) {
        boolean b = Boolean.TRUE;
        Point p = new Point(2, 3);
        Point p2 = new Point(2, 3);

        System.out.println(p.getClass() instanceof Object);
        System.out.println(p.getClass() instanceof Class);
        System.out.println(Point.class.toString());
        System.out.println(p.getClass().getName());
        System.out.println(p.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p);
        System.out.println(p.toString());
        System.out.println(p.equals(p2));
        System.out.println("Hello".equals("Hello"));

        //p == p.toString();
    }
}