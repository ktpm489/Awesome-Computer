package in2018.MOX;

class ScoreOX {
    private static final int[] CORRECT_ANSWER = new int[]{1, 1, 1, 1, 1};

    static int total;                     //전체 맞는 정답 수
    private int rank;                     //순위
    private int no;                       //번호
    private int cnt;                      //맞은 개수
    private int score;                    //점수
    private char[] c_ox;                  //o,x
    private String name;                  //이름
    private int[] answer;                 //입력한 답

    ScoreOX(int no, String name, int[] answer) {
        this.no = no;
        this.name = name;
        this.answer = answer;
        this.rank = 1;
        this.c_ox = new char[CORRECT_ANSWER.length];
    }

    static void Ranking(ScoreOX[] scoreOXs) {
        //for (ScoreOX scoreOX : scoreOXs) scoreOX.rank = CORRECT_ANSWER.length + 1 - scoreOX.cnt;
        for (int i = 0; i < CORRECT_ANSWER.length; i++)
            for (int j = 0; j < CORRECT_ANSWER.length; j++)
                if (scoreOXs[i].score > scoreOXs[j].score)
                    scoreOXs[j].rank++;
    }

    void display() {
        System.out.printf("%4d %3s %3c %3c %3c %3c %3c %7d %5d\n",
                this.no,
                this.name,
                this.c_ox[0],
                this.c_ox[1],
                this.c_ox[2],
                this.c_ox[3],
                this.c_ox[4],
                this.score,
                this.rank);
    }

    void compute() {
        for (int i = 0; i < CORRECT_ANSWER.length; i++) {
            if (CORRECT_ANSWER[i] == this.answer[i]) {
                this.c_ox[i] = 'O';
                this.cnt++;
                total++;
            } else
                this.c_ox[i] = 'X';
        }

        this.score = this.cnt * 20;
    }
}

public class MOX {
    public static void main(String[] args) {
        ScoreOX[] people = new ScoreOX[]{
                new ScoreOX(1, "루리", new int[]{1, 2, 1, 3, 4}),
                new ScoreOX(2, "루세", new int[]{1, 1, 1, 1, 1}),
                new ScoreOX(3, "루모", new int[]{1, 2, 1, 3, 1}),
                new ScoreOX(4, "폴리", new int[]{1, 1, 1, 3, 1}),
                new ScoreOX(5, "밀로", new int[]{1, 4, 2, 5, 4})
        };

        for (ScoreOX stu : people)
            stu.compute();

        ScoreOX.Ranking(people);

        System.out.println("*  * 시험결과 *  *\n");
        System.out.println("---------------------------------------------");
        System.out.println("번호   이름   1   2   3   4   5     점수   등수");
        System.out.println("---------------------------------------------");
        for (ScoreOX stu : people)
            stu.display();
        System.out.println("\n전체맞은 개수 = " + ScoreOX.total);
    }
}
