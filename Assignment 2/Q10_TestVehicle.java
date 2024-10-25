class Vehicle {
    protected String regnNumber, speed, color, ownerName;
    Vehicle(String r, String s, String c, String o) {
        regnNumber = r;
        speed = s;
        color = c;
        ownerName = o;
    }
    void showData() {
        System.out.println("This is a vehicle class");
    }
}

class Bus extends Vehicle {
    private String routeNumber;
    Bus(String r, String s, String c, String o, String rt) {
        super(r, s, c, o);
        routeNumber = rt;
    }
    void showData() {
        super.showData();
        System.out.println("Route Number: " + routeNumber + " Registration: " + regnNumber + " Speed: " + speed + " Color: " + color + " Owner: " + ownerName);
    }
}

class Car extends Vehicle {
    private String manufacturerName;
    Car(String r, String s, String c, String o, String m) {
        super(r, s, c, o);
        manufacturerName = m;
    }
    void showData() {
        super.showData();
        System.out.println("Manufacturer: " + manufacturerName + " Registration: " + regnNumber + " Speed: " + speed + " Color: " + color + " Owner: " + ownerName);
    }
}

public class Q10_TestVehicle {
    public static void main(String[] args) {
        Bus bus = new Bus("123", "60km/h", "Blue", "John", "45");
        Car car = new Car("456", "100km/h", "Red", "Jane", "Toyota");

        bus.showData();
        car.showData();
    }
}
