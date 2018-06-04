package in2017;

import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        vector.add(5);
        vector.add(4);
        vector.add(-1);

        vector.add(2, 100);

        System.out.println("벡터 내의 요소 객체 수 : " + vector.size());
        System.out.println("벡터의 현재 용량 : " + vector.capacity());

        for (Integer aVector : vector)
            System.out.print(aVector + " ");
        System.out.println();

        int sum = 0;
        for (Integer aVector : vector)
            sum += aVector;

        System.out.println("벡터에 있는 정수 합 : " + sum);
    }
}