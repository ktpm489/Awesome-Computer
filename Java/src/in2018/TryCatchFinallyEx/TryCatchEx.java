package in2018.TryCatchFinallyEx;

public class TryCatchEx {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("java.lang.String2");
        } catch (ClassNotFoundException e) {
            System.out.println("오류^^");
            e.printStackTrace();
        }
    }
}
