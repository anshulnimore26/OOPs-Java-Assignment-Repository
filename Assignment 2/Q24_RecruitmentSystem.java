class TooOlder extends Exception {
    TooOlder(String message) {
        super(message);
    }
}
class TooYounger extends Exception {
    TooYounger(String message) {
        super(message);
    }
}
public class Q24_RecruitmentSystem {
    public static void main(String[] args) {
        try {
            String name = args[0];
            int age = Integer.parseInt(args[1]);
            if (age > 45) throw new TooOlder("Candidate too old");
            if (age < 20) throw new TooYounger("Candidate too young");
            System.out.println("Eligible: " + name);
        } catch (TooOlder | TooYounger e) {
            System.out.println(e.getMessage());
        }
    }
}
