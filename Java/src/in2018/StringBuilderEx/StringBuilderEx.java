package in2018.StringBuilderEx;

public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder sa = new StringBuilder("Daedeok");
        StringBuilder sb = new StringBuilder();

        sa.append(" software");
        sa.append(" meister").append(" High School ");
        System.out.println(sa);

        sa.insert(sa.length(), "grade").append('2');
        System.out.println(sa);

        sb.append("Java ");
        sb.append("Program Study");
        System.out.println(sb.toString());

        sb.insert(4, "2");
        System.out.println(sb.toString());

        sb.setCharAt(4, '6');
        System.out.println(sb.toString());

        sb.replace(6, 13, "Book");
        System.out.println(sb.toString());

        int length = sb.length();
        System.out.println("총문자수: " + length);
        String result = sb.toString();
        System.out.println(result);
    }
}
