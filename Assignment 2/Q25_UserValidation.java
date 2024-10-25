class InvalidCredentialsException extends Exception {
    InvalidCredentialsException(String message) {
        super(message);
    }
}
public class Q25_UserValidation {
    public static void main(String[] args) {
        try {
            String username = args[0];
            String password = args[1];
            if (username.length() < 6) throw new InvalidCredentialsException("Username too short");
            if (!password.equals("password123")) throw new InvalidCredentialsException("Password mismatch");
            System.out.println("Login successful");
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
        }
    }
}
