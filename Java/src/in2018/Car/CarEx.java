package in2018.Car;

class Car {
    String com = "현대자동차";
    private String model;
    private String color;
    private int maxSpeed;
    int speed;

    Car(String model) {
        this(model, null, 0);
    }

    Car(String model, String color) {
        this(model, color, 0);
    }

    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}

public class CarEx {
    public static void main(String[] args) {

    }
}
