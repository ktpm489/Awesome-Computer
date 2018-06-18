package in2017_WinterVacation;

import java.util.HashMap;
import java.util.Scanner;

public class C7100405 {
    public static void main(String[] args) {
        HashMap<String, Location> hashMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        double lat, lng;
        String name;
        for (int i = 0; i < 5; i++) {
            System.out.print("Name : ");
            name = scanner.next();
            System.out.print("Latitude : ");
            lat = scanner.nextDouble();
            System.out.print("Longitude : ");
            lng = scanner.nextDouble();

            hashMap.put(name, new Location(lat, lng));
        }

        System.out.println();

        Location tmp;
        for(int i = 0; i < 5; i++) {
            System.out.print("Name : ");
            name = scanner.next();
            tmp = hashMap.get(name);

            System.out.println(tmp.getLat() + "," + tmp.getLng());
        }
    }
}

class Location {
    private double lat;
    private double lng;

    Location(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }
}
