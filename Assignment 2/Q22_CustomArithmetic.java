class DivisionException extends Exception {
    DivisionException(String message) {
        super(message);
    }
}
public class Q22_CustomArithmetic {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            if (b == 0) throw new DivisionException("Division by zero error");
            System.out.println(a / b);
        } catch (DivisionException e) {
            System.out.println(e.getMessage());
        }
    }
}
