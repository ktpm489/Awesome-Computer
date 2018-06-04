package in2017;

public class Test {
    public static void main(String[] args) {
        String n = "123456";

        System.out.println(ParseInt(n));

        //Integer.parseInt()
    }

    private static int ParseInt(String numStr) {
        int n = 0;
        int placeVal = 1;

        for(int i = numStr.length() - 1; i >= 0; i--){
            n += (numStr.charAt(i) - 48) * placeVal;
            placeVal *= 10;
        }

        return n;
    }
}