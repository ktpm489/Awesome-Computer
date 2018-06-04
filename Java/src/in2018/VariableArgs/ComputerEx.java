package in2018.VariableArgs;

public class ComputerEx {
    public static void main(String[] args) {
        Computer computer = new Computer();

        int[] values = {1, 2, 3};
        System.out.println("result1: " + computer.sum1(values));

        System.out.println("result2: " + computer.sum1(new int[]{1, 2, 3, 4, 5}));

        System.out.println("result3: " + computer.sum2(1, 2, 3));

        System.out.println("result4: " + computer.sum2(1, 2, 3, 4, 5));
    }
}
