package in2018.StringSpeedCheck;

public class StringSpeedCheck {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("SAMSUNG");
        String target = "SDS";

        long start = System.currentTimeMillis();

        for(int i = 0; i < 100000; i++)
            str.append(target);

        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
