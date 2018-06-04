package in2018.ArrayCopyEx;

import java.util.Arrays;

public class ArrayCopyEx {
    public static void main(String[] args) {
        //얕은복사는 주소를 복사
        //깊은복사는 값을 복사
        char[] arr1 = {'I', 'A', 'M', 'H', 'A', 'P', 'P', 'Y'};

        //깊은복사
        char[] arr2 = Arrays.copyOf(arr1, arr1.length);
        System.out.println(Arrays.toString(arr2));

        //깊은복사
        char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
        System.out.println(Arrays.toString(arr3));

        //깊은복사
        char[] arr4 = new char[arr1.length];
        System.arraycopy(arr1, 0, arr4, 0, arr1.length);
        for(int i = 0;i < arr4.length; i++)
            System.out.println("arr4[" + i + "]=" + arr4[i]);
    }
}
