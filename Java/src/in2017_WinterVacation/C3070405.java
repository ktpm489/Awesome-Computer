package in2017_WinterVacation;

public class C3070405 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = (int) Math.round(Math.random() * 9 + 1);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
