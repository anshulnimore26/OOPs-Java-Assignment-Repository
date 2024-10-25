class TooHot extends Exception {
    TooHot(String message) {
        super(message);
    }
}
class TooCold extends Exception {
    TooCold(String message) {
        super(message);
    }
}
public class Q23_TemperatureCheck {
    public static void main(String[] args) {
        try {
            int temp = Integer.parseInt(args[0]);
            if (temp > 35) throw new TooHot("Temperature too hot");
            if (temp < 5) throw new TooCold("Temperature too cold");
            System.out.println("Normal temperature. Fahrenheit: " + (temp * 9 / 5 + 32));
        } catch (TooHot | TooCold e) {
            System.out.println(e.getMessage());
        }
    }
}
