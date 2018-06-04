package in2018.VariableArr;

public class VariableArr {
    public static void main(String[] args) {
        int[][] myArrays = new int[3][];
        myArrays[0] = new int[]{1, 2, 3};
        myArrays[1] = new int[]{5, 4, 3, 2, 1};
        myArrays[2] = new int[]{11, 22};

        for (int[] myArray : myArrays) {
            for (int aMyArray : myArray)
                System.out.printf("%5d", aMyArray);
            System.out.println();
        }
    }
}
