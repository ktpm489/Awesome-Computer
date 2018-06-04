package in2017;

import java.util.Iterator;
import java.util.Vector;

public class IteratorTest {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        v.add(5);
        v.add(4);
        v.add(-1);
        v.add(2, 100);

        Iterator<Integer> it = v.iterator();
        int sum = 0;

        while (it.hasNext()) {
            int n = it.next();
            System.out.println(n);
            sum += n;
        }

        System.out.println("정수의 합 : " + sum);
    }
}
