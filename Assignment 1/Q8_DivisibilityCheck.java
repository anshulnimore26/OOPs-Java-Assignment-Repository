import java.util.Scanner;
public class Q8_DivisibilityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), divisor = sc.nextInt();
        System.out.println(num % divisor == 0 ? "Divisible" : "Not Divisible");
    }
}
