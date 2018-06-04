package in2018.Coffee;

public class Coffee {
    public static void main(String[] args) {
        Buyer buyer = new Buyer(1000);

        buyer.setMoney(buyer.getMoney() + 5600);
    }
}

class VendingMachine {

}

class Buyer {
    private int money;

    Buyer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}