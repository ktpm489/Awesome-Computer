package in2018.UseEnum;

enum Bread {
    DANPAT(500), CREAMPUFF(800), SOBORO(500);

    private int price;
    Bread (int p) {
        price = p;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int p) {
        price = p;
    }
}

public class UseEnum {
    public static void main(String[] args) {
        System.out.println("단팥빵의 가격 : " + Bread.DANPAT.getPrice());
        System.out.println("슈크림빵의 가격 : " + Bread.CREAMPUFF.getPrice());
        System.out.println("소보로빵의 가격 : " + Bread.SOBORO.getPrice());

        Bread.DANPAT.setPrice(600);
        System.out.println("단팥빵 가격 인상");
        System.out.println("다팥빵의 가격 : " + Bread.DANPAT.getPrice());

        Bread newBread = Bread.CREAMPUFF;
        System.out.println("새로 만든 빵 : " + newBread);
        System.out.println("새로 만든 빵의 가격 : " + newBread.getPrice());
    }
}
