package in2018.InstanceOfEx;

interface Vehicle {
    void run();
}


class Taxi implements Vehicle {
    @Override
    public void run() {
        System.out.println("택시 부릉부릉");
    }
}

class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("버스 부릉부릉");
    }

    void checkFare() {
        System.out.println("확인");
    }
}

class Driver {
    void drive(Vehicle vehicle){
        if (vehicle instanceof Bus)
            ((Bus) vehicle).checkFare();
        vehicle.run();
    }
}

public class InstanceOfEx {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Taxi taxi = new Taxi();
        Bus bus = new Bus();

        driver.drive(taxi);
        driver.drive(bus);
    }
}
