package in2017;

abstract class Calc {
    public abstract int add(int a, int b);

    public abstract int subtract(int a, int b);

    public abstract double average(double[] a);
}

class CalcMethod extends Calc{
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public double average(double[] a) {
        double sum = 0;

        for (double e : a)
            sum += e;

        return sum / a.length;
    }
}

public class Abstract extends CalcMethod {

    public static void main(String[] args) {
        double[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Calc c = new Abstract();

        System.out.println(c.add(1, 3));
        System.out.println(c.subtract(1, 3));
        System.out.println(c.average(arr));
    }
}
