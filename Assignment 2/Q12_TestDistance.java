class Distance {
    double distance;
    Distance(double d) {
        distance = d;
    }
    void travelTime() {
        System.out.println("Travel Time (miles): " + distance / 60 + " hours");
    }
}

class DistanceMKS extends Distance {
    DistanceMKS(double d) {
        super(d);
    }
    void travelTime() {
        System.out.println("Travel Time (kilometers): " + distance / 100 + " hours");
    }
}

public class Q12_TestDistance {
    public static void main(String[] args) {
        Distance d = new Distance(300);
        d.travelTime();

        DistanceMKS dmks = new DistanceMKS(300);
        dmks.travelTime();
    }
}
