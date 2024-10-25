import java.util.HashMap;
class NoMatchFoundException extends Exception {
    NoMatchFoundException(String message) {
        super(message);
    }
}
public class Q21_CountryCapital {
    public static void main(String[] args) {
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("India", "New Delhi");
        capitals.put("USA", "Washington D.C.");
        try {
            String country = args[0];
            if (!capitals.containsKey(country)) {
                throw new NoMatchFoundException("No capital found for " + country);
            }
            System.out.println("Capital of " + country + " is " + capitals.get(country));
        } catch (NoMatchFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
