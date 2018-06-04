package in2018.StringTokenizerEx;

import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args) {
        String text = "송중기/소지섭/김연아";

        StringTokenizer st = new StringTokenizer(text, "/");
        int countTokens = st.countTokens();
        for (int i = 0; i < countTokens; i++)
            System.out.println(st.nextToken());

        System.out.println();

        st = new StringTokenizer(text, "/");
        while (st.hasMoreTokens())
            System.out.println(st.nextToken());
    }
}
