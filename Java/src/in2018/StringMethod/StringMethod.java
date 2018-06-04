package in2018.StringMethod;

public class StringMethod {
    public static void main(String[] args) {
        String str1 = "SDS Ltd";
        String str2 = "SAMSUNG";
        String ssn = "010101-1234567";
        String str3 = "바나나,딸기.오렌지 배 메론,수박 키위";
        String str4 = "송중기&이민호,소지섭-강다니엘,이홍기";
        StringBuilder result = new StringBuilder();

        System.out.println(str1.substring(4));
        System.out.println(str1.substring(0, 3));
        System.out.println(str2.concat(str1));
        System.out.println(str2.indexOf("S"));
        System.out.println(str2.lastIndexOf("S"));

        char sex = ssn.charAt(7);
        switch (sex % 2) {
            case 0:
                System.out.println("여자");
                break;
            case 1:
                System.out.println("남자");
                break;
            default:
                System.out.println("?");
                break;
        }

        System.out.println(str1.toUpperCase());
        System.out.println(str2.toLowerCase());

        System.out.println(str1.compareTo(str2));
        if (str1.compareTo(str2) > 0)
            System.out.println("SDS Ltd가 더 크다");
        else
            System.out.println("SAMSUNG이 더 크다");

        System.out.println();
        String[] arr = str4.split("[&,\\-]");
        System.out.println("분리된 문자열은");
        for (String anArr : arr)
            System.out.println(anArr);

        str3 = str3.replaceAll("[,|.]", " ");
        String[] fruit = str3.split(" ");
        int j;
        for(j = 0; j < fruit.length - 1; j++)
            result.append(fruit[j]).append(",");
        result.append(fruit[j]);
        System.out.println(result.toString());
    }
}
