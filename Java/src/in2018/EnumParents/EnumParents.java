package in2018.EnumParents;

enum Parents {FATHER, MOTHER}

public class EnumParents {
    public static void printParents(Parents p) {
        System.out.println(p);
    }

    public static void print(Parents p) {
        switch (p) {
            case FATHER:
                System.out.println("아빠");
                break;
            case MOTHER:
                System.out.println("엄마");
                break;
            default:
                System.out.println("부모님 중 한분만");
                break;
        }
    }

    public static void main(String[] args) {
        printParents(Parents.MOTHER);
        print(Parents.FATHER);
        print(Parents.MOTHER);

        for(Parents p : Parents.values()) {
            System.out.println("내부 데이터 : " + p);
        }
    }
}
