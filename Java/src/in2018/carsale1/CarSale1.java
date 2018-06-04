package in2018.carsale1;

class CardDealer {
    final int PRICE = 3500;
    String carName = "Grandeur";
    private int inventory = 10;
    private int account = 0;

    public boolean carSale(int money) {
        boolean receipt;
        account += money;
        inventory -= 1;
        receipt = true;
        return receipt;
    }

    public void saleResult() {
        System.out.println("현재 재고는 " + inventory + "대 이며 판매액은 " + account + "입니다.");
    }
}

class CarBuyer {
    private int money = 5000;
    private boolean owner = false;

    public void buyCar(CardDealer dealer, int price) {
        owner = dealer.carSale(price);
        money -= price;
    }

    public void buyResult() {
        System.out.println("현재 차량 소유 상태는 " + owner + "이며 구매 후 잔약은 " + money + "만원입니다");
    }
}

public class CarSale1 {
    public static void main(String[] args) {
        CardDealer dealer = new CardDealer();
        CarBuyer buyer = new CarBuyer();

        buyer.buyCar(dealer, 3500);
        dealer.saleResult();
        buyer.buyResult();
    }
}
