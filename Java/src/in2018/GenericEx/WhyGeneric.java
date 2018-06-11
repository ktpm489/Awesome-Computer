package in2018.GenericEx;

class Electronic {
    String name = "전자제품";
    String status;

    Electronic(String status) {
        this.status = status;
    }

    void currentState() {
        System.out.println(name + " " + status + " 입니다");
    }
}

class Food {
    String name = "식물";
    String status;

    Food(String status) {
        this.status = status;
    }

    void currentState() {
        System.out.println(name + " " + status + " 입니다");
    }
}

/*class GoodsShip {
    Object goods;

    void boxing(Object goods) {
        this.goods = goods;
    }

    Object unBoxing() {
        return goods;
    }
}*/

class GoodsShip<T> {
    T goods;

    void boxing(T goods) {
        this.goods = goods;
    }

    T unBoxing() {
        return goods;
    }
}

public class WhyGeneric {
    public static void main(String[] args) {
        GoodsShip<Electronic> gs1 = new GoodsShip<>();
        gs1.boxing(new Electronic("배송시작"));
        Electronic e1 = gs1.unBoxing();
        e1.currentState();

        GoodsShip<Food> gs2 = new GoodsShip<>();
        gs2.boxing(new Food("음식"));
        Food f1 = gs2.unBoxing();     //StringClass cannot be cast to FoodClass
        f1.currentState();
    }
}
