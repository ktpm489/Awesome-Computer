package in2018.ArrayCreateByValueListEx2;

public class ArrayCreateByValueListEx2 {
    public static void main(String[] args) {
        int[] scores = {83, 90, 87};

        int sum1 = 0;
        for (int score : scores) sum1 += score;
        System.out.println("총합: " + sum1);

        System.out.println("총합: " + add(new int[] {83, 90, 87}));
    }

    public static int add(int[] scores) {
        int sum = 0;
        for (int score : scores) sum += score;
        return sum;
    }
}
