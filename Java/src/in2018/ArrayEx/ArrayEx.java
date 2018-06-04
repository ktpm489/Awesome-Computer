package in2018.ArrayEx;

import java.util.Scanner;

public class ArrayEx {
    public static void main(String[] args) {
        boolean run = true;
        int studentNum;
        int[] scores = null;

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("----------------------------------------");
            System.out.println("1.학생수 / 2.점수입력 / 3.점수리스트 / 4.분석 / 5.종료");

            switch (scanner.nextInt()) {
                case 1:
                    System.out.print("학생수> ");
                    studentNum = scanner.nextInt();
                    scores = new int[studentNum];
                    break;
                case 2:
                    if (scores != null)
                        for (int i = 0; i < scores.length; i++) {
                            System.out.printf("scores[%d]> ", i);
                            scores[i] = scanner.nextInt();
                        }
                    break;
                case 3:
                    if (scores != null)
                        for (int i = 0; i < scores.length; i++)
                            System.out.printf("scores[%d]: %d\n", i, scores[i]);
                    break;
                case 4:
                    int max = 0;
                    int sum = 0;
                    double avg;
                    if (scores != null) {
                        for (int score : scores) {
                            max = (max < score) ? score : max;
                            sum += score;
                        }
                        avg = (double)sum / scores.length;
                        System.out.println("최고 점수: " + max);
                        System.out.println("평균 점수: " + avg);
                    }
                    break;
                case 5:
                    run = false;
            }
        }
        System.out.println("프로그램 종료");
    }
}
